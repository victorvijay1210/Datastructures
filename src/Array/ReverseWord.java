package Array;

public class ReverseWord {
	
	//Time Complexity: O(n)
	//Space Complexity: O(n) 
	//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
	public static String reverseWords(String str) {
		
		str.trim();
       String[] words=str.split(" ");
	   StringBuilder reverse= new StringBuilder();
	 
		for(int i=words.length-1;i>=0;i--) {
			reverse.append(words[i]);
			reverse.append(" ");
			
		}
		
		
		return reverse.toString().trim();
		
	}
	
	

	public static void main(String[] args) {
		 // Test cases
        System.out.println(reverseWords("the sky is blue"));        // Output: "blue is sky the"
        System.out.println(reverseWords("  hello world  "));       // Output: "world hello"
        System.out.println(reverseWords("a good   example"));      // Output: "example good a"

	}

}
