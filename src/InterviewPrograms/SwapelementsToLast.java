package InterviewPrograms;

import java.util.Arrays;

public class SwapelementsToLast {
	
	public static void MoveElementToLast(int[] ints, int element) {
		
		int i = 0;
		int j= ints.length-1;
		
		while(i<j) {
			
			if(ints[i]==element) {
				int temp = ints[i];
				ints[i]=ints[j];
				ints[j]=temp;
				j--;
			}
			
			else {
				i++;
		}
		}
			
		
	}
	
	

	public static void main(String[] args) {
		
		int[] ints = {1, 2, 0, 4, 5, 6, 0, 7};
		int element = 0;
	    MoveElementToLast(ints, element);
	    
     System.out.println(Arrays.toString(ints));
	
	}

}
