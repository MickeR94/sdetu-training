package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("659037503", 1500);
		BankAccount acc3 = new BankAccount("947254923",2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

	
}
	
class BankAccount implements IInterest{
	//Properties of bank account
	private static int ID = 1000; // Internal ID
	private String accountNumber; //ID + random 2 digit number + first 2 social security number
	private static final String routingNumber = "0045400657";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		//instansvariabeln SSN blir satt till lokala variabeln som matas in
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account number " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]"; 
	}
}

