package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;




	public class Solution {
		    public int lengthOfLastWord(String s) {
		        // Trim leading and trailing whitespace
		        s = s.trim();
		        
		        // Split the string by spaces
		        String[] words = s.split(" ");
		        
		        // If there are no words, return 0
		        if (words.length == 0) {
		            return 0;
		        }
		        
		        // Return the length of the last word
		        return words[words.length - 1].length();
		    }
		

	            public static void main(String[] args) {
	                Solution solution = new Solution();
	                
	                
	                
//	                String s1 = "Hello World";
//	                System.out.println(solution.lengthOfLastWord(s1));  // Output: 5
	                
	                String s2 = "   fly me   to   the moon  ";
	                System.out.println(solution.lengthOfLastWord(s2));  // Output: 4
	                
//	                String s3 = "luffy is still joyboy";
//	                System.out.println(solution.lengthOfLastWord(s3));  // Output: 6
	            }
		}


