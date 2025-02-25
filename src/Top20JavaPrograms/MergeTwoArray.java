package Top20JavaPrograms;

import java.util.Arrays;

public class MergeTwoArray {
	
	public static void mergeArray(int[] arr1,int[]arr2,int[]arr3) {
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				k++;
				i++;
				
			}
			else {
				arr3[k]=arr2[j];
				k++;
				j++;
			}		
			
		}
		
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
			
		}
		
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			j++;
			k++;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr1 = {1, 3, 5, 7};  
	      int[] arr2 = {2, 4, 6, 8}; 

	      int n1= arr1.length;
	      int n2=arr2.length;
	      
	      int[] arr3= new int[n1+n2];//adding size
	      
	      mergeArray(arr1, arr2, arr3);
	      
	      System.out.println(Arrays.toString(arr3));
	}

}
