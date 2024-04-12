package Array;

import java.util.Arrays;

public class RemoveDuplicates {

//print unique value & its length
	
	//Time Complexity: O(n)
	//Space Complexity: O(1)
	public static int removeDuplicateNumbers(int[] nums) {
		
		if(nums.length==0) {
			return 0;
		}
		
		int writepointer=1;
		
		for (int readpointer=1; readpointer<nums.length; readpointer++) {
			
			if(nums[readpointer]!=nums[readpointer-1]) {
				nums[writepointer]=nums[readpointer];
				writepointer++;
			}
		}
		
		
		return writepointer;
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		int[] num1 = {1,2,3,4,4,5,5};
		int uniquevalue =removeDuplicateNumbers(num1);
		System.out.println("Modifed array length is"+" " + uniquevalue);
		System.out.println("The unique value in the arraylist are"+" " + Arrays.toString(Arrays.copyOfRange(num1, 0, uniquevalue)));
	
		int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength1 = removeDuplicateNumbers(nums1);
        System.out.println("Test case 1: New length: " + newLength1);
        System.out.println("Test case 1: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));

        int[] nums2 = {1, 1, 2};
        int newLength2 = removeDuplicateNumbers(nums2);
        System.out.println("Test case 2: New length: " + newLength2);
        System.out.println("Test case 2: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));

        int[] nums3 = {-1, 0, 0, 0, 3, 3};
        int newLength3 = removeDuplicateNumbers(nums3);
        System.out.println("Test case 3: New length: " + newLength3);
        System.out.println("Test case 3: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));

        int[] nums4 = {};
        int newLength4 = removeDuplicateNumbers(nums4);
        System.out.println("Test case 4: New length: " + newLength4);
        System.out.println("Test case 4: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)));

        int[] nums5 = {1, 1, 1, 1, 1};
        int newLength5 = removeDuplicateNumbers(nums5);
        System.out.println("Test case 5: New length: " + newLength5);
        System.out.println("Test case 5: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)));
        
        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Test case 1: New length: 5
//            Test case 1: Unique values in list: [0, 1, 2, 3, 4]
//            Test case 2: New length: 2
//            Test case 2: Unique values in list: [1, 2]
//            Test case 3: New length: 3
//            Test case 3: Unique values in list: [-1, 0, 3]
//            Test case 4: New length: 0
//            Test case 4: Unique values in list: []
//            Test case 5: New length: 1
//            Test case 5: Unique values in list: [1]
//        */
//

		
	}

}
