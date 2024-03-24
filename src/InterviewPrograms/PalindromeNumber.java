package InterviewPrograms;


public class PalindromeNumber {
	
	
	
	public static boolean isPalindrome(int numb) {
		
		   String num=String.valueOf(numb);
	 StringBuffer rev = new StringBuffer(num).reverse();
	 Integer revint= Integer.valueOf(rev.toString());
	
	 if(numb==revint) {
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
