package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {
	
	
	public static int singleNumber(int[] nums) {
		 Map<Integer,Integer> map = new HashMap<>();

	       for(Integer num: nums){
	           map.put(num, map.getOrDefault(num, 0)+1);
	       } 
	      
	      for(Entry<Integer, Integer> entry : map.entrySet() ){
	           if(entry.getValue()==1) {
					return entry.getKey();
				}


	      }

	    

	    return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,2,1};
       System.out.println(singleNumber(nums));
	}

}
