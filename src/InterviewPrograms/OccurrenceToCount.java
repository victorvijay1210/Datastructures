package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceToCount {
    public static String convertToCount(String input) {
        if (input == null || input.isEmpty()) return "";
        
        Map<Character,Integer> map = new HashMap<>();
        StringBuffer string = new StringBuffer();
        
        for(int i=0; i<input.length();i++) {
        	
        	 char c=input.charAt(i);
        	 
        	 map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> values :map.entrySet()) {
        	
        	string.append(values.getKey()).append(values.getValue());
        }
        
        
        
		return string.toString();

      

       
    }

    public static void main(String[] args) {
        String input = "aabbbc";
        String output = convertToCount(input);
        System.out.println(output); // Output: a2b3c1
    }
}
