package com.pioneercoders.linkedListStuctures;

public class LinkedListEx {
	Node cursor = null;
	Node head = cursor;

	void add(String name) {
		if (head == null) {
			head = new Node();
			head.data = name;
			cursor = head;
		} else {
			Node newNode = new Node();
			newNode.data = name;
			cursor.nextNode = newNode;
			cursor = newNode;
		}
	}

	void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}
}
