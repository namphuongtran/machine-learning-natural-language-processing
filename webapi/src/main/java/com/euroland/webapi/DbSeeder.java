package com.euroland.webapi;

import com.euroland.webapi.models.Company;
import com.euroland.webapi.models.Financial;
import com.euroland.webapi.models.FinancialDetail;
import com.euroland.webapi.repositories.IFinancialRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{

    private IFinancialRepository financialRepository;

    public DbSeeder(IFinancialRepository financialRepository) {
        this.financialRepository = financialRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        String dateTimeFormat="yyyy-MM-dd";
        int dateTime1=2012;
        int dateTime2=2013;
        int dateTime3=2014;
        int dateTime4=2015;
        int dateTime5=2016;

        Financial revenue = new Financial(
                "revenue",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                    new FinancialDetail(67201,dateTime1),
                    new FinancialDetail(66552,dateTime2),
                    new FinancialDetail(64506,dateTime3),
                    new FinancialDetail(65354,dateTime4),
                    new FinancialDetail(62614,dateTime5)
                )
        );

        Financial costOfRevenue = new Financial(
                "cost of revenue",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(33831,dateTime1),
                        new FinancialDetail(33622,dateTime2),
                        new FinancialDetail(32725,dateTime3),
                        new FinancialDetail(33429,dateTime4),
                        new FinancialDetail(31195,dateTime5)
                )
        );


        Financial grossOperatingProfit = new Financial(
                "gross operating profit",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(33370,dateTime1),
                        new FinancialDetail(32930,dateTime2),
                        new FinancialDetail(31781,dateTime3),
                        new FinancialDetail(31925,dateTime4),
                        new FinancialDetail(31419,dateTime5)
                )
        );

        Financial salesGeneralAndAdministrative = new Financial(
                "sales, general and administrative",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(23830,dateTime1),
                        new FinancialDetail(23219,dateTime2),
                        new FinancialDetail(23328,dateTime3),
                        new FinancialDetail(24067,dateTime4),
                        new FinancialDetail(3696,dateTime5)
                )
        );

        Financial otherOperatingExpenses = new Financial(
                "other operating expenses",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(-253,dateTime1),
                        new FinancialDetail(-133,dateTime2),
                        new FinancialDetail(-777,dateTime3),
                        new FinancialDetail(-599,dateTime4),
                        new FinancialDetail(-522,dateTime5)
                )
        );

        Financial totalOperatingExpenses = new Financial(
                "total operating expenses",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(23577,dateTime1),
                        new FinancialDetail(23086,dateTime2),
                        new FinancialDetail(22551,dateTime3),
                        new FinancialDetail(23468,dateTime4),
                        new FinancialDetail(23174,dateTime5)
                )
        );

        Financial operatingIncomeBeforeInterestAndTaxes = new Financial(
                "operating income before interest and taxes",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(9793,dateTime1),
                        new FinancialDetail(9844,dateTime2),
                        new FinancialDetail(9230,dateTime3),
                        new FinancialDetail(8457,dateTime4),
                        new FinancialDetail(8245,dateTime5)
                )
        );

        Financial nonOperatingIncome = new Financial(
                "non-operating income",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(-1687,dateTime1),
                        new FinancialDetail(-1999,dateTime2),
                        new FinancialDetail(-2544,dateTime3),
                        new FinancialDetail(-10190,dateTime4),
                        new FinancialDetail(-966,dateTime5)
                )
        );

        Financial incomeBeforeIncomeTaxes = new Financial(
                "income before income taxes",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(8106,dateTime1),
                        new FinancialDetail(7845,dateTime2),
                        new FinancialDetail(6686,dateTime3),
                        new FinancialDetail(-1733,dateTime4),
                        new FinancialDetail(7249,dateTime5)
                )
        );

        Financial provisionForIncomeTaxes = new Financial(
                "provision for income taxes",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(1861,dateTime1),
                        new FinancialDetail(1894,dateTime2),
                        new FinancialDetail(1748,dateTime3),
                        new FinancialDetail(849,dateTime4),
                        new FinancialDetail(2392,dateTime5)
                )
        );

        Financial netIncomeFromContinuingOperations = new Financial(
                "net income from continuing operations",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(6245,dateTime1),
                        new FinancialDetail(5951,dateTime2),
                        new FinancialDetail(4938,dateTime3),
                        new FinancialDetail(-2582,dateTime4),
                        new FinancialDetail(4857,dateTime5)
                )
        );

        Financial netIncome = new Financial(
                "net income",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(5607,dateTime1),
                        new FinancialDetail(5471,dateTime2),
                        new FinancialDetail(4414,dateTime3),
                        new FinancialDetail(-2926,dateTime4),
                        new FinancialDetail(4486,dateTime5)
                )
        );

        Financial netIncomeAvailableForCommonShareholders = new Financial(
                "net income available for common shareholders",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(5607,dateTime1),
                        new FinancialDetail(5471,dateTime2),
                        new FinancialDetail(4414,dateTime3),
                        new FinancialDetail(-2926,dateTime4),
                        new FinancialDetail(4486,dateTime5)
                )
        );


        Financial cashAndCashEquivalents = new Financial(
                "cash and cash equivalents",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(5760,dateTime1),
                        new FinancialDetail(3714,dateTime2),
                        new FinancialDetail(2418,dateTime3),
                        new FinancialDetail(3131,dateTime4),
                        new FinancialDetail(3502,dateTime5)
                )
        );

        Financial shortTermInvestments = new Financial(
                "short-term investments",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(21,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)
                )
        );

        Financial totalCashCashEquivalentsAndShortTermInvestments = new Financial(
                "total cash, cash equivalents, and short-term investments",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(5781,dateTime1),
                        new FinancialDetail(3714,dateTime2),
                        new FinancialDetail(2418,dateTime3),
                        new FinancialDetail(3131,dateTime4),
                        new FinancialDetail(3502,dateTime5)
                )
        );

        Financial grossMargin = new Financial(
                "gross margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(4966,dateTime1),
                        new FinancialDetail(4948,dateTime2),
                        new FinancialDetail(4927,dateTime3),
                        new FinancialDetail(4885,dateTime4),
                        new FinancialDetail(5018,dateTime5)
                )
        );

        Financial totalCurrentAssets = new Financial(
                "total current assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(21135.00,dateTime1),
                        new FinancialDetail(20134.00,dateTime2),
                        new FinancialDetail(18643.00,dateTime3),
                        new FinancialDetail(17076.00,dateTime4),
                        new FinancialDetail(16853.00,dateTime5)
                )
        );

        Financial accountsReceivable = new Financial(
                "accounts receivable",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(7828.00,dateTime1),
                        new FinancialDetail(7888.00,dateTime2),
                        new FinancialDetail(6872.00,dateTime3),
                        new FinancialDetail(5729.00,dateTime4),
                        new FinancialDetail(5485.00,dateTime5)
                )
        );


        Financial intangibles = new Financial(
                "intangibles",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(91216.00,dateTime1),
                        new FinancialDetail(91895.00,dateTime2),
                        new FinancialDetail(81754.00,dateTime3),
                        new FinancialDetail(72920.00,dateTime4),
                        new FinancialDetail(76736.00,dateTime5)
                )
        );

        Financial deferredIncomeTaxes = new Financial(
                "Deferred Income Taxes",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(1170.00,dateTime1),
                        new FinancialDetail(1175.00,dateTime2),
                        new FinancialDetail(1430.00,dateTime3),
                        new FinancialDetail(1697.00,dateTime4),
                        new FinancialDetail(1610.00,dateTime5)
                )
        );

        Financial inventory = new Financial(
                "inventory",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(4541.00,dateTime1),
                        new FinancialDetail(4762.00,dateTime2),
                        new FinancialDetail(4498.00,dateTime3),
                        new FinancialDetail(3817.00,dateTime4),
                        new FinancialDetail(3963.00,dateTime5)
                )
        );

        Financial otherCurrentAssets = new Financial(
                "other current assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(2985.00,dateTime1),
                        new FinancialDetail(3770.00,dateTime2),
                        new FinancialDetail(4855.00,dateTime3),
                        new FinancialDetail(4399.00,dateTime4),
                        new FinancialDetail(3903.00,dateTime5)
                )
        );

        Financial otherLongTermAssets = new Financial(
                "other long-term assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(8453.00,dateTime1),
                        new FinancialDetail(4452.00,dateTime2),
                        new FinancialDetail(6408.00,dateTime3),
                        new FinancialDetail(6530.00,dateTime4),
                        new FinancialDetail(5897.00,dateTime5)
                )
        );

        Financial totalNonCurrentAssets = new Financial(
                "total non-current assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(132830.00,dateTime1),
                        new FinancialDetail(131004.00,dateTime2),
                        new FinancialDetail(118340.00,dateTime3),
                        new FinancialDetail(107825.00,dateTime4),
                        new FinancialDetail(110053.00,dateTime5)
                )
        );

        Financial totalAssets = new Financial(
                "total assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(153965.00,dateTime1),
                        new FinancialDetail(151138.00,dateTime2),
                        new FinancialDetail(136983.00,dateTime3),
                        new FinancialDetail(124901.00,dateTime4),
                        new FinancialDetail(126906.00,dateTime5)
                )
        );

        Financial totalCurrentLiabilities = new Financial(
                "total current liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(27535.00,dateTime1),
                        new FinancialDetail(34391.00,dateTime2),
                        new FinancialDetail(26523.00,dateTime3),
                        new FinancialDetail(29759.00,dateTime4),
                        new FinancialDetail(34135.00,dateTime5)
                )
        );

        Financial capitalExpenditure = new Financial(
                "capital expenditure",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(-5073,dateTime1),
                        new FinancialDetail(-5806,dateTime2),
                        new FinancialDetail(-5908,dateTime3),
                        new FinancialDetail(-4150,dateTime4),
                        new FinancialDetail(-3840,dateTime5)
                )
        );

        Financial totalNonCurrentLiabilities = new Financial(
                "total non-current liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(56169.00,dateTime1),
                        new FinancialDetail(48936.00,dateTime2),
                        new FinancialDetail(58023.00,dateTime3),
                        new FinancialDetail(51653.00,dateTime4),
                        new FinancialDetail(41960.00,dateTime5)
                )
        );

        Financial totalLiabilities = new Financial(
                "total liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(83704.00,dateTime1),
                        new FinancialDetail(83327.00,dateTime2),
                        new FinancialDetail(84546.00,dateTime3),
                        new FinancialDetail(81412.00,dateTime4),
                        new FinancialDetail(76095.00,dateTime5)
                )
        );


        Financial totalStockholdersEquity = new Financial(
                "total stockholders' equity",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(70261.00,dateTime1),
                        new FinancialDetail(67811.00,dateTime2),
                        new FinancialDetail(52437.00,dateTime3),
                        new FinancialDetail(43489.00,dateTime4),
                        new FinancialDetail(50811.00,dateTime5)
                )
        );

        Financial totalLiabilitiesAndStockholdersEquity = new Financial(
                "total liabilities and stockholders' equity",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(153965.00,dateTime1),
                        new FinancialDetail(151138.00,dateTime2),
                        new FinancialDetail(136983.00,dateTime3),
                        new FinancialDetail(124901.00,dateTime4),
                        new FinancialDetail(126906.00,dateTime5)
                )
        );

        Financial netCashProvidedByOperatingActivities = new Financial(
                "net cash provided by operating activities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(9871.00,dateTime1),
                        new FinancialDetail(9083.00,dateTime2),
                        new FinancialDetail(7405.00,dateTime3),
                        new FinancialDetail(10140.00,dateTime4),
                        new FinancialDetail(9329.00,dateTime5)
                )
        );

        Financial netCashUsedForInvestingActivities = new Financial(
                "net cash used for investing activities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(-3974.00,dateTime1),
                        new FinancialDetail(-8883.00,dateTime2),
                        new FinancialDetail(-6735.00,dateTime3),
                        new FinancialDetail(-2618.00,dateTime4),
                        new FinancialDetail(-713.00,dateTime5)
                )
        );

        Financial netCashProvidedByUsedForFinancingActivities = new Financial(
                "net cash provided by (used for) financing activities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(-3589.00,dateTime1),
                        new FinancialDetail(-1778.00,dateTime2),
                        new FinancialDetail(-1815.00,dateTime3),
                        new FinancialDetail(-6575.00,dateTime4),
                        new FinancialDetail(-9205.00,dateTime5)
                )
        );

        Financial freeCashFlow = new Financial(
                "free cash flow",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(4798.00,dateTime1),
                        new FinancialDetail(3277.00,dateTime2),
                        new FinancialDetail(1497.00,dateTime3),
                        new FinancialDetail(5990.00,dateTime4),
                        new FinancialDetail(5489.00,dateTime5)
                )
        );

        Financial operatingCashFlow = new Financial(
                "operating cash flow",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(9871.00,dateTime1),
                        new FinancialDetail(9083.00,dateTime2),
                        new FinancialDetail(7405.00,dateTime3),
                        new FinancialDetail(10140.00,dateTime4),
                        new FinancialDetail(9329.00,dateTime5)
                )
        );


        Financial netChangeInCash = new Financial(
                "net change in cash",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(2308.00,dateTime1),
                        new FinancialDetail(-1578.00,dateTime2),
                        new FinancialDetail(-1145.00,dateTime3),
                        new FinancialDetail(947.00,dateTime4),
                        new FinancialDetail(-589.00,dateTime5)
                )
        );

        Financial operatingMargin = new Financial(
                "operating margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(14.57,dateTime1),
                        new FinancialDetail(14.79,dateTime2),
                        new FinancialDetail(14.31,dateTime3),
                        new FinancialDetail(12.94,dateTime4),
                        new FinancialDetail(13.17,dateTime5)
                )
        );

        Financial ebtMargin = new Financial(
                "ebt margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(12.06,dateTime1),
                        new FinancialDetail(11.79,dateTime2),
                        new FinancialDetail(10.36,dateTime3),
                        new FinancialDetail(-2.65,dateTime4),
                        new FinancialDetail(11.58,dateTime5)
                )
        );


        Financial taxRate = new Financial(
                "tax rate",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(2.77,dateTime1),
                        new FinancialDetail(2.85,dateTime2),
                        new FinancialDetail(2.71,dateTime3),
                        new FinancialDetail(1.30,dateTime4),
                        new FinancialDetail(3.82,dateTime5)
                )
        );

        Financial netMargin = new Financial(
                "net margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(8.34,dateTime1),
                        new FinancialDetail(8.22,dateTime2),
                        new FinancialDetail(6.84,dateTime3),
                        new FinancialDetail(-4.48,dateTime4),
                        new FinancialDetail(7.16,dateTime5)
                )
        );

        Financial returnOnAssets = new Financial(
                "return on assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(3.72,dateTime1),
                        new FinancialDetail(3.59,dateTime2),
                        new FinancialDetail(3.06,dateTime3),
                        new FinancialDetail(-2.23,dateTime4),
                        new FinancialDetail(3.56,dateTime5)
                )
        );

        Financial returnOnEquity = new Financial(
                "return on equity",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(
                        new FinancialDetail(8.24,dateTime1),
                        new FinancialDetail(7.92,dateTime2),
                        new FinancialDetail(7.34,dateTime3),
                        new FinancialDetail(-6.10,dateTime4),
                        new FinancialDetail(9.51,dateTime5)
                )
        );

        Financial securitasRevenue = new Financial(
                "revenue",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(66458.20,dateTime1),
                        new FinancialDetail(65700.10,dateTime2),
                        new FinancialDetail(70217.10,dateTime3),
                        new FinancialDetail(80860.10,dateTime4),
                        new FinancialDetail(88162.40,dateTime5)
                )
        );

        Financial securitasCostOfRevenue = new Financial(
                "cost of revenue",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(55360,dateTime1),
                        new FinancialDetail(54276.60,dateTime2),
                        new FinancialDetail(58010.10,dateTime3),
                        new FinancialDetail(66743.20,dateTime4),
                        new FinancialDetail(72686.80,dateTime5)
                )
        );

        Financial securitasGrossOperatingProfit = new Financial(
                "gross operating profit",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(11098.20,dateTime1),
                        new FinancialDetail(11423.50,dateTime2),
                        new FinancialDetail(12207,dateTime3),
                        new FinancialDetail(14116.90,dateTime4),
                        new FinancialDetail(14475.60,dateTime5)
                )
        );

        Financial securitasSalesGeneralAndAdministrative = new Financial(
                "sales, general and administrative",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(8028.20,dateTime1),
                        new FinancialDetail(8112.40,dateTime2),
                        new FinancialDetail(8726.60,dateTime3),
                        new FinancialDetail(10063.20,dateTime4),
                        new FinancialDetail(10970.80,dateTime5)
                )
        );

        Financial securitasOtherOperatingExpenses = new Financial(
                "other operating expenses",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(458.30,dateTime1),
                        new FinancialDetail(8.90,dateTime2),
                        new FinancialDetail(-7.2,dateTime3),
                        new FinancialDetail(-5.5,dateTime4),
                        new FinancialDetail(63.9,dateTime5)
                )
        );

        Financial securitasTotalOperatingExpenses = new Financial(
                "total operating expenses",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(8783.60,dateTime1),
                        new FinancialDetail(8395,dateTime2),
                        new FinancialDetail(8970.20,dateTime3),
                        new FinancialDetail(10332.20,dateTime4),
                        new FinancialDetail(11322.40,dateTime5)
                )
        );

        Financial securitasOperatingIncomeBeforeInterestAndTaxes = new Financial(
                "operating income before interest and taxes",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(2314.60,dateTime1),
                        new FinancialDetail(3028.50,dateTime2),
                        new FinancialDetail(3236.80,dateTime3),
                        new FinancialDetail(3784.70,dateTime4),
                        new FinancialDetail(4153.20,dateTime5)
                )
        );

        Financial securitasNonOperatingIncome = new Financial(
                "non-operating income",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(-573,dateTime1),
                        new FinancialDetail(-385,dateTime2),
                        new FinancialDetail(-327.60,dateTime3),
                        new FinancialDetail(-308.30,dateTime4),
                        new FinancialDetail(-389.60,dateTime5)
                )
        );

        Financial securitasIncomeBeforeIncomeTaxes = new Financial(
                "income before income taxes",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(1741.60,dateTime1),
                        new FinancialDetail(2643.50,dateTime2),
                        new FinancialDetail(2909.20,dateTime3),
                        new FinancialDetail(3476.40,dateTime4),
                        new FinancialDetail(3763.60,dateTime5)
                )
        );

        Financial securitasProvisionForIncomeTaxes = new Financial(
                "provision for income taxes",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(529.60,dateTime1),
                        new FinancialDetail(787.90,dateTime2),
                        new FinancialDetail(837.70,dateTime3),
                        new FinancialDetail(1032.50,dateTime4),
                        new FinancialDetail(1117.70,dateTime5)
                )
        );

        Financial securitasNetIncomeFromContinuingOperations = new Financial(
                "net income from continuing operations",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(1212.00,dateTime1),
                        new FinancialDetail(1855.60,dateTime2),
                        new FinancialDetail(2071.50,dateTime3),
                        new FinancialDetail(2443.90,dateTime4),
                        new FinancialDetail(2645.90,dateTime5)
                )
        );

        Financial securitaNetIncome = new Financial(
                "net income",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(1211.60,dateTime1),
                        new FinancialDetail(1852.50,dateTime2),
                        new FinancialDetail(2068.40,dateTime3),
                        new FinancialDetail(2436.50,dateTime4),
                        new FinancialDetail(2642,dateTime5)
                )
        );

        Financial securitasNetIncomeAvailableForCommonShareholders = new Financial(
                "net income available for common shareholders",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(1211.60,dateTime1),
                        new FinancialDetail(1852.50,dateTime2),
                        new FinancialDetail(2068.40,dateTime3),
                        new FinancialDetail(2436.50,dateTime4),
                        new FinancialDetail(2642.00,dateTime5)
                )
        );

        Financial securitasCashAndCashEquivalents = new Financial(
                "cash and cash equivalents",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(4880.70,dateTime1),
                        new FinancialDetail(4049.80,dateTime2),
                        new FinancialDetail(3425.10,dateTime3),
                        new FinancialDetail(2071.20,dateTime4),
                        new FinancialDetail(2414.50,dateTime5)
                )
        );

        Financial securitasShortTermInvestments = new Financial(
                "short-term investments",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(116.30,dateTime1),
                        new FinancialDetail(59.50,dateTime2),
                        new FinancialDetail(167.30,dateTime3),
                        new FinancialDetail(287.60,dateTime4),
                        new FinancialDetail(189.20,dateTime5)
                )
        );

        Financial securitasTotalCashCashEquivalentsAndShortTermInvestments = new Financial(
                "total cash, cash equivalents, and short-term investments",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(4997.00,dateTime1),
                        new FinancialDetail(4109.30,dateTime2),
                        new FinancialDetail(3592.40,dateTime3),
                        new FinancialDetail(2358.80,dateTime4),
                        new FinancialDetail(2603.70,dateTime5)
                )
        );

        Financial securitasGrossMargin = new Financial(
                "gross margin",
                new Company("SECURITAS","SEK","Stockholm","Sweden"),
                Arrays.asList(
                        new FinancialDetail(16.70,dateTime1),
                        new FinancialDetail(17.39,dateTime2),
                        new FinancialDetail(17.38,dateTime3),
                        new FinancialDetail(17.46,dateTime4),
                        new FinancialDetail(17.55,dateTime5)
                )
        );


        Financial ratioSGA = new Financial(
                "sg&a",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(35.46,dateTime1),
                        new FinancialDetail(34.89,dateTime2),
                        new FinancialDetail(36.16,dateTime3),
                        new FinancialDetail(36.83,dateTime4),
                        new FinancialDetail(37.84,dateTime5)));

        Financial ratioResearchanddevelopment = new Financial(
                "research and development",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));
        Financial ratioOperatingMargin = new Financial(
                "operating margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(14.57,dateTime1),
                        new FinancialDetail(14.79,dateTime2),
                        new FinancialDetail(14.31,dateTime3),
                        new FinancialDetail(12.94,dateTime4),
                        new FinancialDetail(13.17,dateTime5)));
        Financial ratioNetInt,IncandOther = new Financial(
                "net int, inc and other",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(26.64,dateTime1),
                        new FinancialDetail(26.58,dateTime2),
                        new FinancialDetail(24.67,dateTime3),
                        new FinancialDetail(10.29,dateTime4),
                        new FinancialDetail(24.75,dateTime5)));
        Financial ratioEBTMargin = new Financial(
                "ebt margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(12.06,dateTime1),
                        new FinancialDetail(11.79,dateTime2),
                        new FinancialDetail(10.36,dateTime3),
                        new FinancialDetail(02.65,dateTime4),
                        new FinancialDetail(11.58,dateTime5)));
        Financial ratioProfitability = new Financial(
                "profitability",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));
        Financial ratio = new Financial(
                "",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(2012,dateTime1),
                        new FinancialDetail(2013,dateTime2),
                        new FinancialDetail(2014,dateTime3),
                        new FinancialDetail(2015,dateTime4),
                        new FinancialDetail(2016,dateTime5)));
        Financial ratioTaxRate = new Financial(
                "tax rate",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(2.77,dateTime1),
                        new FinancialDetail(2.85,dateTime2),
                        new FinancialDetail(2.71,dateTime3),
                        new FinancialDetail(1.30,dateTime4),
                        new FinancialDetail(3.82,dateTime5)));
        Financial ratioNetMargin = new Financial(
                "net margin",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(8.34,dateTime1),
                        new FinancialDetail(8.22,dateTime2),
                        new FinancialDetail(6.84,dateTime3),
                        new FinancialDetail(04.48,dateTime4),
                        new FinancialDetail(7.16,dateTime5)));
        Financial ratioReturnonAssets = new Financial(
                "return on assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(3.72,dateTime1),
                        new FinancialDetail(3.59,dateTime2),
                        new FinancialDetail(3.06,dateTime3),
                        new FinancialDetail(02.23,dateTime4),
                        new FinancialDetail(3.56,dateTime5)));
        Financial ratioFinancialLeverage = new Financial(
                "financial leverage",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(2.19,dateTime1),
                        new FinancialDetail(2.23,dateTime2),
                        new FinancialDetail(2.61,dateTime3),
                        new FinancialDetail(2.87,dateTime4),
                        new FinancialDetail(2.5,dateTime5)));
        Financial ratioReturnonEquity = new Financial(
                "return on equity",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(8.24,dateTime1),
                        new FinancialDetail(7.92,dateTime2),
                        new FinancialDetail(7.34,dateTime3),
                        new FinancialDetail(06.1,dateTime4),
                        new FinancialDetail(9.51,dateTime5)));
        Financial ratioCompoundAnnualGrowthRates = new Financial(
                "compound annual growth rates",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));


        Financial ratioRevenueGrowthYearoverYear = new Financial(
                "year over year",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(5.73,dateTime1),
                        new FinancialDetail(00.97,dateTime2),
                        new FinancialDetail(03.07,dateTime3),
                        new FinancialDetail(1.31,dateTime4),
                        new FinancialDetail(04.19,dateTime5)));
        Financial ratioRevenueGrowth3YearAverage = new Financial(
                "3-year average",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(4.21,dateTime1),
                        new FinancialDetail(3.48,dateTime2),
                        new FinancialDetail(0.49,dateTime3),
                        new FinancialDetail(00.92,dateTime4),
                        new FinancialDetail(02.01,dateTime5)));
        Financial ratioRevenueGrowth5YearAverage = new Financial(
                "5-year average",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(8.47,dateTime1),
                        new FinancialDetail(2.11,dateTime2),
                        new FinancialDetail(1.67,dateTime3),
                        new FinancialDetail(1.71,dateTime4),
                        new FinancialDetail(00.3,dateTime5)));

        Financial ratioOperatingIncomeYearoverYear = new Financial(
                "year over year",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(00.23,dateTime1),
                        new FinancialDetail(0.52,dateTime2),
                        new FinancialDetail(06.24,dateTime3),
                        new FinancialDetail(08.37,dateTime4),
                        new FinancialDetail(02.51,dateTime5)));
        Financial ratioOperatingIncome3YearAverage = new Financial(
                "3-year average",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(6.35,dateTime1),
                        new FinancialDetail(01.33,dateTime2),
                        new FinancialDetail(02.03,dateTime3),
                        new FinancialDetail(04.77,dateTime4),
                        new FinancialDetail(05.74,dateTime5)));
        Financial ratioOperatingIncome5YearAverage = new Financial(
                "5-year average",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(20.21,dateTime1),
                        new FinancialDetail(13.79,dateTime2),
                        new FinancialDetail(2.54,dateTime3),
                        new FinancialDetail(03.77,dateTime4),
                        new FinancialDetail(03.43,dateTime5)));

        Financial ratioEarningspershareYearoverYear = new Financial(
                "year over year",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(8.9,dateTime1),
                        new FinancialDetail(02.72,dateTime2),
                        new FinancialDetail(019.33,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));
        Financial ratioEarningspershare3YearAverage = new Financial(
                "3-year average",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(15.86,dateTime1),
                        new FinancialDetail(0.66,dateTime2),
                        new FinancialDetail(05.1,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(06.27,dateTime5)));
        Financial ratioEarningspershare5YearAverage = new Financial(
                "5-year average",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(8.67,dateTime1),
                        new FinancialDetail(9.97,dateTime2),
                        new FinancialDetail(4.06,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(02.69,dateTime5)));
        Financial ratioCashFlow = new Financial(
                "cash flow",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));

        Financial ratioOperatingCashFlowGrowthYOY = new Financial(
                "operating cash flow growth-yoy",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(12.01,dateTime1),
                        new FinancialDetail(07.98,dateTime2),
                        new FinancialDetail(018.47,dateTime3),
                        new FinancialDetail(36.93,dateTime4),
                        new FinancialDetail(8,dateTime5)));
        Financial ratioFreeCashFlowGrowthYOY = new Financial(
                "free cash flow growth-yoy",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(7.87,dateTime1),
                        new FinancialDetail(031.7,dateTime2),
                        new FinancialDetail(054.32,dateTime3),
                        new FinancialDetail(300.13,dateTime4),
                        new FinancialDetail(08.36,dateTime5)));
        Financial ratioCapExasaofSales = new Financial(
                "cap ex as a % of sales",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(07.55,dateTime1),
                        new FinancialDetail(08.72,dateTime2),
                        new FinancialDetail(09.16,dateTime3),
                        new FinancialDetail(06.35,dateTime4),
                        new FinancialDetail(06.13,dateTime5)));
        Financial ratioFreeCashFlowSales = new Financial(
                "free cash flow/sales",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(7.14,dateTime1),
                        new FinancialDetail(4.92,dateTime2),
                        new FinancialDetail(2.32,dateTime3),
                        new FinancialDetail(9.17,dateTime4),
                        new FinancialDetail(8.77,dateTime5)));
        Financial ratioFreeCashFlowNetIncome = new Financial(
                "free cash flow/net income",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0.86,dateTime1),
                        new FinancialDetail(0.6,dateTime2),
                        new FinancialDetail(0.34,dateTime3),
                        new FinancialDetail(02.05,dateTime4),
                        new FinancialDetail(1.22,dateTime5)));
        Financial ratioBalanceSheetItemsinTerms = new Financial(
                "balance sheet items (in % terms)",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));

        Financial ratioCashShortTermInvestments = new Financial(
                "cash & short term investments",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(3.75,dateTime1),
                        new FinancialDetail(2.46,dateTime2),
                        new FinancialDetail(1.77,dateTime3),
                        new FinancialDetail(2.51,dateTime4),
                        new FinancialDetail(2.76,dateTime5)));
        Financial ratioAccountsreceivable = new Financial(
                "accounts receivable",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(5.08,dateTime1),
                        new FinancialDetail(5.22,dateTime2),
                        new FinancialDetail(5.02,dateTime3),
                        new FinancialDetail(4.59,dateTime4),
                        new FinancialDetail(4.32,dateTime5)));
        Financial ratioInventory = new Financial(
                "inventory",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(2.95,dateTime1),
                        new FinancialDetail(3.15,dateTime2),
                        new FinancialDetail(3.28,dateTime3),
                        new FinancialDetail(3.06,dateTime4),
                        new FinancialDetail(3.12,dateTime5)));
        Financial ratioOtherCurrentAssets = new Financial(
                "other current assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(1.94,dateTime1),
                        new FinancialDetail(2.49,dateTime2),
                        new FinancialDetail(3.54,dateTime3),
                        new FinancialDetail(3.52,dateTime4),
                        new FinancialDetail(3.08,dateTime5)));
        Financial ratioTotalcurrentassets = new Financial(
                "total current assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(13.73,dateTime1),
                        new FinancialDetail(13.32,dateTime2),
                        new FinancialDetail(13.61,dateTime3),
                        new FinancialDetail(13.67,dateTime4),
                        new FinancialDetail(13.28,dateTime5)));
        Financial ratioNetPPE = new Financial(
                "net pp&e",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(20.78,dateTime1),
                        new FinancialDetail(22.15,dateTime2),
                        new FinancialDetail(20.99,dateTime3),
                        new FinancialDetail(21.36,dateTime4),
                        new FinancialDetail(20.34,dateTime5)));
        Financial ratioIntangibles = new Financial(
                "intangibles",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(59.24,dateTime1),
                        new FinancialDetail(60.80,dateTime2),
                        new FinancialDetail(59.68,dateTime3),
                        new FinancialDetail(58.38,dateTime4),
                        new FinancialDetail(60.47,dateTime5)));
        Financial ratioOtherLongTermAssets = new Financial(
                "other long-term assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(6.25,dateTime1),
                        new FinancialDetail(3.72,dateTime2),
                        new FinancialDetail(5.72,dateTime3),
                        new FinancialDetail(6.59,dateTime4),
                        new FinancialDetail(5.92,dateTime5)));
        Financial ratioTotalAssets = new Financial(
                "total assets",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(100.00,dateTime1),
                        new FinancialDetail(100.00,dateTime2),
                        new FinancialDetail(100.00,dateTime3),
                        new FinancialDetail(100.00,dateTime4),
                        new FinancialDetail(100.00,dateTime5)));
        Financial ratioAccountsPayable = new Financial(
                "accounts payable",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(7.70,dateTime1),
                        new FinancialDetail(8.55,dateTime2),
                        new FinancialDetail(8.78,dateTime3),
                        new FinancialDetail(9.82,dateTime4),
                        new FinancialDetail(10.64,dateTime5)));
        Financial ratioCurrentDebt = new Financial(
                "current debt",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(2.18,dateTime1),
                        new FinancialDetail(6.30,dateTime2),
                        new FinancialDetail(1.34,dateTime3),
                        new FinancialDetail(3.64,dateTime4),
                        new FinancialDetail(7.14,dateTime5)));
        Financial ratioTaxesPayable = new Financial(
                "taxes payable",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0.35,dateTime1),
                        new FinancialDetail(0.35,dateTime2),
                        new FinancialDetail(0.57,dateTime3),
                        new FinancialDetail(0.48,dateTime4),
                        new FinancialDetail(0.74,dateTime5)));
        Financial ratioAccruedliabilities = new Financial(
                "accrued liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));
        Financial ratioOthercurrentliabilities = new Financial(
                "other current liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(7.65,dateTime1),
                        new FinancialDetail(7.55,dateTime2),
                        new FinancialDetail(8.67,dateTime3),
                        new FinancialDetail(9.89,dateTime4),
                        new FinancialDetail(8.38,dateTime5)));
        Financial ratioTotalcurrentliabilities = new Financial(
                "total current liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(17.88,dateTime1),
                        new FinancialDetail(22.75,dateTime2),
                        new FinancialDetail(19.36,dateTime3),
                        new FinancialDetail(23.83,dateTime4),
                        new FinancialDetail(26.90,dateTime5)));
        Financial ratioLongTermDebt = new Financial(
                "long term debt",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(23.84,dateTime1),
                        new FinancialDetail(20.30,dateTime2),
                        new FinancialDetail(28.24,dateTime3),
                        new FinancialDetail(25.20,dateTime4),
                        new FinancialDetail(16.66,dateTime5)));
        Financial ratioOtherlongtermliabilities = new Financial(
                "other long-term liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(12.64,dateTime1),
                        new FinancialDetail(12.08,dateTime2),
                        new FinancialDetail(14.11,dateTime3),
                        new FinancialDetail(16.15,dateTime4),
                        new FinancialDetail(16.41,dateTime5)));
        Financial ratioTotalLiabilities = new Financial(
                "total liabilities",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(54.37,dateTime1),
                        new FinancialDetail(55.13,dateTime2),
                        new FinancialDetail(61.72,dateTime3),
                        new FinancialDetail(65.18,dateTime4),
                        new FinancialDetail(59.96,dateTime5)));
        Financial ratioTotalstockholdersequity = new Financial(
        "total stockholders' equity",
        new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(45.63,dateTime1),
                        new FinancialDetail(44.87,dateTime2),
                        new FinancialDetail(38.28,dateTime3),
                        new FinancialDetail(34.82,dateTime4),
                        new FinancialDetail(40.04,dateTime5)));
        Financial ratioTotalLiabilitiesandEquity = new Financial(
                "total liabilities and equity",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(100.00,dateTime1),
                        new FinancialDetail(100.00,dateTime2),
                        new FinancialDetail(100.00,dateTime3),
                        new FinancialDetail(100.00,dateTime4),
                        new FinancialDetail(100.00,dateTime5)));
        Financial ratioLiquidityFinancialHealth = new Financial(
                "liquidity/financial health",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));

        Financial ratioCurrentRatio = new Financial(
                "current ratio",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0.77,dateTime1),
                        new FinancialDetail(0.59,dateTime2),
                        new FinancialDetail(0.7,dateTime3),
                        new FinancialDetail(0.57,dateTime4),
                        new FinancialDetail(0.49,dateTime5)));
        Financial ratioQuickRatio = new Financial(
                "quick ratio",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0.57,dateTime1),
                        new FinancialDetail(0.4,dateTime2),
                        new FinancialDetail(0.45,dateTime3),
                        new FinancialDetail(0.38,dateTime4),
                        new FinancialDetail(0.34,dateTime5)));

        Financial ratioEfficiency = new Financial(
                "efficiency",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(0,dateTime1),
                        new FinancialDetail(0,dateTime2),
                        new FinancialDetail(0,dateTime3),
                        new FinancialDetail(0,dateTime4),
                        new FinancialDetail(0,dateTime5)));

        Financial ratioDaysSalesOutstanding = new Financial(
                "days sales outstanding",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(42.59,dateTime1),
                        new FinancialDetail(43.1,dateTime2),
                        new FinancialDetail(41.76,dateTime3),
                        new FinancialDetail(35.19,dateTime4),
                        new FinancialDetail(32.69,dateTime5)));
        Financial ratioDaysInventory = new Financial(
                "days inventory",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(47.96,dateTime1),
                        new FinancialDetail(50.5,dateTime2),
                        new FinancialDetail(51.64,dateTime3),
                        new FinancialDetail(45.39,dateTime4),
                        new FinancialDetail(45.52,dateTime5)));
        Financial ratioPayablesPeriod = new Financial(
                "payables period",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(123.44,dateTime1),
                        new FinancialDetail(134.55,dateTime2),
                        new FinancialDetail(139.19,dateTime3),
                        new FinancialDetail(132.61,dateTime4),
                        new FinancialDetail(150.69,dateTime5)));
        Financial ratioCashConversionCycle = new Financial(
                "cash conversion cycle",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(032.89,dateTime1),
                        new FinancialDetail(040.96,dateTime2),
                        new FinancialDetail(045.79,dateTime3),
                        new FinancialDetail(052.03,dateTime4),
                        new FinancialDetail(072.49,dateTime5)));
        Financial ratioReceivablesTurnover = new Financial(
                "receivables turnover",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(8.57,dateTime1),
                        new FinancialDetail(8.47,dateTime2),
                        new FinancialDetail(8.74,dateTime3),
                        new FinancialDetail(10.37,dateTime4),
                        new FinancialDetail(11.17,dateTime5)));
        Financial ratioInventoryTurnover = new Financial(
                "inventory turnover",
                new Company("CARLSBERG","DKK","Copenhagen","Denmark"),
                Arrays.asList(new FinancialDetail(7.61,dateTime1),
                        new FinancialDetail(7.23,dateTime2),
                        new FinancialDetail(7.07,dateTime3),
                        new FinancialDetail(8.04,dateTime4),
                        new FinancialDetail(8.02,dateTime5)));

        // drop all financials
        this.financialRepository.deleteAll();

        // add our financials to the database
        List<Financial> financials = Arrays.asList(revenue,costOfRevenue,grossOperatingProfit,
                salesGeneralAndAdministrative,otherOperatingExpenses,totalOperatingExpenses,
                operatingIncomeBeforeInterestAndTaxes,nonOperatingIncome,incomeBeforeIncomeTaxes,
                provisionForIncomeTaxes,netIncomeFromContinuingOperations,netIncome,netIncomeAvailableForCommonShareholders,
                cashAndCashEquivalents,shortTermInvestments,totalCashCashEquivalentsAndShortTermInvestments,grossMargin,
                securitasRevenue,securitasCostOfRevenue,securitasGrossOperatingProfit,securitasSalesGeneralAndAdministrative,
                securitasOtherOperatingExpenses,securitasTotalOperatingExpenses,securitasOperatingIncomeBeforeInterestAndTaxes,
                securitasNonOperatingIncome,securitasIncomeBeforeIncomeTaxes,securitasProvisionForIncomeTaxes,
                securitasNetIncomeFromContinuingOperations,securitaNetIncome,securitasNetIncomeAvailableForCommonShareholders,
                securitasCashAndCashEquivalents,securitasShortTermInvestments,securitasTotalCashCashEquivalentsAndShortTermInvestments,
                securitasGrossMargin,capitalExpenditure,totalCurrentAssets,accountsReceivable,intangibles,deferredIncomeTaxes,
                inventory,otherCurrentAssets,otherLongTermAssets,totalNonCurrentAssets,totalAssets,totalCurrentLiabilities,
                netIncomeFromContinuingOperations,totalNonCurrentLiabilities,totalLiabilities,totalStockholdersEquity,totalLiabilitiesAndStockholdersEquity,
                netCashProvidedByOperatingActivities,netCashUsedForInvestingActivities,netCashProvidedByUsedForFinancingActivities,
                freeCashFlow,operatingCashFlow,netChangeInCash,operatingMargin,ebtMargin,taxRate,netMargin,returnOnAssets,returnOnEquity,
                ratioSGA
                , ratioResearchanddevelopment
                , ratioOperatingMargin
                , ratioEBTMargin
                , ratioProfitability
                , ratio
                , ratioTaxRate
                , ratioNetMargin
                , ratioReturnonAssets
                , ratioFinancialLeverage
                , ratioReturnonEquity
                , ratioCompoundAnnualGrowthRates
                , ratioRevenueGrowthYearoverYear
                , ratioRevenueGrowth3YearAverage
                , ratioRevenueGrowth5YearAverage
                , ratioOperatingIncomeYearoverYear
                , ratioOperatingIncome3YearAverage
                , ratioOperatingIncome5YearAverage
                , ratioEarningspershareYearoverYear
                , ratioEarningspershare3YearAverage
                , ratioEarningspershare5YearAverage
                , ratioCashFlow
                , ratioOperatingCashFlowGrowthYOY
                , ratioFreeCashFlowGrowthYOY
                , ratioCapExasaofSales
                , ratioFreeCashFlowSales
                , ratioFreeCashFlowNetIncome
                , ratioBalanceSheetItemsinTerms
                , ratioCashShortTermInvestments
                , ratioAccountsreceivable
                , ratioInventory
                , ratioOtherCurrentAssets
                , ratioTotalcurrentassets
                , ratioNetPPE
                , ratioIntangibles
                , ratioOtherLongTermAssets
                , ratioTotalAssets
                , ratioAccountsPayable
                , ratioCurrentDebt
                , ratioTaxesPayable
                , ratioAccruedliabilities
                , ratioOthercurrentliabilities
                , ratioTotalcurrentliabilities
                , ratioLongTermDebt
                , ratioOtherlongtermliabilities
                , ratioTotalLiabilities
                , ratioTotalstockholdersequity
                , ratioTotalLiabilitiesandEquity
                , ratioLiquidityFinancialHealth
                , ratio
                , ratioCurrentRatio
                , ratioQuickRatio
                , ratioFinancialLeverage
                , ratioEfficiency
                , ratio
                , ratioDaysSalesOutstanding
                , ratioDaysInventory
                , ratioPayablesPeriod
                , ratioCashConversionCycle
                , ratioReceivablesTurnover
                , ratioInventoryTurnover );

        // save all the data to database
        this.financialRepository.save(financials);

    }
}
