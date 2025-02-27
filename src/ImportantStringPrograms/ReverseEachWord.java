package ImportantStringPrograms;

import java.util.Iterator;

public class ReverseEachWord {
	
	
	public static String revEachWord(String str) {
		
		String[] s=str.split(" ");
		
		String rev =" ";

			
		for(int i=0; i< s.length;i++) {
			StringBuilder sb = new StringBuilder(s[i]);
			rev = rev + sb.reverse().append(" ").toString();
		}
		
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Input: Java is good programming langauges
		
		System.out.println(revEachWord("Java is good programming langauges"));
		
	}

}
