package Array;

import java.util.Arrays;

public class FindLongestCommonPrefix {
	
	public static String findLongestCommonPrifix(String [] strings) {
		
		if( strings.length==0) {
			return "";
		}
		
		Arrays.sort(strings);
		
		String fiststring= strings[0];
		String laststring=strings[strings.length-1];
		
		StringBuilder prefix = new StringBuilder();
		
		for(int i=0;i<fiststring.length();i++) {
			
			if(i<laststring.length()&&fiststring.charAt(i)==laststring.charAt(i)) {
				prefix.append(fiststring.charAt(i));
			}
			else {
				break;
			}
		}
		
		
		return prefix.toString();
	}
	

	public static void main(String[] args) {
		 // Test cases
        System.out.println(findLongestCommonPrifix(new String[]{"flower", "flow", "flight"})); // Output: "fl"
        System.out.println(findLongestCommonPrifix(new String[]{"dog", "racecar", "car"}));      // Output: ""
	}

}
