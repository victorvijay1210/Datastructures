package DynamicPrograming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/problems/word-break/description/?envType=study-plan-v2&envId=top-interview-150
public class WordBreak {
    
	//Time Complexity O(n^2)
	//Space Complexity O(n)
	public static boolean wordBreak(String s, List<String> wordlist) {

		// Convert the dictionary to a set for O(1) lookups
		Set<String> words = new HashSet<>(wordlist);

		// Find the maximum word length in the dictionary
		int maxWordLength = 0;
		for (String word : wordlist) {
			maxWordLength = Math.max(maxWordLength, word.length());
		}

		int n = s.length();

		boolean[] dp = new boolean[n + 1];

		// Base case: empty string is valid
		dp[0] = true;

		// Check prefixes of length up to maxLen
		for (int i = 1; i <= n; i++) {

			for (int j = i - 1; j >= Math.max(0, i - maxWordLength); j--) {

				if (dp[j] && words.contains(s.substring(j, i))) {

					dp[i] = true;
					break;
				}
			}

		}

		return dp[n];
	}

	public static void main(String[] args) {

		System.out.println(wordBreak("leetcode", List.of("leet", "code"))); // true
		System.out.println(wordBreak("applepenapple", List.of("apple", "pen")));// true
		System.out.println(wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));// false

	}
}
