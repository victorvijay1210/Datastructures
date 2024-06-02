package Array;

import java.util.Arrays;

public class MoveZeros {
	
	public static void moveZeroes(int[] nums) {
		
		int size= nums.length;
		
		if(size==0||size==1) {
			return;
		}
		
		int nz=0;
		int z=0;
		
		while(nz<size) {
			
			if(nums[nz]!=0) {
				int temp = nums[nz];
				nums[nz]=nums[z];
				nums[z]=temp;
				nz++;
				z++;
			}
			else {
				nz++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {0, 1, 0, 3, 12};
	 	moveZeroes(nums1);
		System.out.println(Arrays.toString(nums1));

	}

}
