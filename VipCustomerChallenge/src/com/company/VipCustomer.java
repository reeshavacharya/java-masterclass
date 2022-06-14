package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("byakugan", 3400.68, "hyuga@konoha.com");
        System.out.println("empty constructor called");
    }
    public VipCustomer(String name, double creditLimit){
       this(name, creditLimit, "xxx@example.com");
    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
