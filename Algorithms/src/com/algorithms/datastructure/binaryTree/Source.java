package com.algorithms.datastructure.binaryTree;

public class Source {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.add(1);
		tree.add(2);
		tree.add(5);
		tree.add(3);
		tree.add(4);
		tree.add(6);
		tree.add(8);
		tree.add(9);
		tree.add(7);
		
		tree.delete(9);
		tree.delete(1);
		
		tree.inorder(tree.root);
	}

}

class Tree {
	public Node root;

	public void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.key);
			inorder(node.right);
		}
	}

	public void add(int k) {
		Node node = new Node();
		node.key = k;

		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (k < y.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}

		if (y == null) {
			root = node;
		} else {
			node.parent = y;
			if (y.key < k) {
				y.right = node;
			} else {
				y.left = node;
			}
		}
	}

	public void delete(int k) {
		Node z = searchIt(k);
		Node y = null;
		if (z.left == null || z.right == null) {
			y = z;
		} else {
			y = successor(z);
		}

		Node x = null;
		if (y.left != null) {
			x = y.left;
		} else {
			x = y.right;
		}

		if (x != null) {
			x.parent = y.parent;
		}
		if (y.parent == null) {
			root = x;
		} else if (y == y.parent.left) {
			y.parent.left = x;
		} else {
			y.parent.right = x;
		}

		if (y != z) {
			z.key = y.key;
		}
	}

	public Node searchRec(int k, Node node) {
		if (node == null || node.key == k) {
			return node;
		}
		if (k < node.key) {
			return searchRec(k, node.left);
		} else {
			return searchRec(k, node.right);
		}
	}

	public Node searchIt(int k) {
		Node node = root;
		while (node != null && node.key != k) {
			if (k < node.key) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		return node;
	}

	public Node minimumRec(Node node) {
		if (node.left == null) {
			return node;
		}
		return minimumRec(node.left);
	}

	public Node minimumIt() {
		Node node = root;
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	public Node maximumRec(Node node) {
		if (node.right == null) {
			return node;
		}
		return maximumRec(node.right);
	}

	public Node maximumIt() {
		Node node = root;
		while (node.right != null) {
			node = node.right;
		}
		return node;
	}

	public Node successor(Node node) {
		if (node.right != null) {
			return minimumRec(node.right);
		}
		Node parent = node.parent;
		while (parent != null && node == parent.right) {
			node = parent;
			parent = parent.parent;
		}
		return parent;
	}

	public Node predecessor(Node node) {
		if (node.left != null) {
			return maximumRec(node.left);
		}
		Node parent = node.parent;
		while (parent != null && node == parent.left) {
			node = parent;
			parent = parent.parent;
		}
		return parent;
	}
}

class Node {
	public Node parent;
	public Node left;
	public Node right;
	public int key;
}