package CoreConcepts.Arrays;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding new value in the given array
		int[] originalArray = {1,2,3,4,5};
		
		int [] newArray = Arrays.copyOf(originalArray, originalArray.length+1);
		
         newArray[newArray.length-1]=5;
         
       //  System.out.println(Arrays.toString(newArray));
         
         
         //sorting array
         int[] unsortedarray = {100,80,77,3,1,0};
         Arrays.sort(unsortedarray);
         System.out.println(Arrays.toString(unsortedarray));
         
         //Search using binary search
         int[] array = {100,80,77,3,1,0,12,45,33};
         
         System.out.println(Arrays.binarySearch(array, 45));
         
	}

}
