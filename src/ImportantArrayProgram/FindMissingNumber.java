package ImportantArrayProgram;

public class FindMissingNumber {
	
	public static int missingNumber(int[] array) {
		
		int n = array.length+1;// we know that one number is missing so array length is added by 1
		
		
		int totalSum = n*(n+1)/2;
		
		int arraySum =0;
		
		for (int num: array) {
			
			arraySum= arraySum+num;
		}
		
		
		return totalSum-arraySum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 4, 5, 6};
		
		System.out.println(missingNumber(array));

	}

}
