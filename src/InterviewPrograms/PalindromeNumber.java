package InterviewPrograms;


public class PalindromeNumber {
	
	
	
	public static int revno(int numb) {
		
		int rev=0;
		
		while(numb!=0) {
			
			int digit = numb%10;
			rev= rev*10+digit;
			numb = numb/10;
		}
		
		
		return rev;
	}
	
	public static boolean isPalindrome(int numb) {
		
	int reversedno=	revno(numb);
		System.out.println(reversedno);
	 if(numb==reversedno) {
		 return true;
	 }
		
		return false;
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int num = 16461;
		
		System.out.println(isPalindrome(num));
	}

}
