package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {
	
	
	public static String frequencySort(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		StringBuilder st = new StringBuilder();
		
		for(char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
		
		
	   list.sort((a,b)->{
		 return  b.getValue()-a.getValue();
	   });
	   
	   for(Map.Entry<Character, Integer> data:list) {
		    char ch=  data.getKey();
		    int val  =data.getValue();
		    st.append(String.valueOf(ch).repeat(val));
		    
	   }
		
		return st.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input : abbccc Output:cccbba
//
//		Input : aaaccc Output: aaaccc or cccaaa
//
//		Input:Aabbc Output: bbAac
		
		System.out.println(frequencySort("abbccc"));
		System.out.println(frequencySort("aaaccc"));
		System.out.println(frequencySort("Aabbc"));

	}

}
