package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class PostFixExpEvaluation {

	public static void main(String[] args) throws NumberFormatException, Exception {
		String str = "123*+5-";
		int res = postFixEvaluate(str);
		System.out.println(res);
	}
	
	public static int postFixEvaluate(String exp) throws NumberFormatException, Exception {
		StackUsingArray<Integer> stack = new StackUsingArray<>(20);
		
		for(int i = 0 ;i < exp.length();i++) {
			char c = exp.charAt(i);
			if (Character.isDigit(c)) {
				stack.push(Integer.parseInt(""+ c));
			}
			else if(c == '+') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				int res = op1 + op2;
				stack.push(res);
			}
			else if(c == '-') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				int res = op1 - op2;
				stack.push(res);
			}
			else if(c == '*') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				int res = op1 * op2;
				stack.push(res);
			}
			else if(c == '/') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				int res = op2 / op1;
				stack.push(res);
			}
		}	
		return stack.pop();
		
	}
}
