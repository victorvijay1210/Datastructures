package InterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurance {
	
	
	
	public static boolean uniqueOccurance(int[] arr) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		
		
		for(Integer num: arr) {
			
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		Set<Integer> set = new HashSet<>(map.values());
		
		
		if(map.size()==set.size())return true;
		
		return false;
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {1,2,2,1,1,3};
		
	}

}
