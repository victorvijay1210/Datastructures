package StackandQueue;

import java.util.Stack;

public class ReverseString {
	
	public static String stringReverse(String str) {
		
		Stack<Character> ch = new Stack<>();
				
		for(char c: str.toCharArray()) {
			
			ch.push(c);
			
			}
		
		
		StringBuffer st = new StringBuffer();
		
		
        while(!ch.empty()) {
        	st.append(ch.pop());
        }
		return st.toString();
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "Hello";
     
    System.out.println(stringReverse(str));     
     
		
		
		
	}

}
