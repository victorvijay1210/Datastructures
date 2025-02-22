package Top20JavaPrograms;

public class SecondLargestNumber {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 ,99};
		
		
		
		int largestNumber = 0;
		
		int secondLargestNumber=0;
		
		
		for(int n: arr) {
			
			
			if(n>largestNumber) {
				
				largestNumber=n;
			}
			
			else if(n>secondLargestNumber) {
				
        	   secondLargestNumber=n;
			}
		}
		
		System.out.println(largestNumber);
		System.out.println(secondLargestNumber);

	}

}
