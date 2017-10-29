package com.ds;

public class DoubleLinkedEx {
	DoubleNode cursor = null;
	DoubleNode head = cursor;

	void insert(String name) {
		if (head == null) {
			head = new DoubleNode();
			head.data = name;
			cursor = head;
		} else {
			DoubleNode node = new DoubleNode();
			node.data = name;

			node.previousNode = cursor;
			cursor.nextNode = node;
			cursor = node;
		}

	}

	void traverse() {
		DoubleNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}

	void reverse() {
		DoubleNode rev = cursor;
		while (rev != null) {
			System.out.println(rev.data);
			rev = rev.previousNode;
		}

	}

}
