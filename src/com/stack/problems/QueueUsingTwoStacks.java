package com.stack.problems;

import com.kiran.stackwitharray.StackUsingArray;

public class QueueUsingTwoStacks {
	
	private static StackUsingArray<Integer> stack1 = new StackUsingArray<>(10);
	private static StackUsingArray<Integer> stack2 = new StackUsingArray<>(10);

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
	
	public static int dequeue() throws Exception
	{
		if(stack1.isEmpty() && stack2.isEmpty()) {
			throw new Exception("No data");
		}
		if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
            		stack2.push(stack1.pop()); 
            }
        }
		return stack2.pop();
	}
}
