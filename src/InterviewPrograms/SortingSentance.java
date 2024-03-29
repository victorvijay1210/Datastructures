package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortingSentance {

	
	public static String sortSentance(String str) {
		String[] words = str.split(" ");
		
		Map<Integer,String> map = new TreeMap<>();
		
		for(int i=0;i<words.length;i++) {		 
			 int length=words[i].length();
			int num= Integer.parseInt(String.valueOf(words[i].charAt(length-1)));
			map.put(num, words[i].substring(0, length-1));		
		}
		
		StringBuffer sortsentance =  new StringBuffer();
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			
			sortsentance.append(entry.getValue()).append(" ");
		}
		
		
		
		return sortsentance.toString().trim();
		
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println("Original Sentence: " + sortSentance(s));
    }

}
