package HashMap;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
public class RansomNote {

	
	//Time Complexity: O(m + n)
	//Space Complexity: O(n)
	    public static boolean canConstruct(String ransomNote, String magazine) {
	        Map<Character, Integer> map = new HashMap<>();

	        // Count character occurrences in magazine
	        for (char c : magazine.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Check if ransomNote can be formed
	        for (char c : ransomNote.toCharArray()) {
	            if (!map.containsKey(c) || map.get(c) == 0) { // Check if char is missing or exhausted
	                return false;
	            }
	            map.put(c, map.get(c) - 1);
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(canConstruct("aa", "aab")); // Output: true
	        System.out.println(canConstruct("a", "b"));    // Output: false
	        System.out.println(canConstruct("abc", "ab")); // Output: false
	    }
	}
	
	

