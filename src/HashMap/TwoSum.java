package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target ) {
		
		if (nums.length==0 || nums == null) {
			return new int[] {};
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
       for(int i=0; i<=nums.length; i++)	{
    	   
    	   int num = nums[i];
    	   
    	   int comp = target-num;
    	   
    	   if(map.containsKey(comp))  {
    		   return new int [] {map.get(comp),i};
    	   }
    		   map.put(nums[i], i);
    	   
    	   
       }
		
		
		
		return new int[] {};
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {2,7,11,15};
		int target1 = 9;	
       System.out.println(Arrays.toString(twoSum(nums1, target1))); //output: [0,1]
       
       
       int[] nums2= {3,2,4};
		int target2 = 6;	
      System.out.println(Arrays.toString(twoSum(nums2, target2))); //output: [1,2]
      
      int[] nums3= {3,3};
		int target3 = 6;	
    System.out.println(Arrays.toString(twoSum(nums3, target3))); //output: [0,1]
	}

}
