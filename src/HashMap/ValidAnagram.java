package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	
	
	public static boolean isAnagram(String s, String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i=0; i<s.length();i++) {
			
		char schar =s.charAt(i);
		char tchar=t.charAt(i);
		
		map.put(schar, map.getOrDefault(schar, 0) +1);
		map.put(tchar, map.getOrDefault(tchar, 0) -1);
		
		}
		
		for(int totalvalue:map.values() )
		
		if(totalvalue!=0) {
			return false;
		}
		
		return true;
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t)); // Output: true
        
        s="rat";
        t="cat";
        System.out.println(isAnagram(s, t)); // Output: false
	}

}
