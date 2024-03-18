package HashMap;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	public static List<Integer> duplicates(int[] nums) {
		
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		List<Integer> duplicates = new ArrayList<Integer>();
		
	  for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
		
		  if(entry.getValue()>1) {
			  duplicates.add(entry.getKey());
		  }
		  
		
		  
	}
	return duplicates;	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> duplicates = duplicates(nums);
        System.out.println(duplicates); 
	}

}
