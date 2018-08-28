package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

//1. Scan the infix expression from left to right.
//2. If the scanned character is an operand, output it.
//3. Else,
//…..3.1 If the precedence of the scanned operator is greater than the precedence of the operator in 
//the stack(or the stack is empty), push it.
//…..3.2 Else, Pop the operator from the stack until the precedence of the scanned operator is less-equal to the precedence of the operator residing on the top of the stack. Push the scanned operator to the stack.
//4. If the scanned character is an ‘(‘, push it to the stack.
//5. If the scanned character is an ‘)’, pop and output from the stack until an ‘(‘ is encountered.
//6. Repeat steps 2-6 until infix expression is scanned.
//7. Pop and output from the stack until it is not empty.

public class InfixToPostFix {

	public static void main(String[] args) throws Exception {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		String postFix = convertInfixToPostFix(exp);
		System.out.println(postFix);
	}

	private static String convertInfixToPostFix(String exp) throws Exception {
		String result = "";
		StackUsingArray<Character> stack = new StackUsingArray<>(20);
		
		for (int i = 0; i < exp.length(); ++i) {
			char c = exp.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				result += c;
			} 
			else if(c == '(') {
				stack.push(c);
			}
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && Prec(stack.peek()) >= Prec(c)) {
					result += stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}

	static int Prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}
}
