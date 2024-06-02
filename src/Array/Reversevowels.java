package Array;

import java.util.HashSet;
import java.util.Set;

public class Reversevowels {
	//Time Complexity: O(n)
	//Space Complexity: O(n)
	public static String reverseVowels(String s) {
		
		char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
		Set<Character> vowelset = new HashSet<>();
		for(Character c:vowels) {
			vowelset.add(c);
		}
		char[] vowelchars=s.toCharArray();
		int i=0;
		int j=vowelchars.length-1;
		
		while(i<j) {
			
			if(vowelset.contains(vowelchars[i]) && vowelset.contains(vowelchars[j])) {
				char temp = vowelchars[i];
				vowelchars[i]=vowelchars[j];
				vowelchars[j]=temp;
				i++;
				j--;
			}
			
			else if(!vowelset.contains(vowelchars[i])) {
				i++;
			}
			
			else if(!vowelset.contains(vowelchars[j])) {
				j++;
			}
		}
		
		
		return new String(vowelchars);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("hello"));  // Output: "holle"
        System.out.println(reverseVowels("leetcode"));  // Output: "leotcede"

	}

}
