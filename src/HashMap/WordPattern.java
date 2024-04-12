package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	
	//Time Complexity: O(n)
	//Space Complexity: O(n)
	public static boolean wordPattern (String pattern, String s) {
		
		String[] word =	s.split(" ");
		
		if(pattern.length()!=word.length) {
			return false;
		}
		
	
	
	Map<Character, String> map = new HashMap<Character, String>();
	
	
	for(int i=0; i<pattern.length();i++) {
		
		char p1=  pattern.charAt(i);  
		
		String  w1=  word[i];
		
		if(map.containsKey(p1)) {
			
			if(!map.get(p1).equals(w1)) {
				return false;
			}
			
		}
			
		else {
			
				
				if(map.containsValue(w1)) {
					return false;
				}
				
			map.put(p1, w1);
			
		}
		}
		
			
		return true;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s)); // Output: true

        pattern = "abba";
        s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s)); // Output: false

        pattern = "aaaa";
        s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s)); // Output: false

        pattern = "abba";
        s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s)); // Output: false
	}

}
