package com.rittick;

/**
 * Created by Rittick on 1/29/2017.
 */
public class VipCustomer {
    private  String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Rittick", 10000.0, "rittickdatta@gmail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
