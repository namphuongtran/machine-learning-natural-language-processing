package com.euroland.webapi.models;

import java.util.Date;

public class FinancialDetail {
    private double financialValue;
    private int year;

    public FinancialDetail(double financialValue, int year) {
        this.financialValue = financialValue;
        this.year = year;
    }

    public double getFinancialValue() {
        return financialValue;
    }

    public void setFinancialValue(double financialValue) {
        this.financialValue = financialValue;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
