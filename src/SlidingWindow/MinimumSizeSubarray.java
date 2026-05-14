package SlidingWindow;

public class MinimumSizeSubarray {
	
	  
	//minimumlenghth formula : Right-left + 1
	//Time Complexity: O(n)
	//Space Complexity: O(1)
	//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
	
	public static int minSubArrayLen(int target, int[] array) {
		
     if(array==null || array.length==0) {
    	 return 0;
    	 
     }
		
     int minimumlength = Integer.MAX_VALUE;
     
     int Sum = 0;
     
     int left =0;
     
     
     
     for(int right =0; right<array.length; right++) {
    	 
    	 Sum = Sum + array[right];
    	 
    	 while(Sum>=target) {
    		 minimumlength = Math.min(minimumlength, right-left+1);
            Sum = Sum - array[left];
            left++;
    	 }
    	 
     }
     
		
		return minimumlength == Integer.MAX_VALUE? 0 :minimumlength ;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3})); // Output: 2
	     System.out.println(minSubArrayLen(4, new int[]{1,4,4}));       // Output: 1
	     System.out.println(minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1})); // Output: 0
		
	}

}
