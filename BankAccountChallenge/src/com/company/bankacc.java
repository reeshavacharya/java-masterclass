package com.company;

public class bankacc {

    private int accountNo;
    private double balance;
    private String name;
    private String email;
    private String phoneNo;

    public bankacc(){
        this(6969, 420.69, "peepeepoopoo", "peepee@poopoo.com", "4055320896");
        System.out.println("empty constructor called");
    }
    public bankacc(int accountNo, double balance, String name, String email, String phoneNo){
        System.out.println("constructor with parameters called");
        this.accountNo=accountNo;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
    }

    public bankacc(String name, String email, String phoneNo) {
        this(9955, 45678.54, name, email, phoneNo);
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void deposit(double depositamount){
        this.balance+=depositamount;
        System.out.println("amount "+ depositamount+" deposited. your new balance is: "+this.balance);
    }
    public void withdraw(double withdrawlAmount){
        if(withdrawlAmount> this.balance){
            System.out.println("insufficient funds");
        }
        else
        {
                this.balance-= withdrawlAmount;
            System.out.println("Amount "+withdrawlAmount+" withdrawn. your new balance is: "+this.balance);
        }
    }
}
