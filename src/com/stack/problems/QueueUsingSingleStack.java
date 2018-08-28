package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class QueueUsingSingleStack {

	private static StackUsingArray<Integer> stack1 = new StackUsingArray<>(10);

	public static void main(String[] args) throws Exception{
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
	}
	
	public static void enqueue(int data) throws Exception {
		if(stack1.isFull())
			throw new Exception("Stack overflow");
		stack1.push(data);
	}
	
	public static int dequeue() throws Exception {
		if(stack1.size() == 1) {
			return stack1.pop();
		}
		int temp = stack1.pop();
		int data = dequeue();
		stack1.push(temp);
		return data;
	}

}
