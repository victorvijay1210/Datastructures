package SortingAlgorithm;

import java.util.Arrays;


//Time complexity: O(n)^2
	//Space complexity: O(1)
public class BubbleSort {
	
	public static void bubbleSort(int[] array) {
		
		for(int i=array.length-1;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				
				if(array[j]>array[j+1]){
					
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {4,2,6,5,1,3};
		int[] array2 = new int[] {5, 2, 9, 1, 6};
		
          bubbleSort(array1);
          bubbleSort(array2);
          System.out.println(Arrays.toString(array1));
          System.out.println(Arrays.toString(array2));
      ;
	}

}
