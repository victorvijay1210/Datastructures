package StackandQueue;

import java.util.Stack;

 //https://leetcode.com/problems/min-stack/description/?envType=study-plan-v2&envId=top-interview-150
//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time using getMin()
//Time Complexity: O(1) for push, pop, top, and getMin.
//Space Complexity: O(n), where n is the number of elements in the stack.
public class MinStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
public void push(int num) {
	stack.push(num);
	if(minStack.isEmpty()||num<=minStack.peek()) {
	minStack.push(num)	;
	}
}

public void pop() {
	
	if(stack.peek().equals(minStack.peek())) {
		minStack.pop();
	}
		stack.pop();
}

public int top() {
	return stack.peek();
	
}

public int getMin() {
	return minStack.peek();
	
}

public static void main(String[] args) {

	MinStack minStack = new MinStack();	
	minStack.push(5);
	minStack.push(3);
    minStack.push(7);
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
}

}
