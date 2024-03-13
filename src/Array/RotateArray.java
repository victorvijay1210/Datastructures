package Array;

import java.util.Arrays;

public class RotateArray {
	
	//*rotate array concept below
	//*k=k% array.length
	//*reverse first half(0 to k-1)
	//*reverse second half (k to last index of the array which is array.length-1)
	//*reverse whole array
	
	
	public static void ReverseArray(int[] ar , int start, int end) {
		
	
		while(start<end) {
		int temp =  ar[start];
		ar[start]=ar[end];
		ar[end]=temp;
		start++;
		end--;
		}
		
	}
	
	public static void rotate (int [] array, int k) {
		
		k= k % array.length;
		
		//not mandatory implementaion can we usefull when k is negative
		if(k<0) {
			k=k+array.length;
		}
		
		//reverse whole array
		ReverseArray(array, 0, array.length-1);
		
		//reverse first half
		ReverseArray(array, 0, k-1);
		
		//reverse second half
		ReverseArray(array, k, array.length-1);
		
		
		
		
	}
	

	public static void main(String[] args) {
	
		 int[] nums1 = {1, 2, 3, 4, 5,6,7};
         int k = 3;
         rotate(nums1, k);
         System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1)); 

	}
}
