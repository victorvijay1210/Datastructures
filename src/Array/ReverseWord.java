package Array;

public class ReverseWord {
	
	
	public static String reverseWords(String str) {
		
		str.trim();
       String[] words=str.split("\\s+");
	   StringBuilder reverse= new StringBuilder();
	 
		for(int i=words.length-1;i>=0;i--) {
			reverse.append(words[i]);
			reverse.append(" ");
			
		}
		
		
		return reverse.toString();
		
	}
	
	

	public static void main(String[] args) {
		 // Test cases
        System.out.println(reverseWords("the sky is blue"));        // Output: "blue is sky the"
        System.out.println(reverseWords("  hello world  "));       // Output: "world hello"
        System.out.println(reverseWords("a good   example"));      // Output: "example good a"

	}

}
