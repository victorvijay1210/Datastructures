package InterviewProblems2026;

import java.util.Stack;
//https://leetcode.com/problems/baseball-game/?utm_source=chatgpt.com
public class BaseBall {

    public static void main(String[] args) {

        String[] operations = {"5", "2", "C", "D", "+"};

        Solution sol = new Solution();
        int result = sol.calPoints(operations);

        System.out.println("Output: " + result);
    }
}

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                stack.pop();
            } 
            else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } 
            else if (op.equals("+")) {
                int val1 = stack.pop();
                int val2 = stack.peek();
                int sum = val1 + val2;
                stack.push(val1);
                stack.push(sum);
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int result = 0;
        for (int num : stack) {
            result += num;
        }

        return result;
    }
}