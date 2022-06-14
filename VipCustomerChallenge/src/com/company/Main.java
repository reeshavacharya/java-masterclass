package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer hinata= new VipCustomer();
        System.out.println(hinata.getName());

        VipCustomer himawari= new VipCustomer("blue", 45000.78);
        System.out.println(himawari.getEmail()+" "+himawari.getName()+" "+himawari.getCreditLimit());

        VipCustomer neji= new VipCustomer("white", 300237.89, "neji@konoha.com");
        System.out.println(neji.getName()+" "+neji.getCreditLimit()+" "+neji.getEmail());
    }
}
