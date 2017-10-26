package com.euroland.webapi.controllers;

import com.euroland.webapi.helpers.SequenceHelper;
import com.euroland.webapi.models.Financial;
import com.euroland.webapi.models.FinancialDetail;
import com.euroland.webapi.models.ResponseBase;
import com.euroland.webapi.repositories.IFinancialRepository;
import euroland.ai.service.CommandArgumentModelLocator;
import euroland.ai.service.CommandFinancialArgumentClassifier;
import jmdn.base.util.string.StrUtil;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/financials")
public class FinancialController {

    private final String DATE_TIME_FORMAT = "yyyy-MM-dd";
    private IFinancialRepository financialRepository;

    public FinancialController(IFinancialRepository financialRepository) {
        this.financialRepository = financialRepository;
    }

    @GetMapping("/all")
    public List<Financial> getAll() {
        List<Financial> financials = this.financialRepository.findAll();
        return financials;
    }

    @PutMapping
    public void insert(@RequestBody Financial financial) {
        this.financialRepository.insert(financial);
    }

    @PostMapping
    public void update(@RequestBody Financial financial) {
        this.financialRepository.save(financial);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable("id") String id) {
        this.financialRepository.delete(id);
    }

    @GetMapping("/{name}")
    public Financial getByName(@PathVariable("name") String name) {
        Financial financial = this.financialRepository.findByName(name);
        return financial;
    }

    @GetMapping("/financial/{name}/{year}")
    public Financial getByNameAndDate(@PathVariable("name") String name, @PathVariable("year") int year) {
        Financial financial = this.financialRepository.findByNameAndDateTime(name, year);
        return financial;
    }

    @GetMapping("/financial/{name}/{company}")
    public Financial getByNameAndCompany(@PathVariable("name") String name, @PathVariable("company") String company) {
        Financial financial = this.financialRepository.findByNameAndCompany(name, company);
        return financial;
    }

    @GetMapping("/financial/{name}/{year}/{company}")
    public Financial getByNameAndDateAndCompany(@PathVariable("name") String name, @PathVariable("year") int year, @PathVariable("company") String company) {
        Financial financial = this.financialRepository.findByNameAndDateCompany(name, year, company);
        return financial;
    }

    @GetMapping("/company/{name}")
    public List<Financial> getByCompany(@PathVariable("name") String name) {
        List<Financial> financials = this.financialRepository.findByCompany(name);
        return financials;
    }

