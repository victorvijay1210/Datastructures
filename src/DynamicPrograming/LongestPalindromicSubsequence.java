package DynamicPrograming;


//https://leetcode.com/problems/longest-palindromic-subsequence/description/

public class LongestPalindromicSubsequence {
	
	
	public static int longestPalindromicSubsequence(String s) {
		
		StringBuilder rev = new StringBuilder(s).reverse();
		int n = s.length();
		int m= rev.length();
		
		int[][] dp = new int[n+1][m+1];
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=m;j++) {
				
				if(s.charAt(i-1)==rev.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[n][m];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bbbab
		//cbbd
		System.out.println(longestPalindromicSubsequence("bbbab"));
		System.out.println(longestPalindromicSubsequence("cbbd"));
	}

}
