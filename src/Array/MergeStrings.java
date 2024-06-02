package Array;

public class MergeStrings {
	//time complexity  O(n + m).
	//space complexity  O(n + m).
	public static String mergeStrings(String word1, String word2) {
		StringBuilder merged = new StringBuilder();
		int i = 0;
		int j = 0;
		
		while(i<word1.length() && j< word2.length()) {
			 merged.append(word1.charAt(i++));
	           merged.append(word2.charAt(j++));
		}
		// Append remaining characters of word1
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }
        
        // Append remaining characters of word2
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }
		
		

		return merged.toString();
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(mergeStrings("abc", "pqr"));   // Output: "apbqcr"
	        System.out.println(mergeStrings("ab", "pqrs"));  // Output: "apbqrs"
	        System.out.println(mergeStrings("abcd", "pq"));  // 

	}

}
