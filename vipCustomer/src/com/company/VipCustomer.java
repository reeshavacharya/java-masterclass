package com.company;

public class VipCustomer {
    private String name;
    private double CreditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.CreditLimit = CreditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double CreditLimit) {
       this(name, CreditLimit, "unknown@email.com");
    }

    public VipCustomer() {
       this("default name", 50000, "default@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return email;
    }
}
