package SortingAlgorithm;

import java.util.Arrays;

//Time Complexity: O(n log n)
//Space Complexity: O(n)
public class QuickSort {
	
	public static void quickSortSwaptHelper(int[] array, int startIndex, int endIndex) {		
		int temp = array[startIndex];
		array[startIndex]=array[endIndex];
		array[endIndex]=temp;	
	}

	public static int pivotIndex(int[] array, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		
		for(int i=pivotIndex+1;i<array.length;i++) {
			
			if(array[i]<array[pivotIndex]) {
				swapIndex++;
				quickSortSwaptHelper(array, swapIndex, i);
			}
			
		}
		
		quickSortSwaptHelper(array, pivotIndex, swapIndex);

					
		return swapIndex;		
	}
	
	public static void quickSort(int[] array,int startIndex, int endIndex) {
	 
		if(startIndex<endIndex) {
			 int pivotIndex = pivotIndex(array, startIndex, endIndex);	 
			 quickSort(array, startIndex, pivotIndex-1);
			 quickSort(array, pivotIndex+1, endIndex);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] unSortedArray =new int[] {4,2,6,5,1,3};	
		quickSort(unSortedArray, 0, unSortedArray.length-1);
      System.out.println(Arrays.toString(unSortedArray));
		
	}

}
