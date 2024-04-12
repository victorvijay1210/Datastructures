package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
	
	//Time Complexity: O(n)
	//Space Complexity: O(n)
	public static boolean containsDuplicate(int[] nums , int k) {
		
		if(nums == null & nums.length==0) {
			return false;
		}
		
      Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i<nums.length; i++) {
			
			if(map.containsKey(nums[i]) && i - map.get(nums[i]) <=k) {
				return true;
				
			}
			
				map.put(nums[i], i);
			
			
		}
		
		
		return false;
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums1 = {1,2,3,1};
		int k1 = 3;
		System.out.println(containsDuplicate(nums1, k1));
		
		
		int [] nums2 = {1,0,1,1};
		int k2 = 1;
		System.out.println(containsDuplicate(nums2, k2));
		
		int [] nums3 = {1,2,3,1,2,3};
		int k3 = 2;
		System.out.println(containsDuplicate(nums3, k3));
		
	}

}
