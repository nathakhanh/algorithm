package com.practice.datastructure;


public class TreeNode {
	public int data;
	public TreeNode parent, left, right;
	private int size = 0;
	
	public TreeNode(int d) {
		data = d;
		size = 1;
	}
	
	public int size() {
		return size;
	}
	
	public void insertInOrder(int d) {
		if(d <= data) {
			if(left == null) {
				setLeftChild(new TreeNode(d));
			} else {
				left.insertInOrder(d);
			}
		} else {
			if(right == null) {
				setRightChild(new TreeNode(d));
			} else {
				right.insertInOrder(d);
			}
		}
	}
	
	public void setLeftChild(TreeNode left) {
		this.left = left;
		if(left != null) {
			left.parent = this;
		}
	}
	
	public void setRightChild(TreeNode right) {
		this.right = right;
		if(right != null) {
			right.parent = this;
		}
	}
	
	public TreeNode find(int d) {
		if(d == data) {
			return this;
		} else if(d <= data) {
			return left != null ? left.find(d) : null;
		} else if(d > data) {
			return right != null ? right.find(d) : null;
		}
		return null;
	}
	
	public static void printPreOrder(TreeNode n) {
		if (n != null) { 
			System.out.print(n.data + " "); 
		    printPreOrder(n.left); 
		    printPreOrder(n.right); 
	    } 
	}
	
	public static void printInOrder(TreeNode n) {
		if (n != null) { 
			printInOrder(n.left); 
		    System.out.print(n.data + " "); 
		    printInOrder(n.right);  
	    } 
	}
	
	public static void printPostOrder(TreeNode n) {
		if (n != null) { 
			printPostOrder(n.left); 
			printPostOrder(n.right); 
			System.out.print(n.data + " "); 
	    }   
	}
}
