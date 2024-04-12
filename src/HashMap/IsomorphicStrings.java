package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	//Space Complexity: O(n)
	//Time Complexity: O(n)
	public static boolean areIsomorphic(String s, String t) {
		
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		Map<Character, Character> map1 = new HashMap<Character, Character>();
		Map<Character, Character> map2 = new HashMap<Character, Character>();
		
		
		for(int i=0; i<s.length();i++) {
			
		  char schar= s.charAt(i);
		  char tchar= t.charAt(i);
			
			
		  if(map1.containsKey(schar) && map1.get(schar)!=tchar) {
			  return false;
		  }
			
		  if(map2.containsKey(tchar) && map2.get(tchar)!=schar) {
			  return false;
		  }
			
			map1.put(schar, tchar);
			map2.put(tchar, schar);
			
		}
		
		
		return true;
		
	}
	
	

	public static void main(String[] args) {
		   String s = "egg";
           String t = "add";
           System.out.println(areIsomorphic(s, t)); // Output: true

           s = "foo";
           t = "bar";
           System.out.println(areIsomorphic(s, t)); // Output: false

	}

}
