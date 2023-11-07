package com.greatlearning.lab3.q2;

public class DriverClass {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(40);
		root.insert(root, 20);
		root.insert(root, 60);
		root.insert(root, 10);
		root.insert(root, 30);
		root.insert(root, 50);
		root.insert(root, 70);
		
		FindingSumPair sumPair =new FindingSumPair();
		sumPair.checkPairPresent(root, 1100);
		
	}

}
