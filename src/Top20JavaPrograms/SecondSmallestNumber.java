package Top20JavaPrograms;

public class SecondSmallestNumber {
	
	
	public static int secondSmallest(int[]nums) {
		
		
		int smallest =Integer.MAX_VALUE;
		int secondsmallest =Integer.MAX_VALUE;;
		
		for(int n:nums) {
			
			if(n<smallest) {
				smallest=n;
			}
			else if(n<secondsmallest) {
				secondsmallest=n;
			}
		}
		
		
		return secondsmallest;
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		
		System.out.println(secondSmallest(a));
		System.out.println(secondSmallest(b));
		

	}

}
