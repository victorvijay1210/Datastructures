package StackandQueue;

import java.util.*;


//https://leetcode.com/problems/next-greater-element-i/description/
//Next greater element 1 problem
public class NextGreaterElement {
	//Time Complexity: O(N + M)
    //Space Complexity: O(M)

	public static int[] nextGreaterNumbers(int [] num1, int[] num2) {
		
		if(num1.length==0||num2.length==0) {
			return new int[0];
		}
		Map<Integer,Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<Integer>();
		
		//A monotonic decreasing stack to efficiently find the next greater element for each number in nums2	
		for(int num:num2) {
			
			while(!stack.isEmpty() && stack.peek()<num) {
				map.put(stack.pop(), num);
			}
			
			stack.push(num);
		}
		
		int[] result = new int[num1.length];
		
		for(int i=0;i<num1.length;i++) {
		result[i]= map.getOrDefault(num1[i], -1);
		}
		
		return result;
		
		
    
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterNumbers(nums1, nums2)));  // Output: [-1, 3, -1]
        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterNumbers(nums3, nums4))); //Output: [3,-1]
    }
}