package MathematicalPrograms;

public class PrintNoUsingRecursion {
	
	
	public static void printNumbers(int n) {
		
	   if(n<=10) {
		   
		 printNumbers(n+1);
	     System.out.println(n);
	   }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers(1);
		
	}

}
