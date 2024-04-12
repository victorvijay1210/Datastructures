package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
	
	//Time Complexity: O(n)
	//Space Complexity: O(n)
	public static Character firstNonRepeatingChar(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<str.length();i++) {
			
			 char strchr= str.charAt(i);
			
			map.put(strchr, map.getOrDefault(strchr, 0)+1);
					
		}
		
//		for(int i=0; i<str.length();i++){
//			 char strchr= str.charAt(i);
//			 
//			 if(map.get(strchr)==1) {
//				 return strchr;
//			 }
//		}
		
		for(Map.Entry<Character, Integer> entry :    map.entrySet()) {
			
			
			if(entry.getValue()==1) {
				return entry.getKey();
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
