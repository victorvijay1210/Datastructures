package MathematicalPrograms;

public class Palindrome {
	
	public static boolean isPalindrome(int num) {
		
		if(num<1) {
			return false;
		}
		
		
			
			for(int i=2;i<num;i++) {
				
				if(num%2==0) {
					return false;
				}
			}
		
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(isPalindrome(15));//true
    System.out.println(isPalindrome(8));//false
	}

}
