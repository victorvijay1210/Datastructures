package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSorting {

	
	public static void sortDescByNumber(String[] str, int[] nums){
	 
		  Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length;i++) {
	
			map.put(str[i], nums[i]);
		}
		
		 List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		 
          list.sort((a,b)->{
        	  return b.getValue()-a.getValue();
          }   
        		  );
          
          
       for(Map.Entry<String, Integer> data:list)	{
    	 
    	   System.out.println(data.getKey()+"="+data.getValue());
     }
		
	}
	
	public static void sortAsecByNumber(String[] str, int[] nums){
		 
		  Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length;i++) {
	
			map.put(str[i], nums[i]);
		}
		
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		list.sort((a,b)->{
			return a.getValue()-b.getValue();
		}
				);
		 
       
        
        
     for(Map.Entry<String, Integer> data:list)	{
  	 
  	   System.out.println(data.getKey()+"="+data.getValue());
   }
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String[] str = {"Alice", "Bob", "Charlie"};
		int[] nums= {88,75,93};
		
	   sortDescByNumber(str, nums);
	  sortAsecByNumber(str, nums);
		
	}

}
