package StackandQueue;


import java.util.Arrays;
import java.util.Stack;
//https://leetcode.com/problems/next-greater-element-ii/description/
public class NextGreaterElementCircular {
    
	//Time Complexity: O(n)
   //Space Complexity: O(n)
	public static int[] nextGreaterElements(int[]nums){
		
		int n = nums.length;
		int[] nextGreaterArray = new int[n];
		Arrays.fill(nextGreaterArray, -1);
		Stack<Integer> helperStack =  new Stack<Integer>();
		
		// Traversing array twice (circular behavior)		
		for(int i= 2*n-1;i>=0;i--) {
			int index = i%n;
			//following monotonic stack
			while(!helperStack.isEmpty()&& nums[index]>=helperStack.peek()) {
				helperStack.pop();
			}
			
			if(!helperStack.isEmpty()) {
			 nextGreaterArray[index]=helperStack.peek();
			}
			
			
			helperStack.push(nums[index]);
		}
		
		return nextGreaterArray;
	}

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElements(nums1)));  // Output: [2, -1, 2]

        int[] nums2 = {1, 2, 3, 4, 3};
        System.out.println(Arrays.toString(nextGreaterElements(nums2)));  // Output: [2, 3, 4, -1, 4]
    }
}
