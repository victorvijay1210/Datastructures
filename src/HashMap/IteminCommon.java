package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IteminCommon {
	
	//Time Complexity: O(n + m)
	//Space Complexity: O(n)
	public static boolean itemInCommon(int[]array1,int[] array2) {
		
		Map<Integer, Boolean> map = new HashMap<>();
		for(int num:array1) {
			map.put(num, true);
		}
		
		for(int num1:array2) {
			
			if(map.get(num1)!=null) return true;
		}
		
		
		return false;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] array1 = {1, 3, 5};
	        int[] array2 = {2, 4, 5};

	    System.out.println(itemInCommon(array1, array2));
	        

	}

}
