package Array;


public class MaxProfit {

	
	public static int maxProfit(int[] prices) {
		
		int minprice = Integer.MAX_VALUE;
		int maxprice=0;
		
		
		for(int price:prices) {
			minprice= Math.min(minprice, price);
		    int profit=price-minprice;
		    maxprice=Math.max(maxprice, profit);
			
		}
		
		return maxprice;
		
	}
	
	
	public static void main(String[] args) {
		
		  int[] originalprices = {7, 1, 5, 3, 6, 4};
		  
		  int orginalprofit= maxProfit(originalprices);
		  
		  System.out.println("The Maximum Profit of the given Array is"+" : "+ orginalprofit);
		  
	      int[] prices1 = {7, 1, 5, 3, 6, 4};
	        int profit1 = maxProfit(prices1);
	        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"
	        
	        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
	        int profit2 = maxProfit(prices2);
	        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

	        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
	        int profit3 = maxProfit(prices3);
	        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"

	        int[] prices4 = {3, 2, 6, 5, 0, 3};
	        int profit4 = maxProfit(prices4);
	        System.out.println("Test case 4: Maximum profit: " + profit4); // prints "Maximum profit: 4"

	        int[] prices5 = {2, 4, 1};
	        int profit5 = maxProfit(prices5);
	        System.out.println("Test case 5: Maximum profit: " + profit5); // prints "Maximum profit: 2"
	}

}
