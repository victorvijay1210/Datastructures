package Array;

public class LengthofLastWord {
	
	
	
	public static int lengthOfLastWord(String str) {
		
		str = str.trim();
		
	  String[] word=str.split(" ");
	  
	  if(word.length==0) {
		  return 0;
	  }
			
		return word[word.length - 1].length();
		
	}
		

	public static void main(String[] args) {
		String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));  // Output: 5
        
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));  // Output: 4
        
       String s3 = "luffy is still joyboy";
       System.out.println(lengthOfLastWord(s3));  // Output: 6

	}

}
