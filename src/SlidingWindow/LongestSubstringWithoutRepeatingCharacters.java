package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	
	// distance formula end-start + 1
	
	 public static int longestSubstring(String s) {
			
			int start=0;
			int end = 0;	
			int maxlength = 0;
			
			//using hashset to find duplicate
			Set<Character> seen = new HashSet<>();
			
			while(end<s.length()){
				
	          char c=  s.charAt(end);          
	          
	        while (seen.contains(c)) {
	        	seen.remove(c);
	        	start++;
	        	}
	          
	        
	        seen.add(c);	        
	        maxlength=Math.max(maxlength, end - start + 1);
	      
	        end++;
	        
			}
			
			return maxlength;
			
		}
		

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(longestSubstring("abcabcbb")); //output: 3
		System.out.println(longestSubstring("bbbbb")); //output: 1
		System.out.println(longestSubstring("pwwkew")); //output: 3
	}

}
