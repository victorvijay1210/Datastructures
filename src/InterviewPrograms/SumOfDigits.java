package InterviewPrograms;

public class SumOfDigits {
    
	public static int sumOfDigits(int num) {
	    int sum = 0;
	    
	    while (num != 0) {
	        sum = sum+num % 10; // Add the last digit to the sum
	        num = num/10;       // Remove the last digit from the number
	    }
	    
	    return sum;
	}

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }
}


