package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

	public class Solution {
		
		public int maxArea(int[] height) {
	        int maxArea = 0;
	        int left = 0;
	        int right = height.length - 1;
	        
	        while (left < right) {
	            int currentArea = Math.min(height[left], height[right]) * (right - left);
	            maxArea = Math.max(maxArea, currentArea);
	            
	            if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        
	        return maxArea;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
	        System.out.println(solution.maxArea(height)); // Output: 49
	    }
	}
		
	
