package com.site.Prac.employeeDetails.model;

import java.util.Date;
import java.util.List;

public class Placement {

    private String placementCode;

    private String placementType;

    private String jobCode;

    private String jobTitle;

    private String clientName;

    private List<VendorChain> vendorChain;

    private Date startDate;

    private Date endDate;

    private boolean onGoing;

    private double payRate;

    private double billRate;

    private int noticePeriod;

    private String notes;

    private Date createdDt;

    private String createdBy;

    private Date updatedDt;

    private String updatedBy;

    public String getPlacementCode() {
        return placementCode;
    }

    public void setPlacementCode(String placementCode) {
        this.placementCode = placementCode;
    }

    public String getPlacementType() {
        return placementType;
    }

    public void setPlacementType(String placementType) {
        this.placementType = placementType;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<VendorChain> getVendorChain() {
        return vendorChain;
    }

    public void setVendorChain(List<VendorChain> vendorChain) {
        this.vendorChain = vendorChain;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isOnGoing() {
        return onGoing;
    }

    public void setOnGoing(boolean onGoing) {
        this.onGoing = onGoing;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getBillRate() {
        return billRate;
    }

    public void setBillRate(double billRate) {
        this.billRate = billRate;
    }

    public int getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(int noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "Placement{" +
                "placementCode='" + placementCode + '\'' +
                ", placementType='" + placementType + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", clientName='" + clientName + '\'' +
                ", vendorChain=" + vendorChain +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", onGoing=" + onGoing +
                ", payRate=" + payRate +
                ", billRate=" + billRate +
                ", noticePeriod=" + noticePeriod +
                ", notes='" + notes + '\'' +
                ", createdDt=" + createdDt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedDt=" + updatedDt +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}

