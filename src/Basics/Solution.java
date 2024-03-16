package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

	public class Solution {
		
		public int minSubArrayLen(int target, int[] nums) {
	        if (nums == null || nums.length == 0)
	            return 0;
	        
	        int minLength = Integer.MAX_VALUE;
	        int sum = 0;
	        int left = 0;
	        
	        for (int right = 0; right < nums.length; right++) {
	            sum += nums[right];
	            while (sum >= target) {
	                minLength = Math.min(minLength, right - left + 1);
	                sum -= nums[left];
	                left++;
	            }
	        }
	        
	        return minLength == Integer.MAX_VALUE ? 0 : minLength;
	    }
	    
	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        
	        System.out.println(solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3})); // Output: 2
	        System.out.println(solution.minSubArrayLen(4, new int[]{1,4,4}));       // Output: 1
	        System.out.println(solution.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1})); // Output: 0
	    }
	}
		
	
