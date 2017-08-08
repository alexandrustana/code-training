package com.algorithms.datastructure.queue;

public class Source {
	public static void main(String[] args) {
		Queue q = new Queue();

		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(4);

		q.dequeue();
		q.dequeue();
		q.dequeue();

		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(2);
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(4);

		q.print();
	}
}

class Queue {
	private int head = 0;
	private int tail = 0;
	private int capacity = 10;
	private int[] items = new int[capacity];

	public void enqueue(int x) {
		if (head == tail + 1)
			throw new IllegalStateException();
		items[tail % capacity] = x;
		tail = (tail + 1) % capacity;
	}

	public int dequeue() {
		if (head == tail)
			throw new IllegalStateException();
		int item = items[head];
		items[head] = 0;
		head = (head + 1) % capacity;
		return item;
	}

	public void print() {
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i] + " ");
		}
	}
}