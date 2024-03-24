package InterviewPrograms;

public class SawpTwoNumbers {
	
	
	public static void swapNumbers() {
		
		int a= 10;
		int b=20;
		
		
		System.out.println("Before Swapping" + " : "  +" a =" + a);
		System.out.println("Before Swapping" + " : "  +" b =" + b);
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping" + " : "  +" a =" + a);
		System.out.println("After Swapping" + " : "  +" b =" + b);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       swapNumbers();
	}

}
