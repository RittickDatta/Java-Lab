package com.rittick;

public class Main {

    public static void main(String[] args) {
	    //BankAccount bankAccount = new BankAccount();//123,23213,"Rittick","abc@gmail.com", "3213123");

//	    bankAccount.setAccountNumber(123);
//	    bankAccount.setBalance(100000);
//	    bankAccount.setCustomerName("Rittick Datta");
//	    bankAccount.setEmail("rittickdatta@gmail.com");
//	    bankAccount.setPhoneNumber("3125361086");

//	    bankAccount.deposit(200000);
//		System.out.println("Amount deposited.");
//		bankAccount.withdraw(50000);
//		System.out.println("Amount withdrawn.");
//		System.out.println("New Banlance : "+bankAccount.getBalance());
//		bankAccount.withdraw(250001);


		VipCustomer vipCustomer = new VipCustomer("Bolin",900000,"bolin.datta@gmail.com");
		System.out.println("Name: "+vipCustomer.getName());
		System.out.println("Limit: "+vipCustomer.getCreditLimit());
		System.out.println("Email: "+vipCustomer.getEmailAddress());
	}
}
