package com.site.Prac.employeeDetails.model;

import java.util.Date;

public class SalesTeam {

    private String name;

    private String mail;

    private String contact;

    private Date startDate;

    private Date endDate;

    private boolean placed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    @Override
    public String toString() {
        return "SalesTeam{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", contact='" + contact + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", placed=" + placed +
                '}';
    }
}
