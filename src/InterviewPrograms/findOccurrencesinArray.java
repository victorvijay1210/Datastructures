package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class findOccurrencesinArray {
	
	
	public static Map<Integer,Integer> findOccurrences(int[] nums){
		
		Map<Integer,Integer> map = new HashMap<>();
		
		
		for(Integer num:nums) {
			
			map.put(num, map.getOrDefault(num, 0)+1);
		}
			
		return map;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
         Map<Integer,Integer> entry=  findOccurrences(nums);
        
        for(Map.Entry<Integer, Integer> en: entry.entrySet()) {
        	
        	System.out.println(en.getKey() +" , "+en.getValue());
        }
        
	}

}
