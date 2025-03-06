package SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
	
	
	//This method works only for sorted arrays
	public static int[] merge(int[] array1, int[] array2) {
		
		int[] combinedArray = new int [array1.length + array2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<array1.length && j <array2.length) {
			
			if(array1[i]<array2[j]) {
				combinedArray[k]=array1[i];
				i++;
				k++;
			}
			else {
				combinedArray[k]=array2[j];
				j++;
				k++;
			}
		}
		
		while(i<array1.length) {
			combinedArray[k]=array1[i];
			i++;
			k++;
		}
		
		while(j<array2.length) {
			combinedArray[k]=array2[j];
			j++;
			k++;
		}
			
		
		return combinedArray;
						
	}
	
	
	
	public static int[] mergeSort(int[] array) {
		
		if(array.length==1) {
			return array;
		}
			
				
		int midIndex = array.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
		int[] right= mergeSort(Arrays.copyOfRange(array, midIndex, array.length));	
		return merge(left, right);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unSortedArray = new int[] {4,2,6,5,1,3};
	    int[] sortedArray=	mergeSort(unSortedArray);		
		System.out.println(Arrays.toString(sortedArray));

	}

}
