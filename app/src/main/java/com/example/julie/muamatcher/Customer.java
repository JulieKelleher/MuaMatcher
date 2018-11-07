package com.example.julie.muamatcher;

public class Customer {
    String custID;
    String FNameCust;
    String SurnameCust;
    String EmailCust;
    String PasswordCust;


    public Customer(){

    }

    public Customer(String custID, String FNameCust, String surnameCust, String emailCust, String passwordCust) {
        this.custID = custID;
        this.FNameCust = FNameCust;
        this.SurnameCust = surnameCust;
        this.EmailCust = emailCust;
        this.PasswordCust = passwordCust;

    }

    public String getCustID() {
        return custID;
    }

    public String getFNameCust() {
        return FNameCust;
    }

    public String getSurnameCust() {
        return SurnameCust;
    }

    public String getEmailCust() {
        return EmailCust;
    }

    public String getPasswordCust() {
        return PasswordCust;
    }

}

