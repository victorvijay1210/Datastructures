package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {

	//time complexity is O(n + m)
	//space complexity is also O(n + m)
	public static char findDifference(String s, String t) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		
		for(char st1: s.toCharArray()) {
			map.put(st1, map.getOrDefault(st1, 0)+1);
		}
		
        for(char st2: t.toCharArray()) {
        	map.put(st2, map.getOrDefault(st2, 0)+1);
		}
		
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			  if(entry.getValue()==1) {
				  return entry.getKey();
			  }
		}
        
		return 0 ;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="abcd";
		String t="abcde";
		
		System.out.println(findDifference(s, t));
		
	}

}
