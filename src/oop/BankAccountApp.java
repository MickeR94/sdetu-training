package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> think instantiating an object
		
		BankAccount acc1 = new BankAccount();
		
		//Gamla sättet - vi hade inte variabeln name private från början
		//acc1.name = "Roger Hue";
		
		//With encapsulation
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSocialSecurityNumber("2345678432");
		System.out.println("SSN: " + acc1.getSocialSecurityNumber());
		
		acc1.accountNumber = "091328";
		acc1.balance = 10000;
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		//Polymorphism through overwriting
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account", 300);
		acc2.accountNumber = "091328";
		
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "091328";
		
		/*
		acc3.checkBalance();
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = "4.5";
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
