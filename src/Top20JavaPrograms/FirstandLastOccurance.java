package Top20JavaPrograms;

import java.util.Arrays;

public class FirstandLastOccurance {
	
	public static int[] firstandLastOccurance(int[] nums,int x)  {
		
		int firstOccurance=-1;
		int lastOccurance=-1;
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==x && firstOccurance== -1)  {
				firstOccurance=i;
			}
			else if(nums[i]==x && firstOccurance!=-1) {
				lastOccurance=i;
			}
		}
		
		
		return new int[]{firstOccurance,lastOccurance};
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 }; 
        int x = 1; 
        
        System.out.println(Arrays.toString(firstandLastOccurance(arr, x)));
	}

}
