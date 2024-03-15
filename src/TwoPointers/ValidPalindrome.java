package TwoPointers;

public class ValidPalindrome {
	
	public static boolean isPalindrome (String str) {
		
	String s= str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
	
   int i=0;
   int j = s.length()-1;
   
   
   
   while(i<j) {
	   
	   if(s.charAt(i)!=s.charAt(j)) {
		   return false;
	   }
	   i++;
	   j--;
   }
		
		return true;
		
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrome("race a car"));                      // Output: false
        System.out.println(isPalindrome(" "));
	}

}
