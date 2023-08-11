package oop;

public class BankAccount implements IRate{
	
	//Define variables
	String accountNumber;
	
	//Static >> belongs to the CLASS not the object instance
	//final >> constant (often static final)
	
	//static variable
	private static final String routingNumber = "013546"; 
	
	//Instance variable
	private String name;
	private String socialSecurityNumber;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
		//1. Used to define/setup/initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have no return type
	
	//Vår konstrutor
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		
		//initDeposit, accountType, Msg are all local variables >> defined
		//within the block
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1000";
			
		}else {
			Msg = "Thanks for your inital deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	//Define Methods
	public void deposit(double amount) {
		balance = balance + amount; 
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	//Private - can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ", ACCOUNT# " + accountNumber + ", ROUTING# " + routingNumber +  ", BALANCE: $ " + balance + " ]";
	}
	
	//Getters / Setters
	
	//Allow user to define the name. Not the variable name, but 
	//allow them to access a function that let's them set the name
	//It's public because we want them to be able to access the method
	//from the outside
	public void setName(String name) {
		this.name = "Mr. " + name;
		//this.name: the name that belongs to the class
		// = name: the name that's being passed through the argument
	}
	
	public String getName() {
		return name;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE: ");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE: ");
	}
	
	
}
