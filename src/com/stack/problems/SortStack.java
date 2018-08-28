package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class SortStack {

	public static void main(String[] args) throws Exception{
		StackUsingArray<Integer> stack = new StackUsingArray<>(10);
		sortStack(stack);
	}
	
	public static void sortStack(StackUsingArray<Integer> stack) throws Exception {
		if(stack.isEmpty())
			return;
		Integer data = (Integer) stack.pop();
		sortStack(stack);
		sortedInsert(stack, data);	
	}
	
	public static void sortedInsert(StackUsingArray<Integer> stack, int data) throws Exception{
		if(stack.isEmpty() || data > stack.peek()) {
			stack.push(data);
		}
		else {
			int temp = stack.pop();
			sortedInsert(stack, data);
			stack.push(temp);
		}
	}
}
