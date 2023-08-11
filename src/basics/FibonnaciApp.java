package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		System.out.println(findMax ());

	}
	
	/*public static int fib(int n) {
		if(n == 0) {
			return 0; 
		}
		else if (n == 1) {
			return 1;
		}
		return ( (fib(n-1)) + (fib(n-2)) );
	}*/
	
	/*public static int sum (int n) {

		return ((n*(n+1)/2)); 
	}*/
	
	/*public static int fac(int n) {
		if ( n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 1;
		}
		return fac (n-1) * n;  
	}*/
	
	
	public static int findMax(int[] arr) {
	    int max = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    return max;
	}

	public static int findMin(int[] arr) {
	    int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    return min;
	}

	public static int findAvg(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum = sum + arr[i];
	    }
	    return sum / arr.length;
	}
	
} 
