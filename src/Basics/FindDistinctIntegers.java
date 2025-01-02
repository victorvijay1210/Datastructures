package Basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDistinctIntegers {

    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        
        // Create sets to store distinct integers from nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements from nums1 and nums2 to their respective sets
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Create lists to store distinct integers not present in the other array
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        // Find distinct integers in nums1 that are not present in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        
        // Find distinct integers in nums2 that are not present in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        
        // Add the lists to the answer
        answer.add(list1);
        answer.add(list2);
        
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result1 = findDistinctIntegers(nums1, nums2);
        System.out.println(result1); // Output: [[1, 3], [4, 6]]
        
        int[] nums3 = {1, 2, 3, 3};
        int[] nums4 = {1, 1, 2, 2};
        List<List<Integer>> result2 = findDistinctIntegers(nums3, nums4);
        System.out.println(result2); // Output: [[3], []]
    }
}
