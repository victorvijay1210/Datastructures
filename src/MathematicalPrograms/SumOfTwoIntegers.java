package MathematicalPrograms;


//https://leetcode.com/problems/sum-of-two-integers/description/
public class SumOfTwoIntegers {
	
	
	public static int sumIntegers(int a, int b) {
		
		while(b!=0) {
		  int carry= a&b;
		  a=a^b;
		  b=carry<<1;
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(sumIntegers(1, 2));
      System.out.println(sumIntegers(2, 3));
	}

}
