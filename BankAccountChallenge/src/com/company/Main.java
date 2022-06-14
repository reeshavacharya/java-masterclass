package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bankacc bankofnepal= new bankacc();

//        bankofnepal.setName("Reesahv Acharya");
//        bankofnepal.setBalance(89000.59);
//        bankofnepal.setAccountNo(2012104);
//        bankofnepal.setEmail("reeshav99acharya@gmail.com");
//        bankofnepal.setPhoneNo("9841454969");
        System.out.println(bankofnepal.getAccountNo());
        System.out.println(bankofnepal.getName());
        System.out.println(bankofnepal.getBalance());
        System.out.println(bankofnepal.getPhoneNo());
        System.out.println(bankofnepal.getEmail());

        bankofnepal.deposit(45000.89);
        bankofnepal.withdraw(134001);
        bankofnepal.deposit(50000);
        bankofnepal.withdraw(45000);

        bankacc prabhu= new bankacc("jiwan", "jiwan@ko.email", "56735");
        System.out.println(prabhu.getAccountNo()+"name:" + prabhu.getName());



    }
}
