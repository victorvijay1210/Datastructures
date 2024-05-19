package StackandQueue;

import java.util.*;

//time complexity of this code is O(n)
//space complexity of this code is O(n)
public class ValidParentheses {
    
	
	    public static boolean balancedParentheses(String str) {
	        Stack<Character> parentheses = new Stack<>();
	        
	        for( char c: str.toCharArray()) {
	        	
	        	   if(c=='('||c=='['||c=='{') {
	        		   parentheses.push(c);
	        	   }
	        	   
	        	   else {
	        		   
	        		   if(parentheses.isEmpty()) {
	        			   return false;
	        		   }
					
	        	
	        		Character chars=  parentheses.pop();
	        		
	        		if(c==')' && chars!='(' || c==']' && chars!='[' || c=='}' && chars!='{') {
	        			return false;
	        		}
				}
	        	
	        }
	        
	        
	        
	        
			return parentheses.isEmpty() ;
	        
	       
	    }

	    public static void main(String[] args) {
	        System.out.println(balancedParentheses("()")); // true
	        System.out.println(balancedParentheses("()[]{}")); // true
	        System.out.println(balancedParentheses("(]")); // false
	    }
	}



