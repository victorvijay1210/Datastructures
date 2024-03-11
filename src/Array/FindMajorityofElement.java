package Array;

public class FindMajorityofElement {
	
	
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
				count=1;
			}
		}
		
		return majority;
		
	}
	
	

	public static void main(String[] args) {
		
      int[] ar = {2,2,1,1,1,2,2};
     
      System.out.println(findMajarity(ar));
		
	}

}
