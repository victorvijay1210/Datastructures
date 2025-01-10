package CoreConcepts.Arrays;

import java.util.Arrays;

public class ReverseArray {
	
	
	public static int[]reverseArray(int[] array){	
		int left=0;
		int right=array.length-1;
		
		while(left<right) {
			
			int temp = array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
		}	
		return array;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] originalArray = {2,3,47,9,6,89,0};
		
		System.out.println("Reversed Array:"+ " " + Arrays.toString(reverseArray(originalArray)));

	}

}
