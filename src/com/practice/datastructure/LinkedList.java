package com.practice.datastructure;


public class LinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d) {
			this.data = d;
		}
	}
	
	public void push(int d) {
		Node n = new Node(d);
		n.next = head;
		head = n;
	}

}
