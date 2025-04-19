package DynamicPrograming;

import java.util.Arrays;

//https://leetcode.com/problems/longest-increasing-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
public class LongestIncreasingSubsequence {

	//Time complexity: O(n^2)
	//Space complexity: O(n)
	public static int lengthOfLIS(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);

		for (int i = 1; i < nums.length; i++) {

			for (int j = 0; j <= i; j++) {

				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}

		int maxValue = 0;

		for (int value : dp) {

			maxValue = Math.max(value, maxValue);
		}

		return maxValue;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
		System.out.println(lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
		System.out.println(lengthOfLIS(new int[] { 7, 7, 7, 7, 7, 7, 7 }));

	}

}