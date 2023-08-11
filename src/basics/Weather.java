package basics;

public class Weather {
	public static void main (String[] args) {
		//clothing suggestions based on weather (temperature)
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant, wear shorts and T-shirt");
		}
		
		else if(temperature > 60 && sunCondition == "Sunny") {
			System.out.println("It's a little chilly, wear a long-sleeve");
			System.out.println("Wear a hat to sheild your eyes");
		}
		else if(temperature > 50 || sunCondition == "Overcast") {
			System.out.println("This is a cool day. Make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
	}
}
