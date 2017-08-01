package com.algorithms.datastructure.tries;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private boolean isWord = false;
	private static final int NUMBER_OF_CHARACTHERS = 26;
	private Node[] characters = new Node[NUMBER_OF_CHARACTHERS];

	public void add(String word) {
		add(word, 0);
	}

	private void add(String word, int index) {
		if (index == word.length()) {
			isWord = true;
			return;
		}

		int characterIndex = getCharacterIndex(word.charAt(index));
		Node node = characters[characterIndex];
		if (node == null) {
			node = new Node();
			characters[characterIndex] = node;
		}
		node.add(word, index + 1);
	}

	public boolean hasWord(String word) {
		return hasWord(word, 0);
	}

	private boolean hasWord(String word, int index) {
		if (index == word.length()) {
			return true;
		}

		Node node = characters[getCharacterIndex(word.charAt(index))];
		if (node != null) {
			return node.hasWord(word, index + 1);
		} else {
			return false;
		}
	}

	public List<String> getWords(String word) {
		return getWords(word, word.substring(word.length() - 1), 0);
	}

	private List<String> getWords(String word, String lastCharacter, int index) {
		if (index == word.length() && (word.charAt(index - 1) + "").equals(lastCharacter)) {
			String result = "";
			List<String> results = new ArrayList<>();
			getNodes(result, results);

			for (int i = 0; i < results.size(); i++) {
				results.set(i, word + results.get(i));
			}

			return results;
		}
		int charCode = getCharacterIndex(word.charAt(index));
		Node node = characters[charCode];
		 if (node != null) {
			return node.getWords(word, lastCharacter, index + 1);
		}
		return null;
	}

	private void getNodes(String result, List<String> results) {
		for (int i = 0; i < NUMBER_OF_CHARACTHERS; i++) {
			Node tempNode = characters[i];
			if (tempNode != null) {
				result += getCharacter(i);
				tempNode.getNodes(result, results);
				result = result.substring(0, result.length() - 1);
			}
		}

		if (isWord) {
			results.add(result);
		}

	}

	private int getCharacterIndex(char character) {
		return character - 'a';
	}

	private char getCharacter(int index) {
		return (char) (index + 'a');
	}
}
