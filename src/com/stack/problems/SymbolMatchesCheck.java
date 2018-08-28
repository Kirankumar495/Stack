package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class SymbolMatchesCheck {

	public static void main(String[] args) throws Exception  {
		char exp[] = {'{','(',')','(','[',']'};
		
		System.out.println(checkforSymbolMatches(exp));
		
	} 

	private static boolean checkforSymbolMatches(char[] exp) throws Exception{
		StackUsingArray<Character> stack = new StackUsingArray<Character>(20);
		for(int i=0; i< exp.length;i++) {	
			char temp = exp[i];
			System.out.println(temp);
			if(temp == '{' || temp == '(' || temp == '[') {
				stack.push(temp);
			}
			else if(temp == '}') {
				if(!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				}
				else
					return false;
			}
			else if(temp == ']') {
				if(!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				}
				else
					return false;
			}
			else if(temp == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}
				else
					return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else
			return false;
		
	}

}
