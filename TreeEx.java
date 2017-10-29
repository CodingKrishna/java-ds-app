package com.ds;

public class TreeEx {
	int no;
	TreeNode cursor = null;
	TreeNode root = cursor;
	TreeNode leftChild = null;
	TreeNode rightChild = null;

	void add(int no) {
		if (root == null) {
			root = new TreeNode();
			root.data = no;
			cursor = root;
		} else {
			if (no < root.data) {
				 leftChild = new TreeNode();
				leftChild.data = no;
				cursor = leftChild;
			} else {
				 rightChild = new TreeNode();
				rightChild.data = no;
				cursor = rightChild;
			}

		}
	}

	void travers() {
		TreeNode temp = root;
		TreeNode tempLeft = leftChild;
		TreeNode tempRight = rightChild;
		while (temp != null) {
			System.out.println(temp);
			if (no < temp.data) {
				System.out.println(leftChild.data);
				tempLeft = tempLeft.leftChild;
			} else {
				System.out.println(rightChild.data);
				tempRight = tempRight.rightChild;
			}
		}
	}

}
