package Array;

public class FindMajorityofElement {
	
	//Time Complexity: O(n)
	//Space Complexity: O(1)
	public static int findMajarity(int[] array) {
		
		int majority = array[0];
		int count =1;
		for(int i=0;i<array.length;i++) {
			
			if(majority==array[i]) {
				count ++;
			}
			else {
				count --;
			}
			
			if(count==0) {
				majority=array[i];
				count=1;//resetting the count once its came down as zero
			}
			
			
		}
		
		return majority;
		
	}
	
	

	public static void main(String[] args) {
		
      int[] ar = {2,2,1,1,1,2,2};
    
      System.out.println(findMajarity(ar));
      
      int[] a = {3,3,1,1,1,3,3,3,3,1,1,1,1};
		
      System.out.println(findMajarity(a));
	}

}
