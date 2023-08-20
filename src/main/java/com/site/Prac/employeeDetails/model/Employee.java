package com.site.Prac.employeeDetails.model;

import java.util.Date;
import java.util.List;

public class Employee {

    private String empId;
    private String empType;
    private String category;
    private boolean empStatus;
    private String firstName;
    private String middleName;
    private String lastName;
    private String aliasName;
    private String gender;
    private Date dob;
    private Date dateOfJoining;
    private List<Address> addresses;
    private List<Placement> placements;
    private List<String> expenses;
    private List<SalesTeam> sales;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(boolean empStatus) {
        this.empStatus = empStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Placement> getPlacements() {
        return placements;
    }

    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

    public List<String> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<String> expenses) {
        this.expenses = expenses;
    }

    public List<SalesTeam> getSales() {
        return sales;
    }

    public void setSales(List<SalesTeam> sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empType='" + empType + '\'' +
                ", category='" + category + '\'' +
                ", empStatus=" + empStatus +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", aliasName='" + aliasName + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", dateOfJoining=" + dateOfJoining +
                ", addresses=" + addresses +
                ", placements=" + placements +
                ", expenses=" + expenses +
                ", sales=" + sales +
                '}';
    }
}
