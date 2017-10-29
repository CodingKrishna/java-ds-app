package com.pioneercoders.queueStructures;

public class QueueTest {

	public static void main(String[] args) {
		QueueEx ex = new QueueEx();
		ex.push(3);
		ex.pop();
		ex.push(5);
		ex.pop();
		ex.push(7);
		ex.push(2);
		System.out.println(ex.size());
		ex.pop();
		System.out.println(ex.size());

	}

}
