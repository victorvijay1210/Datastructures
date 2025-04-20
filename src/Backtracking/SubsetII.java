package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/
public class SubsetII {
	
	//Time:O(n — 2^n)
    //Space:O(n — 2^n)
   public static List<List<Integer>> subset(int[] nums){
	   
	 List<List<Integer>> result = new ArrayList<List<Integer>>();
	 
	 Arrays.sort(nums);
	 
	 backtrack(result, new ArrayList<Integer>(), nums, 0);
	   
	return result;
		
	}
   
   public static void backtrack(List<List<Integer>> resulset, List<Integer> tempresult, int[] nums, int index) {
	   
	   resulset.add(new ArrayList<Integer>(tempresult));
	   
	   for(int i=index;i<nums.length;i++) {
		   
		   if(i>index && nums[i]==nums[i-1]) {//Skips if its duplicate
			   continue;
		   }
		   
		   tempresult.add(nums[i]);
		   
		   backtrack(resulset, tempresult, nums, index+1);
		   
		   tempresult.remove(tempresult.size()-1);
	   }
	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //[1,2,2]

		System.out.println(subset(new int[] {1,2,2}));
		System.out.println(subset(new int[] {0}));
	}

}
