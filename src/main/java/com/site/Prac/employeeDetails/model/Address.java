package com.site.Prac.employeeDetails.model;

public class Address {

    private String addressType;
    private String addressLane1;
    private String addressLane2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressLane1() {
        return addressLane1;
    }

    public void setAddressLane1(String addressLane1) {
        this.addressLane1 = addressLane1;
    }

    public String getAddressLane2() {
        return addressLane2;
    }

    public void setAddressLane2(String addressLane2) {
        this.addressLane2 = addressLane2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressType='" + addressType + '\'' +
                ", addressLane1='" + addressLane1 + '\'' +
                ", addressLane2='" + addressLane2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

