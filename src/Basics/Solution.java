package Basics;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        // Pointer to keep track of the position where non-zero elements should be moved
        int nonzeroIndex = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Move the non-zero element to the position pointed by nonzeroIndex
                nums[nonzeroIndex] = nums[i];
                // If there were zeros encountered before the current non-zero element,
                // those zeros will be replaced by the current non-zero element.
                // Hence, we need to replace the current element with 0.
                if (i != nonzeroIndex) {
                    nums[i] = 0;
                }
                // Increment the position pointer for non-zero elements
                nonzeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 1 3 12 0 0

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 0
    }
}

