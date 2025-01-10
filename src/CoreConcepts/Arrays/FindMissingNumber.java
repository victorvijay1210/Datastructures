package CoreConcepts.Arrays;

public class FindMissingNumber {
	
	public static int findMissingNumber(int[] array, int n) {
	    int sum = n * (n + 1) / 2;
	    for (int num : array) {
	        sum -= num; 
	    }
	    return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arrayData = {1, 2, 4, 5, 6};
		System.out.println(findMissingNumber(arrayData, 6));

	}

}
