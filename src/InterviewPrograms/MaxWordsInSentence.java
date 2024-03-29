package InterviewPrograms;

public class MaxWordsInSentence {
	
	
	public static int maxWords(String[] sentences) {
		
		int maxword=0;
		
		for(String str:sentences) {
		  String[] s=str.split(" ");
		  maxword=Math.max(maxword, s.length);
		}
		
		
		return maxword;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int maxWords = maxWords(sentences);
        System.out.println("Maximum number of words in a single sentence: " + maxWords); // Output: 6

	}

}
