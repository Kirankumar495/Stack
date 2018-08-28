package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class ReverseStack {

	public static void main(String[] args) throws Exception{
		StackUsingArray<Integer> stack = new StackUsingArray<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.printStack();
		System.out.println();
		reverseStack(stack);
		stack.printStack();
	}
	
	public static void reverseStack(StackUsingArray<Integer> stack) throws Exception {
		if(stack.isEmpty())
			return;
		Integer data = (Integer) stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, data);
		
	}
	
	public static void insertAtBottom(StackUsingArray<Integer> stack, int data) throws Exception{
		if(stack.isEmpty()) {
			stack.push(data);
		}
		else {
			int temp = stack.pop();
			insertAtBottom(stack, data);
			stack.push(temp);
		}
	}

}
