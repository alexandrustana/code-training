package com.algorithms.tries;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Node node = new Node();
		node.add("sin");
		node.add("step");
		node.add("sawtooth");
		node.add("cos");
		node.add("constant");
		node.add("ramp");
		node.add("tan");
		
		List<String> words = node.getWords("co");
		words.forEach(s -> System.out.println(s));
	}
}
