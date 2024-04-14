package MathematicalPrograms;

public class SumOfNumbers {
	
	public static int sumNumbers(int num) {
		
		int sum=0;
		
		while(num!=0) {
           sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(sumNumbers(12));
	}

}
