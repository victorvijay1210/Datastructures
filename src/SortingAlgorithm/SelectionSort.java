package SortingAlgorithm;

import java.util.Arrays;


public class SelectionSort {
	
	//Time complexity: O(n)^2
	//Space complexity: O(1)
	
	public static void selectionSort(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			int minimumIndexValue=i;
			
			for(int j=i+1; j<array.length;j++) {
				
				if(array[j]<array[minimumIndexValue]) {
					minimumIndexValue=j;
				}
			}
			
			
			if(i!=minimumIndexValue) {
				int temp = array[i];
				array[i]=array[minimumIndexValue];
				array[minimumIndexValue]=temp;
			}
		
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {4,2,6,5,1,3};
		int[] array2 = new int[] {5, 2, 9, 1, 6};
		//{5, 2, 9, 1, 6}=> {1,2,9,5,6} (first iteration after selection sort)
		selectionSort(array1);
		selectionSort(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}
