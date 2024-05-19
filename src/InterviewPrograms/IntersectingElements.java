package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectingElements {

	//time complexity is O(n + m)
	// space complexity is O(n)
	public static List<Integer> intersectingElements(int[] array1, int[]array2){
		
		Set<Integer> set = new HashSet<>();
		List<Integer>intersecting = new ArrayList<Integer>();		
		
		for(Integer num1:array1) {
			set.add(num1);
		}
		
		for(Integer num2:array2) {
			
			if(set.contains(num2)) {
				intersecting.add(num2);
			}
		}
		
		
		
		return new ArrayList<Integer>(intersecting);
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array1= {1,2,3,4,5};
		int[] array2= {4,7,8,9,5};
		
		System.out.println(intersectingElements(array1, array2));
				
		}

	}


