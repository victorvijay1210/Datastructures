package TwoPointers;

import java.util.Arrays;

public class TwoSum {
	
	
	public static int[] twoSum (int [] numbers, int target) {
		
		int left =0;
		int right =numbers.length-1;
		
		while (left<right) {
			
			int currentsum = numbers[left] + numbers[right];
			
			if (currentsum==target) {
				return new int[] {left+1 , right+1};
			}
			else if(currentsum<target) {
			left++;
			}
			else {
			right--;
			}
			
		}
		
		
		return new int[0];
		
	}
	
	
	

	public static void main(String[] args) {
		
		//Test Case 1
		int[] numbers1 = {-1,0};
        int target1 = -1;
        System.out.println(Arrays.toString(twoSum(numbers1, target1)));

      //Test Case 2
         int[] numbers2 = {2,7,11,15};
        int target2 = 9;
        System.out.println(Arrays.toString(twoSum(numbers2, target2)));
      //Test Case 3
        int[] numbers3 = {2,3,4};
       int target3 = 6;
       System.out.println(Arrays.toString(twoSum(numbers3, target3)));
	}

}
