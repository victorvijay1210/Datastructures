package SortingAlgorithm;

import java.util.Arrays;

//Time complexity: O(n)^2
	//Space complexity: O(1)
public class InsertionSort {
	
	public static void insertionSort(int[] array) {
		
		//for insertion sort we have to start from 1st index
		for(int i=1;i<array.length;i++) {
			
			int temp = array[i];
		    
			int j= i-1;
			
			while( j>-1 && temp<array[j]) {
				
				
				array[j+1]=array[j];
				array[j]=temp;
				j--;
				
			}
			
			
		}
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[] array1 = new int[] {4,2,6,5,1,3};
				int[] array2 = new int[] {5, 2, 9, 1, 6};
				
				insertionSort(array1);
				
				System.out.println(Arrays.toString(array1));

	}

}
