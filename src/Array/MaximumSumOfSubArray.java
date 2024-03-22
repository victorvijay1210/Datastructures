package Array;

import java.util.Arrays;

public class MaximumSumOfSubArray {
	
	public static int findMaxSubArray(int[] nums) {
		
		if(nums.length==0) {
			return 0;
			
		}
		
		
		int currentsum = nums[0];
		int maximumsum= nums[0];
		
		for(int i=1; i<nums.length;i++) {
			currentsum=Math.max(nums[i], currentsum+ nums[i]);
			maximumsum=Math.max(maximumsum, currentsum);
		}
		
		
		return maximumsum;
		
	}
	
	

	public static void main(String[] args) {
		
//		int[] numbers = {1, 2, 3, -4, 5, 6};
//		
//	    int maximumsum=	findMaxSubArray(numbers);
//		
//     System.out.println("The Maximum Sum of SubArray is"+" : " + maximumsum);
//     
     // Example 1: Simple case with positive and negative numbers
     int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
     int result1 = findMaxSubArray(inputCase1);
     System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);  

     // Example 2: Case with a negative number in the middle
     int[] inputCase2 = {1, 2, 3, -4, 5, 6};
     int result2 = findMaxSubArray(inputCase2);
     System.out.println("Example 2: Input: " + Arrays.toString(inputCase2) + "\nResult: " + result2); 

     // Example 3: Case with all negative numbers
     int[] inputCase3 = {-1, -2, -3, -4, -5};
     int result3 = findMaxSubArray(inputCase3);
     System.out.println("Example 3: Input: " + Arrays.toString(inputCase3) + "\nResult: " + result3); 

     // Example 4: Case with all positive numbers
     int[] inputCase4 = {1, 2, 3, 4, 5};
     int result4 = findMaxSubArray(inputCase4);
     System.out.println("Example 4: Input: " + Arrays.toString(inputCase4) + "\nResult: " + result4); 

     // Example 5: Case with alternating positive and negative numbers
     int[] inputCase5 = {1, -1, 1, -1, 1};
     int result5 = findMaxSubArray(inputCase5);
     System.out.println("Example 5: Input: " + Arrays.toString(inputCase5) + "\nResult: " + result5); 
	}

}
