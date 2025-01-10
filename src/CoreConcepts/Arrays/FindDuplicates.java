package CoreConcepts.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	
	public static List<Integer> duplicateValues(int[] array){
		
     Set<Integer> seen = new HashSet<Integer>();
     List<Integer> duplicates = new ArrayList<Integer>();
     
     for(int num: array) {
    	 
    	 if(seen.contains(num)) {
    		 duplicates.add(num);
    	 }
    	 else {
    		 seen.add(num);
    	 }
     }
     
		return duplicates;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {100,80,77,77,1,0,12,45,80};
		
		System.out.println(duplicateValues(array));

	}

}
