package com.kiran.stackwitharray;

public class StackUsingArray<T> {

	T[] stackArray = null;
	
	int capacity = 0;
	
	int top = -1;
	
	public StackUsingArray(int size) {
		stackArray = (T[]) new Object[size];
		capacity = size;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean isFull() {
		return (top+ 1) == capacity;
	}
	
	public void push(T data) throws Exception {
		if(isFull())
			throw new Exception("Stack is full");
		stackArray[++top] = data;
	}
	
	public T pop() throws Exception {
		if(isEmpty())
			throw new Exception();
		T data = stackArray[top];
		top--;
		return data;
	}
	
	public T peek() {
		return stackArray[top];
	}
	
	public void  printStack()
	{
		for(int i = 0; i <= top;i++) {
			System.out.print(stackArray[i]+ " ");
		}
	}
	
	public int size() {
		return top+1;
	}

}
