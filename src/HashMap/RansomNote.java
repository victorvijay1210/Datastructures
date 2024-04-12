package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	
	//Time Complexity: O(m + n)
	//Space Complexity: O(n)
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : magazine.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for(char c: ransomNote.toCharArray()) {
			
		if(!map.containsKey(c) || map.get(c)==0 )	{
			return false;
		}
		  
		map.put(c, map.get(c)-1);	
		
	}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String ransomNote = "aabb";
	        String magazine = "aaabbc";
	        System.out.println(canConstruct(ransomNote, magazine)); // Output: true
	}

}
