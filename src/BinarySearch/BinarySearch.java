package BinarySearch;

public class BinarySearch {
	
	//Middle formula left+(right-left)/2
	//time complexity o(log n)
	//space complexity o(1)
	
	public static int binarySearch(int[]nums, int target) {
		
		int left =0;
		int right=nums.length-1;
		int middle = left +(right-left)/2;
		
	
		while(left<=right) {
			
			if(nums[middle]==target) return middle;
			
			if(target >nums[middle]){
				
				left= middle+1;
				
			}                                 
			
			else if( target <nums[middle]){
		        right = middle-1; 
			}
			
			
			middle = left +(right-left)/2;
		}
		
		
		
		return -1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {-1,0,3,5,9,12};
		int target1= 12;
		
      System.out.println(binarySearch(nums1, target1));
      
        int[] nums2 = {-1,0,3,5,9,12};
		int target2= 9;
		
     System.out.println(binarySearch(nums2, target2));
     

        int[] nums3 = {-1,0,3,5,9,12};
		int target3= 2;
		
  System.out.println(binarySearch(nums3, target3));
     
     
	}

}
