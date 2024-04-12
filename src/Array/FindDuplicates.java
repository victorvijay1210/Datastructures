package Array;

import java.util.Arrays;

public class FindDuplicates {
	//TimeComplexity-O(n)
	//O(1)
	public static int findDuplicates(int[] num) {
		
		if(num.length==0) {
			return 0;
		}
		
		int writepointer = 0;
		
		for(int readpointer=1; readpointer<num.length; readpointer++) {
			
			if(num[readpointer]==num[readpointer-1]) {
				num[writepointer]=num[readpointer];
				writepointer++;
			}
		}
		
		
		
		return writepointer;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2,3,4,4,5,5};
		
		int duplicates= findDuplicates(num1);
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(num1, 0, duplicates)));
	}

}
