package com.pioneercoders.stackStructures;

public class TestStack {

	public static void main(String[] args) {
		StackEx stack=new StackEx();
		stack.push(3);
		stack.pop();
		stack.push(5);
		stack.pop();
		stack.push(7);
		stack.push(2);
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack.size());
	}
}