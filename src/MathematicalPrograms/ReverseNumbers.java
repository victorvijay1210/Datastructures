package MathematicalPrograms;

public class ReverseNumbers {

	public static int reverseNumbers(int num) {
		
		int rev = 0;
		
		while(num!=0) {
			int digit = num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(reverseNumbers(1234));
	}

}
