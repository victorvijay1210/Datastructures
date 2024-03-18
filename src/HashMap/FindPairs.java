package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairs {
	
	
	public static List<int[]> findPairs(int[] arr1, int[]arr2, int target){
		
		
		Set<Integer> set = new HashSet<>();
		List<int[]> pair = new ArrayList<>();
		
		for(int num1:arr1) {
			set.add(num1);
		}
		
		
		for (int num2 :arr2) {
			
			int comp= target-num2;
			
			if(set.contains(comp)) {
				pair.add(new int[] {comp,num2} );
			
			}
			
		    
					
					
		}
		
		return pair;
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {2, 4, 6, 8, 10};
	        int target = 7;

	        List<int[]> pairs = findPairs(arr1, arr2, target);
	        for (int[] pair : pairs) {
	            System.out.println(Arrays.toString(pair));
	        }

	        
	}

}
