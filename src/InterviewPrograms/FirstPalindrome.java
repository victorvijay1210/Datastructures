package InterviewPrograms;

public class FirstPalindrome {
	
	public static String firstPalindrome(String[] strarr) {
		
		for(String str: strarr) {
			
			String revstr= new StringBuffer(str).reverse().toString();
			
			if(str.equals(revstr)) {
				return str;
				
			}
			
		}
				
		return "";
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] strarr = {"abc","car","ada","racecar","cool"};
       System.out.println(firstPalindrome(strarr));
	}

}
