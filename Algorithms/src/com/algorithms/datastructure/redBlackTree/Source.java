package com.algorithms.datastructure.redBlackTree;

public class Source {

	public static void main(String[] args) {

	}

}

class Tree {
	public Node root;

	public void leftRotate(Node x) {
		Node y = x.right;
		x.right = y.left;

		if (y.left != null) {
			y.left.parent = x;
		}

		y.parent = x.parent;
		if (x.parent == null) {
			root = y;
		} else if (x.parent.left == x) {
			x.parent.left = y;
		} else {
			x.parent.right = y;
		}

		y.left = x;
		x.parent = y;
	}

	public void rotateRight(Node x) {
		Node y = x.left;
		x.left = y.right;

		if (x.left != null) {
			x.left.parent = y;
		}

		x.parent = y.parent;
		if (x.parent == null) {
			root = y;
		} else if (x.parent.left == x) {
			x.parent.left = y;
		} else {
			x.parent.right = y;
		}

		y.right = x;
		x.parent = y;
	}
}

class Node {
	public Node left;
	public Node right;
	public Node parent;
	public int color;
	public int key;
}