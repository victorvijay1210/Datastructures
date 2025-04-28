package LinkedInterviewPrograms;

import java.util.Arrays;

public class DecendingOrder {
  /*Write a program to find a leader elements (descending order) in an given array?
			Array={8,5,1,9,3}
			O/p: {9, 8,5,3,1}
   * 
   */
	
  //Time: O(n log n)
  //Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,5,1,9,3};

		Arrays.sort(nums);
		System.out.println("Before" +Arrays.toString(nums));
		int i=0;
		int j=nums.length-1;
		
		while(i<j) {
			int temp = nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
		
		
		
		
		System.out.println("After" +Arrays.toString(nums));
	}

}
