package SlidingWindow;

import java.util.HashSet;

import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150
//Space Complexity: O(n) — due to the HashSet used to store unique characters.
//Time Complexity: O(n) — because both pointers (start and end) move through the string linearly, and the inner while loop runs efficiently with respect to the start pointer
public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubstring(String s) {
        int start = 0;
        int end = 0;    
        int maxlength = 0;

        // Using a HashSet to store characters we've seen
        Set<Character> seen = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);

            // If the character is already in the set, shrink the window from the start
            while (seen.contains(c)) {
                seen.remove(s.charAt(start));
                start++;
            }

            // Add the current character to the set
            seen.add(c);

            // Update the maximum length
            maxlength = Math.max(maxlength, end - start + 1);

            // Move the end pointer
            end++;
        }

        return maxlength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb")); // Output: 3
        System.out.println(longestSubstring("bbbbb")); // Output: 1
        System.out.println(longestSubstring("pwwkew")); // Output: 3
    }
}
	
	
	
	

	