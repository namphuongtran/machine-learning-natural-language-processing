package com.euroland.webapi.models;

import java.util.List;

public class ResponseBase {
    private String question;

    private List<String> arguments;

    private String answer;

    private List<String> errors;

    public ResponseBase(String question, List<String> arguments, String answer, List<String> errors) {
        this.question = question;
        this.arguments = arguments;
        this.answer = answer;
        this.errors = errors;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
