package Array;

import java.util.Arrays;

public class RemoveElement {

	//Time Complexity: O(n)
	//Space Complexity: O(1)
	public static int removeelement(int[] numbers, int value) {
		
		int i=0;
		
		for(int j=0; j<numbers.length;j++) {
			
			if(numbers[j]!=value) {
				numbers[i]=numbers[j];
				i++;
			}
		}
		
		
		
		return i;
		
		
	}
	
	
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		int val=5;
		int length = removeelement(nums,val);
		System.out.println("Modified array:" + Arrays.toString(Arrays.copyOfRange(nums, 0, length)) + "New length:"+ length);
		
		// Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        int newLength1 = removeelement(nums1, val1);
        System.out.println("Test case 1: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)) +
                           "\nNew length: " + newLength1);
                           
        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int val2 = 6;
        int newLength2 = removeelement(nums2, val2);
        System.out.println("Test case 2: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)) +
                           "\nNew length: " + newLength2);
                           
        // Test case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int val3 = -1;
        int newLength3 = removeelement(nums3, val3);
        System.out.println("Test case 3: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)) +
                           "\nNew length: " + newLength3);
    
        // Test case 4
        int[] nums4 = {};
        int val4 = 1;
        int newLength4 = removeelement(nums4, val4);
        System.out.println("Test case 4: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)) +
                           "\nNew length: " + newLength4);
    
        // Test case 5
        int[] nums5 = {1, 1, 1, 1, 1};
        
        int val5 = 1;
        int newLength5 = removeelement(nums5, val5);
        System.out.println("Test case 5: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)) +
                           "\nNew length: " + newLength5);
    
	}

}
