package SortingAlgorithm;

import java.util.Arrays;

//Approach: Dutch National Flag Algorithm.
//time complexity O(n)
//space complexity O(1)
public class SortColors {
	
	private static void swap(int[] array, int i,int j) {
		
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}
	
	public static void sort(int[] array) {
		
		int low=0;
		int mid=0;
		int high=array.length-1;
		
		while(mid<=high) {
			
			if(array[mid]==0) {
				swap(array, mid, low);
				mid++;
				low++;
			}
			else if(array[mid]==1) {
				mid++;
			}
			
			else if(array[mid]==2) {
				swap(array, mid, high);
                high--;
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2, 0, 1, 2, 0};
       sort(nums);
       System.out.println(Arrays.toString(nums));

	}

}