    @GetMapping("/ask/{question}")
    public ResponseBase getAnswer(@PathVariable("question") String question) {
        double result = 0;

        List<String> messages = new ArrayList<String>();
        List<String> arguments = new ArrayList<String>();
        String answer = "";
        String message = "";
        String currency = "";
        String tagLabeled = "";
        String argumentAspect = "";
        String argumentOrganization = "";
        String argumentDateTime = "";
        String argumentOrder = "";
        String argumentIntend = "";
        String argumentOperator = "";
        String unit = "millions";

        if (question != null && !question.isEmpty()) {
            // normalize question
            question = StrUtil.normalizeString(question);

            // initialize command argument classifier
            CommandFinancialArgumentClassifier commandArgumentClassifier = new CommandFinancialArgumentClassifier(
                    CommandArgumentModelLocator.getModelLocation("commandFinnancialArgumentClassificationModel"));
            commandArgumentClassifier.init();

            // do classification the question
            List<String> tags = commandArgumentClassifier.doCommandArgumentClassification(question);

            // display the labeled which is recognized by the model
            tagLabeled = StrUtil.join(tags);

            // processing arguments
            if (tags.size() > 0) {
                String defaultOrganization = "CARLSBERG";
                String defaultOperator = "over";

                String aspect = "";//SequenceHelper.getAspect(question, tags);
                List<String> aspects = SequenceHelper.getListAspect(question,tags);
                String datetime = "";//SequenceHelper.getDatetimePhrase(question, tags);
                List<String> datetimes = SequenceHelper.getListDatetimePhrase(question,tags);
                String organizationName = SequenceHelper.getOrganizationName(question, tags);
                String order = SequenceHelper.getOrder(question, tags);
                String intend = SequenceHelper.getIntend(question, tags);
                String operator = SequenceHelper.getOperator(question, tags);
                String figuresIn = "";

                if (organizationName == null || organizationName.isEmpty()) {
                    organizationName = defaultOrganization;
                }

                if (aspects == null || aspects.size()<=0) {
                    message = "Your question is pretty general. Please enter the question a little bit more specific.";
                    messages.add(message);
                } else {
                    if(aspects.size() ==1){
                        //normal case
                        aspect = aspects.get(0);
                    }else{
                        if(operator == null || operator.isEmpty()){
                            operator = defaultOperator;
                        }
                        //special case
                        for (int i = 0; i < aspects.size(); i++) {
                            aspect += aspects.get(i) + " "+ operator;
                        }
                        aspect = aspect.substring(0,aspect.lastIndexOf(operator));
                    }
                    aspect = aspect.trim().toLowerCase();
                    argumentAspect = "aspect: " + StrUtil.join(aspects,",");
                    //process some special case such as: financial synonym or take an financial concept to ask other financial concept
                    String grossMargin = "gross margin";
                    String grossMarginConcept1 = "revenue generated gross profit";
                    String grossMarginConcept2 = "gross profit over revenue";
                    String grossMarginConcept3 = "gross profit divided net sales";
                    String grossMarginConcept4 = "gross profit over net sales";
                    String grossMarginConcept5 = "revenue over gross profit";
                    if(aspect.equals(grossMarginConcept1) || aspect.equals(grossMarginConcept2) || aspect.equals(grossMarginConcept3)
                    || aspect.equals(grossMarginConcept4) || aspect.equals(grossMarginConcept5))
                        aspect = grossMargin;

                    String netIncome = "net income";
                    String netIncomeConcept1 = "net profit";
                    String netIncomeConcept2 = "total income";
                    if(aspect.equals(netIncomeConcept1) || aspect.equals(netIncomeConcept2))
                        aspect = netIncome;

                    String roa = "return on assets";
                    if(aspect.equals("roa"))
                        aspect = roa;
                    String roe = "return on equity";
                    if(aspect.equals("roe"))
                        aspect = roe;

                    String dateArgumentOriginal = "";
                    String lastYear="last year";
                    if (datetimes == null || datetimes.size()<=0) {
                        datetime = Integer.toString(SequenceHelper.dateTime5);
                        dateArgumentOriginal = datetime;
                    } else {
                        /*Query query = new Query();
                        query.addCriteria(Criteria.where("name").is(aspect).and("company.name").is(organizationName));*/
                        if(datetimes.size()==1){
                            datetime = datetimes.get(0);
                            dateArgumentOriginal = datetime;
                            if(datetime.equals(lastYear)){
                                //get max date time in db then subtract 1
                                datetime = Integer.toString(SequenceHelper.dateTime4);
                            }

                        }else {
                            dateArgumentOriginal = StrUtil.join(datetimes,",");
                        }
                    }
                    argumentDateTime = "datetime: " + dateArgumentOriginal;
                    argumentOrder = "order: " + order;
                    argumentIntend = "intend: " + intend;
                    argumentOperator = "operator: " + operator;
                    argumentOrganization = "organization: " + organizationName;

                    List<Financial> financials = this.financialRepository.findByCompany(organizationName.toUpperCase());
                        /*Financial financial = this.financialRepository.findByNameAndCompany(aspect,organizationName);*/
                    if (financials != null && financials.size() > 0) {
                        for (Financial financial : financials) {
                            if(financial.getName().toLowerCase().equals(aspect.toLowerCase())){
                                Financial financialResult = financial;
                                if (financialResult != null) {
                                    String resultValue="";
                                    currency = financialResult.getCompany().getCurrency();
                                    List<FinancialDetail> financialDetails = financialResult.getFinancialDetails();
                                    if (financialDetails != null && financialDetails.size() > 0) {
                                        for (FinancialDetail financialDetail : financialDetails) {
                                            if(datetime!=null && !datetime.isEmpty()){
                                                int date = Integer.parseInt(datetime);
                                                if (financialDetail.getYear() == date) {
                                                    result = financialDetail.getFinancialValue();
                                                    resultValue = ""+result;
                                                }
                                            }else if(datetimes!=null && datetimes.size()>0){
                                                for (String datetimeItem: datetimes) {
                                                    int date = Integer.parseInt(datetimeItem);
                                                    if (financialDetail.getYear() == date) {
                                                        result = financialDetail.getFinancialValue();
                                                        resultValue += result + " and";
                                                        resultValue = resultValue.substring(0,resultValue.lastIndexOf("and"));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if(intend == null || intend.isEmpty()){
                                        figuresIn = " "+unit + " " + currency;
                                    }
                                    else if(intend!=null && !intend.isEmpty()){
                                        figuresIn = " " + currency;
                                    }
                                    if(datetime.isEmpty() && datetimes.size()>0)
                                        datetime = StrUtil.join(datetimes,",");
                                    if(result!=0)
                                        answer = "The " + aspect + " in " + datetime + " of the "+ organizationName +" is: " + resultValue + figuresIn;
                                    else
                                        answer = "The " + aspect + " in " + datetime + " of the "+ organizationName +" had no data available";
                                }
                            }
                            //Financial financialResult = this.financialRepository.findByName(aspect.toLowerCase());
                        }
                    }
                }
            }else {
                message = "The question had no specific intent!";
                messages.add(message);
            }

        } else {
            message = "No question available!";
            messages.add(message);
        }
        arguments.add(argumentAspect);
        arguments.add(argumentOrganization);
        arguments.add(argumentDateTime);
        arguments.add(argumentOrder);
        arguments.add(argumentIntend);
        arguments.add(argumentOperator);

        ResponseBase responseBase = new ResponseBase(question,arguments,answer,messages);
        responseBase.setAnswer(answer);

        return responseBase;
    }
}
