package InterviewPrograms;

public class SumOfDigits {
    
	public static int sumofDigit(int num) {
		
		String s = String.valueOf(num);
		int sum=0;
		
		for(int i=0; i<s.length();i++) {
			
		int c= Character.getNumericValue(s.charAt(i));
		sum= sum+c;
		
		}		
		
		
		return sum;
		
		
	}

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumofDigit(num));
    }
}


