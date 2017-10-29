package com.ds;

public class QueueEx {
	int array[] = new int[5];
	int cursor = 0;

	boolean push(int val) {
		if (cursor <= array.length) {
			array[cursor] = val;
			cursor++;
			return true;

		}
		return false;
	}

	int pop() {
		if (cursor >= 0) {

			int val = array[cursor];
			array[0] = 0;
			cursor--;
			return val;
		}
		return 0;
	}

	int size() {
		return cursor;
	}

}
