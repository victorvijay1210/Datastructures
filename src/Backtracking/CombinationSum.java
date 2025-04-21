package Backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/?envType=study-plan-v2&envId=top-interview-150
public class CombinationSum {
//	Time Complexity: O(2^T) (due to the exponential number of possible combinations).
//	Space Complexity: O(k + T) (due to storing the results and recursion stack).
	
	public static List<List<Integer>> combinationSum(int[] nums, int target){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> combinationSum= new ArrayList<Integer>();
		backtracking(result, combinationSum, nums, target, 0);
		return result;
		
	}
	
	public static void backtracking(List<List<Integer>> resultSet, List<Integer>combinationsum, int[] nums, int target, int index) {
	
		//we track target to 0 by target-nums[i] so that we conclude we have got the combinations
		if(target==0) {
			resultSet.add(new ArrayList<Integer>(combinationsum));
		}
		
		
		for(int i=index;i<nums.length;i++) {
			
			if(nums[i]>target) {
				continue;
			}
			
			combinationsum.add(nums[i]);
			backtracking(resultSet, combinationsum, nums, target-nums[i], i);
			combinationsum.remove(combinationsum.size()-1);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(combinationSum(new int[] {2,3,6,7}, 7));
		System.out.println(combinationSum(new int[] {2,3,5}, 8));
	}

}
