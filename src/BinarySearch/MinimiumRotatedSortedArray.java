package BinarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinimiumRotatedSortedArray {
	
	public static int minRotatedSortedArray(int[] nums) {
		
		int left =0;
		int right=nums.length-1;
		
		for(int i=0;i<nums.length;i++) {
			
			int mid = left+(right-left)/2;
			
			if(nums[mid]>nums[right]) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return nums[left];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(minRotatedSortedArray(new int[] {3,4,5,1,2}));
	}

}
