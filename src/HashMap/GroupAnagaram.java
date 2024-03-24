package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagaram {

	
	public static List<List<String>> groupAnagrams(String[] str){
		
		Map<String, List<String>> maping = new HashMap<>();	
		
		
		for (String s : str) {
			   
		char[] chars =s.toCharArray();
		
		Arrays.sort(chars);
		
		String string = new String(chars);
		
		
		if(maping.containsKey(string)) {
			maping.get(string).add(s);
		}
		else {
			List<String> grouping = new ArrayList<>();
			grouping.add(s);
			maping.put(string, grouping);
		}
		
 		}
		
		return new ArrayList<>(maping.values());
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("1st set:");
	        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

	        System.out.println("\n2nd set:");
	        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

	        System.out.println("\n3rd set:");
	        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

	}

}
