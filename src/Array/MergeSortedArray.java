package Array;

import java.util.Arrays;

public class MergeSortedArray {
	
//Time Complexity: O(m + n)
//	Space Complexity: O(1)
	public static void mergeSortedArray(int []numbers1, int m, int[] numbers2, int n) {
		
		int i = m-1;
		int j= n-1;
		int k = m + n -1;
		
		while(i>=0&&j>=0) {
			
			if(numbers1[i]>numbers2[j]) {
				
				numbers1[k]=numbers1[i];
				i--;
				
			}
			else {
				numbers1[k]=numbers2[j];
				j--;
			}
			
			k--;
		}
	
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		int[] num1 = {1,2,1,0,0,0};
        int m = 3;
        int[] num2= {2,5,6};
        int n=3;
        mergeSortedArray(num1, m, num2, n);
        System.out.println("The Sorted merged array is"+":"+ Arrays.toString(num1));
        
        
        
	}

}
