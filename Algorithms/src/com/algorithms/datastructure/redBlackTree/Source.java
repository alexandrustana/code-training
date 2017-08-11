package com.algorithms.datastructure.redBlackTree;

public class Source {

	public static void main(String[] args) {

	}

}

class RBTree {
	Node root = null;
	int BLACK = 0;
	int RED = 1;

	public void rotateLeft(Node x) {
		Node y = x.right;
		x.right = y.left;
		if (y.left != null) {
			y.left.p = x;
		}
		y.p = x.p;
		if (x.p == null) {
			root = y;
		} else if (x.p.left == x) {
			x.p.left = y;
		} else {
			x.p.right = y;
		}
		y.left = x;
		x.p = y;
	}

	public void rotateRight(Node y) {
		Node x = y.left;
		y.left = x.right;
		if (x.right != null) {
			x.right.p = y;
		}
		x.p = y.p;
		if (y.p == null) {
			root = x;
		} else if (y.p.left == y) {
			y.p.left = x;
		} else {
			y.p.right = x;
		}
		x.right = y;
		y.p = x;
	}

	public void rbInsert(Node n) {
		Node x = root;
		Node y = null;
		while (x != null) {
			y = x;
			if (n.key < x.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}

		n.p = y;
		if (y == null) {
			root = n;
		}
		if (n.key < y.key) {
			y.left = n;
		} else {
			y.right = n;
		}
		n.color = RED;
		rbInsertFixup(n);
	}

	public void rbInsertFixup(Node n) {
		while (n.p.color == RED) {
			if (n.p == n.p.p.left) {
				Node y = n.p.p.right;
				if (y.color == RED) {
					n.p.color = BLACK;
					y.color = BLACK;
					n.p.p.color = RED;
					n = n.p.p;
				} else {
					if (n == n.p.right) {
						n = n.p;
						rotateLeft(n);
					}
					n.p.color = BLACK;
					n.p.p.color = RED;
					rotateRight(n.p.p);
				}
			} else {
				Node y = n.p.p.left;
				if (y.color == RED) {
					n.p.color = BLACK;
					y.color = BLACK;
					n.p.p.color = RED;
					n = n.p.p;
				} else {
					if (n == n.p.right) {
						n = n.p;
						rotateLeft(n);
					}
					n.p.color = BLACK;
					n.p.p.color = RED;
					rotateRight(n.p.p);
				}
			}
		}
		root.color = BLACK;
	}
}

class Node {
	Node left;
	Node right;
	Node p;
	int color;
	int key;
}