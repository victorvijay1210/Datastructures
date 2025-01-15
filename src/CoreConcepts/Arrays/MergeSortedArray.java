package CoreConcepts.Arrays;

import java.util.Arrays;

public class MergeSortedArray {
	
	
	public static boolean isSorted(int[] array) {		
	
		for(int i=1;i<array.length;i++) {
			
			if(array[i]<array[i-1]) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static int[] mergeSortedArray(int[] array1, int[] array2) {
		
		int i=0;
		int j=0;
		int k=0;
		
	     if(isSorted(array1)==false || isSorted(array2)==false) {
	    	 System.out.println("Given Array is not Sorted");
	    	 return null;
	     }
	     
	     
		
		int[] sortedArray = new int[array1.length + array2.length];
		
		while(i<array1.length && j<array2.length) {
			
			if(array1[i]<array2[j]) {
				sortedArray[k]=array1[i];
				i++;
			}
			else {
				sortedArray[k]=array2[j];
				j++;
			}
			k++;
		}
		
		while(i<array1.length) {
			sortedArray[k]=array1[i];
			i++;
			k++;
		}
		
		while(j<array2.length) {
			sortedArray[k]=array2[j];
			j++;
			k++;
		}
		
		
		return sortedArray;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,5};
		int[] arr2= {8,4,6};
		
		int[] arr3= {1,3,5};
		int[] arr4= {2,4,6};
	    System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));
		System.out.println(Arrays.toString(mergeSortedArray(arr3, arr4)));
	}

}
