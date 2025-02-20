package Top20JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstRepeatingElementInArray {
	
	
	public static int firstRepeatedOccur(int[] nums) {
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		
		for(int i=0;i<nums.length;i++) {
			
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> n:map.entrySet()) {
			
			if(n.getValue()>=2) {
				return n.getKey();
			}
		}
		
		
		return 0;

		
	}
	
	
	

  
    // Driver method to test above method 
    public static void main (String[] args) throws java.lang.Exception 
    { 
        int[] nums1 = {10, 5, 3, 4, 3, 5, 6}; 
        int[] nums2 = {1,2,3,4,5}; 
        
        System.out.println(firstRepeatedOccur(nums1));
        System.out.println(firstRepeatedOccur(nums2));
    } 
} 