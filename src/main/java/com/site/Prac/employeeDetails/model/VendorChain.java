package com.site.Prac.employeeDetails.model;

public class VendorChain {

    private String name;
    private String level;
    private String pocEmail;
    private String pocNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPocEmail() {
        return pocEmail;
    }

    public void setPocEmail(String pocEmail) {
        this.pocEmail = pocEmail;
    }

    public String getPocNumber() {
        return pocNumber;
    }

    public void setPocNumber(String pocNumber) {
        this.pocNumber = pocNumber;
    }

    @Override
    public String toString() {
        return "VendorChain{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", pocEmail='" + pocEmail + '\'' +
                ", pocNumber='" + pocNumber + '\'' +
                '}';
    }
}

