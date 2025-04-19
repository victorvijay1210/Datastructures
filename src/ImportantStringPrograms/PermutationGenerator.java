package ImportantStringPrograms;

import java.util.*;

public class PermutationGenerator {

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];	
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void solve(int[] nums, int index, Set<List<Integer>> result) {
        if (index == nums.length - 1) {
            // Base case: add current permutation to result
            List<Integer> permutation = new ArrayList<>();
            for (int n : nums) {
                permutation.add(n);
            }
            result.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            solve(nums, index + 1, result);
            swap(nums, index, i); // backtrack
        }
    }

    public static Set<List<Integer>> getPermutations(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums == null || nums.length == 0) return result;
        solve(nums, 0, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Set<List<Integer>> permutations = getPermutations(nums);

        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}