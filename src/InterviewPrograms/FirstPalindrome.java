package InterviewPrograms;

// time complexity is O(n * m)
// space complexity is also O(n * m)
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
