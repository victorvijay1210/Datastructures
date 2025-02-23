package Top20JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPairs {
	
	public static List<int[]> pairSums(int[]nums, int sum){
		
		if(nums.length==0){
			return null;
		}
		
		List<int[]>pair=new ArrayList<>();
		
		int i=0;
		int j=nums.length-1;
		
		while(i<j) {
			
			int target=nums[i]+nums[j];
			
			if(target==sum) {
				pair.add( new int[] {nums[i],nums[j]});
				i++;
				j--;
			}
			else {
				i++;
				
			}
			
		}
		
		
		
		
		return pair;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		List<int[]> p= pairSums(arr, sum);
		
		for(int[] n:p) {
			
			System.out.println(Arrays.toString(n));
			
		}
		
		
		

	}

}
