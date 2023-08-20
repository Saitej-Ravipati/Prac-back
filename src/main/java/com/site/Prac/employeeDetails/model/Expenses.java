package com.site.Prac.employeeDetails.model;

public class Expenses {

    private String expensesId;

    private String companyCode;

    private String expenseType;

    private String expenseDate;

    private String duration;

    private String startTime;

    private String endTime;

    private String amountBT;

    private String amountAT;

    private String taxPercentage;

    private String notes;

    private String resource;

    private String paymentStatus;

    private Screening screening;

    public String getExpensesId() {
        return expensesId;
    }

    public void setExpensesId(String expensesId) {
        this.expensesId = expensesId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAmountBT() {
        return amountBT;
    }

    public void setAmountBT(String amountBT) {
        this.amountBT = amountBT;
    }

    public String getAmountAT() {
        return amountAT;
    }

    public void setAmountAT(String amountAT) {
        this.amountAT = amountAT;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "expensesId='" + expensesId + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", expenseType='" + expenseType + '\'' +
                ", expenseDate='" + expenseDate + '\'' +
                ", duration='" + duration + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", amountBT='" + amountBT + '\'' +
                ", amountAT='" + amountAT + '\'' +
                ", taxPercentage='" + taxPercentage + '\'' +
                ", notes='" + notes + '\'' +
                ", resource='" + resource + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", screening=" + screening +
                '}';
    }
}

