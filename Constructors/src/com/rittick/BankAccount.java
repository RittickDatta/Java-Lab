package com.rittick;

/**
 * Created by Rittick on 1/29/2017.
 */
public class BankAccount {
    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public  BankAccount(){
        this(123,231231,"Default name","Default email", "Default Phone");
        System.out.println("Enpty Constructor.");
    }

    public BankAccount(int accountNumber, float balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public void withdraw(float amount){
        if(amount < this.balance){
            System.out.println("Sufficient balance to withdraw: "+this.balance);
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient balance. Please deposit.");
        }
    }
}
