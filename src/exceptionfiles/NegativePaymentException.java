package exceptionfiles;

public class NegativePaymentException extends Exception{
	
	double payment;
	
	public NegativePaymentException(double payment){
		//System.out.println("ERROR: Negative payment"); 
		this.payment = payment;
	}
	
	public String toString() {
		return "ERROR: Cannot take negative payment: $" + payment;
	}
}
