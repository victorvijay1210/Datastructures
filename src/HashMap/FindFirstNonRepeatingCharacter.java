package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
	
	
	public static Character firstNonRepeatingChar(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length();i++) {
			
			 char strchr= str.charAt(i);
			
			map.put(strchr, map.getOrDefault(strchr, 0)+1);
					
		}
		
		for(int i=0; i<str.length();i++){
			 char strchr= str.charAt(i);
			 
			 if(map.get(strchr)==1) {
				 return strchr;
			 }
		}
		
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       System.out.println(firstNonRepeatingChar("leetcode"));
	        System.out.println(firstNonRepeatingChar("hello"));
	        System.out.println(firstNonRepeatingChar("aabbcc"));

	}

}
