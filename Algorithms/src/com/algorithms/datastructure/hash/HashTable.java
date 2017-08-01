package com.algorithms.datastructure.hash;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unchecked")
public class HashTable {
	private static final int MAX_SIZE = 128;
	private List<String>[] table = new LinkedList[MAX_SIZE];

	private int hashCode(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i);
		}
		return sum % MAX_SIZE;
	}

	public void put(String s) {
		int index = hashCode(s);

		List<String> temp = table[index];
		if (temp == null) {
			temp = new LinkedList<>();
			table[index] = temp;
		}

		temp.add(s);
	}

	public List<String> get(int i) {
		return table[i];
	}

	public String get(int i, int j) {
		return table[i].get(j);
	}

	public boolean contains(String s) {
		int index = hashCode(s);

		List<String> temp = table[index];
		if (temp != null) {
			return temp.contains(s);
		}
		return false;
	}
}
