package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class SortStackUsingTempStack {

	public static void main(String[] args) throws Exception{
		StackUsingArray<Integer> stack = new StackUsingArray<>(10);
		stack.push(4);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.printStack();
		System.out.println();
		stack = sortStack(stack);
		stack.printStack();
	}

	private static StackUsingArray<Integer> sortStack(StackUsingArray<Integer> stack) throws Exception{
		StackUsingArray<Integer> tempStack = new StackUsingArray<>(10);
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek() > temp) {
				stack.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		return tempStack;
	}

}
