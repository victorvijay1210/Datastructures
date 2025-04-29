package Basics;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static int longestSubLength(String s){

		   if(s.length()==0){
		     return 0;
		   }
		   
		   Set<Character> seen = new HashSet<>();
		   
		   int left =0;
		   int right=0;
		   int maxLength=0;
		   
		   
		   while(right<s.length()){
		      char c= s.charAt(right);
		      
		      while(seen.contains(c)){
		        seen.remove(s.charAt(left));
		        left++;
		      }
		      
		      seen.add(c);
		      maxLength=Math.max(maxLength,right-left+1);
		      right++;
		   }
		     return maxLength;
		   }
		   
		  public static void main(String[] args) {
		      System.out.println(longestSubLength("abcabcbb"));
		      System.out.println(longestSubLength("bbbbb"));
		       System.out.println(longestSubLength("pwwkew"));
		     
		  }
		  
		  
}
