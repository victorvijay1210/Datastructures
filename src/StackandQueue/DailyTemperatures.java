package StackandQueue;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
	
	
//	Time Complexity:O(n)
//	
//	Space Complexity:O(n)
//https://leetcode.com/problems/daily-temperatures/description/
	

	public static int[] solution(int[] temperature) {
		
		int n = temperature.length;
		int[] result = new int[n];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int index=n-1;index>=0;index--) {
			
			while(!stack.isEmpty() && temperature[stack.peek()]<=temperature[index]) {
				stack.pop();
			}
			
			if(!stack.isEmpty()) {
				result[index]= stack.peek()-index;
			}
			
			
			
			stack.push(index);
		}
		
		
		
		return result;
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: temperatures = [73,74,75,71,69,72,76,73]
//		Output: [1,1,4,2,1,1,0,0]
//		Input: temperatures = [30,40,50,60]
//		Output: [1,1,1,0]
		int[] temperature1 = new int[] {73,74,75,71,69,72,76,73};
		int[] temperature2 = new int[] {30,40,50,60};
		
		System.out.println(Arrays.toString(solution(temperature1)));
		System.out.println(Arrays.toString(solution(temperature2)));
	}

}
