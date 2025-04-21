package Backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/?envType=study-plan-v2&envId=top-interview-150
public class Combinations {
	//Time complexity:  O(C(n, k) * k)
	//Space complexity: O(C(n, k) * k)
	public static List<List<Integer>> combination(int n, int k){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> combination = new ArrayList<Integer>();
		backtracking(result, combination, n, k, 1);
		return result;
		
	}
	
	public static void backtracking(List<List<Integer>> resultSet, List<Integer> combination, int n, int k, int index) {
		
		if(combination.size()==k) {
			
			resultSet.add(new ArrayList<Integer>(combination));
		}
		
		for(int i=index;i<=n;i++) {
			
			combination.add(i);
			backtracking(resultSet, combination, n, k, i+1);
			combination.remove(combination.size()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<List<Integer>> solution=  combination(4, 2);
		System.out.println(solution);

	}

}
