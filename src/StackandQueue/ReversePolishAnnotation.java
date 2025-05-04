package StackandQueue;

import java.util.Stack;

//Evaluate Reverse Polish Notation
//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=study-plan-v2&envId=top-interview-150
public class ReversePolishAnnotation {
	
//	Time Complexity: O(n)
//	Space Complexity: O(n)
	public static int evaReversePolish(String[] tokens) {
		
		  Stack<String> str = new Stack<>();
		  
		  for(String token:tokens) {
			  
			  if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")) {
				  int num2=Integer.parseInt(str.pop());//check the order first pop num2 and num1
				  int num1 = Integer.parseInt(str.pop());
				  int result =0;
				  if(token.equals("+")) {
					result = num1+num2;  
				  }
				  if(token.equals("-")) {
						result = num1-num2;  
				  }
				  if(token.equals("*")) {
						result = num1*num2;  
				  }
				  if(token.equals("/")) {
						result = num1/num2;  
				  }
				  
				  str.push(Integer.toString(result));
			  }
			  else {
				  str.push(token);
			  }
		  }
		
		return Integer.parseInt(str.peek());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: tokens = ["2","1","+","3","*"]
//		Output: 9
//		Input: tokens = ["4","13","5","/","+"]
//		Output: 6
//		Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//		Output: 22
		
		System.out.println(evaReversePolish(new String[] {"2","1","+","3","*"}));
		System.out.println(evaReversePolish(new String[] {"4","13","5","/","+"}));
		System.out.println(evaReversePolish(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
	}

}
