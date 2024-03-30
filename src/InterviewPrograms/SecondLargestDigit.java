package InterviewPrograms;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondLargestDigit {
	
	
	public static int secondLargestDigit(String s) {
				
		//TimeComplexity O(n log n)
		//SpaceComplexity O(n)
		TreeSet<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<>();
		
		for(char c: s.toCharArray()) {
			
        if(Character.isDigit(c)) {
        int num = Integer.parseInt(String.valueOf(c));
		set.add(num);
        }
		}
			
		for(Integer num: set) {
			list.add(num);
		}
		
		if(list.size()==1) {
			return -1;
		}
		
		if(list.isEmpty()) {
			return -1;
		}
		
		return list.get(1);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "dfa12321afd";
		String s2 = "abc1111";
		String s3 = "xyz";
		System.out.println(secondLargestDigit(s1));
		System.out.println(secondLargestDigit(s2));
		System.out.println(secondLargestDigit(s3));

	}

}
