package com.practice.datastructure;


public class Node {
	int data;
	Node next;
	
	public Node(int value) {
		this.data = value;
	}
	
	public void appendToTail(int d) {
		Node current = this;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(d);
	}
	
	public Node deleteNode(Node head, int d) {
		Node current = head;
		if(current.data == d) {
			return head.next;
		}

		while(current.next != null) {
			if(current.next.data == d) {
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return head;
	}
}
