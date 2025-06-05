package DynamicPrograming;

//https://leetcode.com/problems/longest-palindromic-substring/description/?envType=study-plan-v2&envId=top-interview-150
public class LongestPalindromeSubString {
	
//	Time Complexity: O(n²)
//    Space Complexity: O(1)
	public static String longestPalindrome (String s) {
		
		if(s.length()<1) {
			return "";
		}
		
		int start=0;
		int end =0;
		
		for(int i=0;i<s.length();i++) {
			
		int len1= expandFromCenter(s, i, i);//odd length
		int len2=expandFromCenter(s, i, i+1);//even length 
		
		int length = Math.max(len1, len2);
		
		
		if(length>end -start +1) {
			
			start= i-(length-1)/2;
			end= i+length/2;
		}
		
			
		}
		
		
		return s.substring(start ,end+1);
		
	}
	
	
	public static int expandFromCenter(String s, int left,int right) {
		
		while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		
		return right-left-1;
		
	}
   
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // Output: bab or aba
        System.out.println(longestPalindrome("cbbd"));  // Output: bb
    }
}