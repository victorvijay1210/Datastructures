package Array;

//https://leetcode.com/problems/integer-to-roman/description/
public class IntegerToRoman {
	
	
//	Time:O(n)
//	Space:O(n)

	public static String romanValues(int num) {
		
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] symbols= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder roman = new StringBuilder();
		
		for(int i=0;i<values.length;i++) {
			
			while(num>=values[i]) {
				roman.append(symbols[i]);
				num=num-values[i];
			}
			
			
			
		}
		
		
		return roman.toString();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(romanValues(3749)); // Output: MMMDCCXLIX
        System.out.println(romanValues(58));   // Output: LVIII
        System.out.println(romanValues(1994)); // Output: MCMXCIV

	}

}
