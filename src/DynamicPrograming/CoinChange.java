package DynamicPrograming;

//https://leetcode.com/problems/coin-change/description/?envType=study-plan-v2&envId=top-interview-150
public class CoinChange {

	//Time Complexity: O(amount * coins.length)

	//Space Complexity: O(amount)

	public static int coinChange(int[] coins, int amount) {
		
		// Check edge case
		if(amount<1) {
			return 0;
		}
		
		// Create DP array
		int [] dpCoins = new int[amount +1];
		
		for(int i=1;i<=amount;i++) {
			
			dpCoins[i]= Integer.MAX_VALUE;
			
			// Try each coin
			for(int coin:coins) {
				
				if(coin <=i && dpCoins[i-coin]!=Integer.MAX_VALUE) {
					
					dpCoins[i]=Math.min( dpCoins[i], 1+dpCoins[i-coin]);
				}
			}
			
		}
		
		
		return dpCoins[amount] == Integer.MAX_VALUE ? -1 : dpCoins[amount] ;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(coinChange(new int[] {1,2,5}, 11)); //output 3
    System.out.println(coinChange(new int[] {2}, 3)); // output -1
    System.out.println(coinChange(new int[] {1}, 0)); //output 0
	}

}
