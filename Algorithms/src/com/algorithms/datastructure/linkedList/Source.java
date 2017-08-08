package com.algorithms.datastructure.linkedList;

public class Source {

	public static void main(String[] args) {

	}

}

class List {
	private Node head;

	public Node search(int k) {
		if (head == null)
			return head;
		Node curr = head;
		while (curr.getK() != k && curr.getNext() != null) {
			curr = curr.getNext();
		}
		return curr;
	}

	public void insert(int x) {
		if (head == null) {
			head = new Node();
			head.setK(x);
			return;
		}
		Node temp = new Node();
		temp.setK(x);
		temp.setNext(head);
		head.setPrev(temp);
		head = temp;
	}

	public void delete(int k) {
		if (head == null) {
			throw new IllegalStateException();
		}
		Node temp = search(k);
		if (temp == head) {
			head = head.getNext();
		} else if (temp != null) {
			temp.getPrev().setNext(temp.getNext());
		}
		throw new IllegalStateException();
	}
}

class Node {
	private Node next;
	private Node prev;
	int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}