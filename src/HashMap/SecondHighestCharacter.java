package HashMap;

import java.util.HashMap;
import java.util.Map;


//Time complexity o(n)
//Space complexity o(1)
public class SecondHighestCharacter {
	
	
	public static char secondHighestChar(String s) {
		
		Map<Character,Integer> map = new HashMap<>();
		int firstMax=0;
		int secondMax=0;
		
		for( char c:s.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for(int count: map.values()) {
			
			if(count>firstMax) {
				secondMax = firstMax;
				firstMax=count;
			}
			else if(count>secondMax && count< firstMax) {
				secondMax=count;
			}
		}
		
		for(Map.Entry<Character, Integer>data:map.entrySet()) {
			
			if(data.getValue()==secondMax) {
				return data.getKey();
			}
			
		}
		
		
		
		return 0;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbccccd";
		
    System.out.println(secondHighestChar(str));
	}

}
