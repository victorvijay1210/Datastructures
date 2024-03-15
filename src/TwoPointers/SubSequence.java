package TwoPointers;

public class SubSequence {

	public static boolean IsSubsequence(String s, String t) {
		
		
		if (s.length()==0) {
			return true;
		}
		
		int i = 0;
		int j = 0;
		
		while(i<s.length() && j<t.length()) {
			
			if (s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}
			else {
				j++;
			}
			
			if (i==s.length()) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(IsSubsequence("abc", "ahbgdc"));  //true
     System.out.println(IsSubsequence("axc", "ahbgdc"));  //true
     
	}

}
