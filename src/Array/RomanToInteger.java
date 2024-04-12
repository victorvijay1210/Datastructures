package Array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	//Time Complexity: O(n)
	//Space Complexity: O(1)
  public static int romantoInt(String str) {
	  
	  Map<Character,Integer>romanValues= new HashMap<>();
	  
	   romanValues.put('I', 1);
       romanValues.put('V', 5);
       romanValues.put('X', 10);
       romanValues.put('L', 50);
       romanValues.put('C', 100);
       romanValues.put('D', 500);
       romanValues.put('M', 1000);
       
       int result =0;
       
       for(int i=0;i<str.length();i++) {
    	    
    	 int value=  romanValues.get(str.charAt(i));
    	 
    	 if(i+1<str.length() && romanValues.get(str.charAt(i+1))>value){
    		 result = result-value;
    	 }
    	 else {
    		 result = result+value;
    	 }
    	   
       }
	  
	  
	return result;
	  
  }
	
	
	
	public static void main(String[] args) {
		 String roman1 = "III";
         System.out.println(romantoInt(roman1));  // Output: 3
         
         String roman2 = "IV";
         System.out.println(romantoInt(roman2));  // Output: 4
         
         String roman3 = "IX";
         System.out.println(romantoInt(roman3));  // Output: 9
         
         String roman4 = "LVIII";
         System.out.println(romantoInt(roman4));  // Output: 58
         
         String roman5 = "MCMXCIV";
         System.out.println(romantoInt(roman5));  // Output: 1994

	}

}
