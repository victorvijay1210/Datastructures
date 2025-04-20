package Backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/
public class Subsets {
	
   //Time Complexity: O(n × 2^n)
   //Space Comeplexity : O(n × 2^n)
	
	public static List<List<Integer>> subsets(int[] nums){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		backtrack(result, new ArrayList<>(),nums , 0);
		
		return result;
		
		
	}
	
	public static void backtrack(List<List<Integer>> resultset, List<Integer>tempset,int[] nums, int index) {
		
		
		resultset.add(new ArrayList<>(tempset));
		
		for(int i=index;i<nums.length;i++) {
			
			tempset.add(nums[i]);
			
			backtrack(resultset, tempset, nums,  i+1);
			
			tempset.remove(tempset.size()-1);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsets(new int[] {1,2,3}));
		

	}

}
