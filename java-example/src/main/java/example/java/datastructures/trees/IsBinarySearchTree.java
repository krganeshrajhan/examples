package example.java.datastructures.trees;

import java.util.Scanner;

public class IsBinarySearchTree {

	static class Node {
		int data;
		Node left;
		Node right;
	}

	boolean checkBST(Node root) {

		if(root==null) {
			return true;
		} else {
			System.out.println(root.data);
		}

		if (root.left == null && root.right == null) {
			return true;
		} else if (root.left == null && root.data > root.right.data) {
			return false;
		} else if (root.right == null && root.data < root.left.data) {
			return false;
		} else if (root.data < root.left.data || root.data > root.right.data) {
			return false;
		}


		boolean isLeft = checkBST(root.left);
		boolean isRight = checkBST(root.right);

		return (isLeft && isRight) ? true : false;

	}

	public static void main(String[] args) {

		Node root = new Node();
		Node i1 = new Node();
		i1.data = 1;
		Node i2 = new Node();
		i2.data = 2;
		Node i3 = new Node();
		i3.data = 4;
		Node i4 = new Node();
		i4.data = 3;
		Node i5 = new Node();
		i5.data = 5;
		Node i6 = new Node();
		i6.data = 6;
		Node i7 = new Node();
		i7.data = 7;
		root = i4;
		i4.left = i2;
		i4.right = i6;

		i2.left = i1;
		i2.right = i3;

		i6.left = i5;
		i6.right = i7;
		IsBinarySearchTree che = new IsBinarySearchTree();
		System.out.println(che.checkBST(root));
	}
}
