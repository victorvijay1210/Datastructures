package Top20JavaPrograms;

import java.util.HashMap;
import java.util.Map;

//Problem Statement:
//You are given an array of integers, and your task is to find how many pairs of identical elements can be formed from the given array. A pair is defined as two identical numbers.
//
//Write a program that:
//
//Counts the number of identical pairs in the given array.
//Outputs the total number of pairs.
//Input:
//An array of integers. For example: {1, 1, 1, 1, 1, 2, 2}.
//Output: 
//An integer representing the total number of pairs of identical elements in the array.


public class IdenticalCountPairs {
	
	public static int countIdenticalPairs(int[] nums) {
		
		Map<Integer,Integer> frequency = new HashMap<>();
		
		int paircount =0;
		
		for(int num:nums) {
			
			frequency.put(num, frequency.getOrDefault(num, 0)+1);
		}
		
		for( int count:frequency.values()) {
			
			paircount= paircount + count/2; //since we need pair 5/2 = 2, 2/2 =1 then total is 3
		}
		
		return paircount;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={1, 1, 1, 1, 1, 2, 2};
		
		System.out.println(countIdenticalPairs(nums));
	}

}
