package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class IntegerPermutations {
	
//	Time Complexity: O(n!)
//	Space Complexity O(n! * n) if all permutations are stored
	
	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		backTrack(result, nums, 0);
		return result;
	}
	
	public static void swap(int[] nums , int startIndex, int endIndex) {
		int temp = nums[startIndex];
		nums[startIndex]=nums[endIndex];
		nums[endIndex]=temp;
	}

	
	public static void backTrack(List<List<Integer>> resultSet, int[] nums,int index) {
		
		if(index==nums.length-1) {
			
			List<Integer> permutations = new ArrayList<>();
			
			for(int num:nums) {
				permutations.add(num);
			}
			
			resultSet.add(permutations);
			
		}
		
		for(int i=index;i<nums.length;i++) {
			swap(nums, index, i);
			backTrack(resultSet, nums, index+1);
			swap(nums, index, i);
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3}; // The Permutations and Combination of the given Integer can be calculated
        //By factorial of length of the Integer which is 3! = 3*2*1
		
        if(nums.length==0|| nums==null) {
        	return;
        }
        
        System.out.println(permute(nums));
        
	}

}
