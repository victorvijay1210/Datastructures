package BinarySearch;

public class SearchindexPosition {
	
	
	//time complexity o(log n)
	//space complexity o(1)
public static int searchPosition(int[]nums, int target) {
		
		int left =0;
		int right=nums.length-1;
		int middle = left +(right-left)/2;
		
	
		while(left<=right) {
			
			if(nums[middle]==target) return middle ;
			
			if(target >nums[middle]){
				
				left= middle+1;
				
			}                                 
			
			else if( target <nums[middle]){
		        right = middle-1; 
			}
			
			
			middle = left +(right-left)/2;
		}
		
		
		
		return left;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int[] nums1 = {1,3,5,6};
		int target1= 5;//outpout 2
		
      System.out.println(searchPosition(nums1, target1));
      
        int[] nums2 = {1,3,5,6};
		int target2= 2;//outpout 1
		
     System.out.println(searchPosition(nums2, target2));
     

        int[] nums3 = {1,3,5,6};
		int target3= 7;//outpout 4
		
  System.out.println(searchPosition(nums3, target3));

	}

}
