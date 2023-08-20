package com.site.Prac.employeeDetails.model;

import java.util.List;

public class Screening {

    private String screeningType;

    private List<VendorChain> vendorChain;

    private Panel panel;

    private String submittedBy;

    private String payRate;

    private String location;

    private String panelApproach;

    private String candidateFeedback;

    private String supportFeedback;

    private String salesFeedback;

    private String result;

    public String getScreeningType() {
        return screeningType;
    }

    public void setScreeningType(String screeningType) {
        this.screeningType = screeningType;
    }

    public List<VendorChain> getVendorChain() {
        return vendorChain;
    }

    public void setVendorChain(List<VendorChain> vendorChain) {
        this.vendorChain = vendorChain;
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPanelApproach() {
        return panelApproach;
    }

    public void setPanelApproach(String panelApproach) {
        this.panelApproach = panelApproach;
    }

    public String getCandidateFeedback() {
        return candidateFeedback;
    }

    public void setCandidateFeedback(String candidateFeedback) {
        this.candidateFeedback = candidateFeedback;
    }

    public String getSupportFeedback() {
        return supportFeedback;
    }

    public void setSupportFeedback(String supportFeedback) {
        this.supportFeedback = supportFeedback;
    }

    public String getSalesFeedback() {
        return salesFeedback;
    }

    public void setSalesFeedback(String salesFeedback) {
        this.salesFeedback = salesFeedback;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Screening{" +
                "screeningType='" + screeningType + '\'' +
                ", vendorChain=" + vendorChain +
                ", panel=" + panel +
                ", submittedBy='" + submittedBy + '\'' +
                ", payRate='" + payRate + '\'' +
                ", location='" + location + '\'' +
                ", panelApproach='" + panelApproach + '\'' +
                ", candidateFeedback='" + candidateFeedback + '\'' +
                ", supportFeedback='" + supportFeedback + '\'' +
                ", salesFeedback='" + salesFeedback + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}

