package basics;

public class NumbersCalc {
	public static void main (String [] args) {
		//call the functions from main
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers (numA, numB);
		System.out.println("Product of numbers " + numA + " and " + numB + " equals " + product);
		//System.out.println("The product of numbers " + numA + " and " + numB + " equals " + multiplyNumbers(numA, numB));
		
		
	}
	
	//functions
	static void printName() {
		System.out.println("My name is Micke");
		}
			
		static void addNumbers(int numberA, int numberB) {
			//this function will add two numbers
			int sum = numberA + numberB;
			System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
		}
		
		static int multiplyNumbers(int valueA, int valueB) {
			int product = valueA * valueB;
			addNumbers(product, product);
			return product;
		}
		
}
