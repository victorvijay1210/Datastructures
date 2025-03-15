package Top20JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Anagram{ 
	
//	Time Complexity: O(n)
//	Space Complexity: O(n) (due to HashMap storage)
	public static Boolean isAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);
		
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<str2.length();i++) {
			char c = str2.charAt(i);
		
			map.put(c, map.getOrDefault(c,0)-1);
		}
		
		
		for(int n: map.values()) {
			
			if(n!=0) {
				return false;
			}
		}
		
		
		return true;
		
		
		
		
	}
	
	
  
	 public static void main(String args[]) { 
		 
		 System.out.println(isAnagram("rat", "art"));
		 System.out.println(isAnagram("rat", "cat"));
		 
	    }
}
