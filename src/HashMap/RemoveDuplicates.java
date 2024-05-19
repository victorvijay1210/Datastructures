package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//Time Complexity: O(n)
		//Space Complexity: O(n)
public class RemoveDuplicates {

	public static ArrayList<Integer> removeDuplicate(List<Integer> list){
		
		HashSet<Integer> removeduplicate = new HashSet<Integer>(list);
		
		return new ArrayList<Integer>(removeduplicate)  ;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5));
		
		System.out.println(removeDuplicate(list));
		
		

	}

}
