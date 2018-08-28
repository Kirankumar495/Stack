package com.kiran.stackwitharray;

public class MainClass {

	public static void main(String[] args) throws Exception {
		StackUsingArray<Integer> stack = new StackUsingArray<Integer>(10);
		stack.push(1);
		stack.push(2);
		stack.printStack();
		stack.pop();
		stack.printStack();
	}

}
