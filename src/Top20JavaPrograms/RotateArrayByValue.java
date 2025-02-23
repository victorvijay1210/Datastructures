package Top20JavaPrograms;

import java.util.Arrays;

public class RotateArrayByValue {
	
	
	public static void reverseArray(int[] nums, int start, int end) {
		
		while(start<end) {
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void rotateArray(int[] nums, int k) {
		
		k=k%nums.length;
		
		//reverse whole array
		reverseArray(nums, 0, nums.length-1);
		
		
		//reverse first half of the array
		reverseArray(nums, 0, k-1);
		
		//reverse second half of the array
		reverseArray(nums, k, nums.length-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
	     int r=4;
		
	     rotateArray(arr, r);
	     
	     System.out.println(Arrays.toString(arr));
	     

	}

}
