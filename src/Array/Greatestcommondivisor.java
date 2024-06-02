package Array;

public class Greatestcommondivisor {
	//time complexity is O(n + m)
	//space complexity is O(1)
	public static String gcdofStrings(String str1, String str2) {
		
		if(!(str1+str2).equals(str2+str1)) {
			return "";
		}
		
		int gcdlength= gcd(str1.length(), str2.length());
		
		return str1.substring(0,gcdlength);
		
	}
	
	private static int gcd(int a, int b) {
	
		while(b!=0) {
		int temp = b;
		b=a%b;
        a=temp;
		}		
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example 1
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdofStrings(str1, str2)); // Output: "ABC"
        
     // Example 2
        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println(gcdofStrings(str1, str2)); // Output: "AB"
        
        // Example 3
        str1 = "LEET";
        str2 = "CODE";
        System.out.println(gcdofStrings(str1, str2)); // Output: ""

	}

}
