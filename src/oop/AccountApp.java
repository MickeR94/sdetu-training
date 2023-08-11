package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//Polymorphism - changes where we are pointing - we are creating a
		//variable (account1) based on the properties of IRate, but it will point to
		//to the LoanAccount
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		//because of IRate written here, we can only access the methods
		//listed in the interface (IRate). account1 is based on IRate's properties
		//but it is going to point to LoanAccount
		//So when we run this, all the methods listed in LoanAccount will
		//be activated
	}

}
