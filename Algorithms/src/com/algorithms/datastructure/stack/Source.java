package com.algorithms.datastructure.stack;

public class Source {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(1);
		s.push(3);
		s.push(5);
		s.push(2);
		s.push(4);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}

class Stack {
	private int top = 0;
	private int capacity = 10;
	private int[] items = new int[capacity];

	public boolean isEmpty() {
		return top == 0;
	}

	public void push(int item) {
		if (top == capacity)
			throw new IllegalStateException();
		items[top++] = item;
	}

	public int pop() {
		if (isEmpty())
			throw new IllegalStateException();
		int item = items[top - 1];
		top--;
		return item;
	}
}