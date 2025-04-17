package DynamicPrograming;

//https://leetcode.com/problems/climbing-stairs/description/?envType=study-plan-v2&envId=top-interview-150
public class ClaimbingStairs {
	
//	Time Complexity: O(n)
//	Space Complexity: O(n)
	public static int claimStair(int n) {
		
		if(n==1) {
			return 1;
		}
		
		int [] dp =new int[n +1];
		dp[1]=1;// we know that claim step 1 we need one way step 1
		dp[2]=2;// we know that claim step 1 we need one way 1 step + 1 step , 2 steps
		
		for(int i=3; i<=n;i++) {
			dp[i]= dp[i-1] + dp[i-2];
		}
		
		return dp[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(claimStair(2));//2 
		System.out.println(claimStair(3));//3
		System.out.println(claimStair(8));//36
	}

}
