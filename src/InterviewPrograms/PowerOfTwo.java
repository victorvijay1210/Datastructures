package InterviewPrograms;

public class PowerOfTwo {
	
	
	public static boolean isPowerOfTwo(int n) {
		return n>0 && (n&-n)==n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	        int n = 16;
	        System.out.println(isPowerOfTwo(n)); // Output: true
	    

	}

}
