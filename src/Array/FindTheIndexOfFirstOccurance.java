package Array;

public class FindTheIndexOfFirstOccurance {
	
	//Time Complexity: O(n)
	//Space Complexity: O(1)
	public static int strStr( String haystack, String needle) {
		
		if( needle==null || needle.length()==0) {
			return 0;
		}
		
		if(haystack==null || haystack.length()<needle.length()) {
			return -1;
		}
		
	    int index=haystack.indexOf(needle);
		
		
		return index;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println(strStr("sadbutsad", "sad"));    // Output: 0
	        System.out.println(strStr("leetcode", "leeto"));   // Output: -1

	}

}
