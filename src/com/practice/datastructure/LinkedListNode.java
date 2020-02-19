package com.practice.datastructure;


public class LinkedListNode {
	public LinkedListNode next, prev;
	public int data;
	
	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
		this.data = d;
		this.next = n;
		this.prev = p;
	}
	
	public LinkedListNode(int d) {
		this.data = d;
	}
	
	public LinkedListNode() {}
	
	public void setNext(LinkedListNode n) {
		this.next = n;
		if(n != null && n.prev != this) {
			n.setPrevious(this);
		}
	}
	
	public void setPrevious(LinkedListNode p) {
		this.prev = p;
		if(p != null && p.next != this) {
			p.setNext(this);
		}
	}
	
	 //Append a node to tail
	  public void append(LinkedListNode n){
	    // append null at the end of LinkedList is nonsense
	    if (n == null) {
	    	return;
	    }
	    LinkedListNode node = this;
	    while(node.next != null){
	      node = node.next;
	    }

	    node.setNext(n);
	  }
	  
	  //Push node to head
	  public LinkedListNode push(LinkedListNode n) {
		  if (n == null) {
			  return this;
		  }
		  LinkedListNode node = this;
		  while(node.prev != null) {
			  node = node.prev;
		  }
		  node.setPrevious(n);
		  return node.prev;
	  }
	
	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if(next != null) {
			next2 = next.clone();
		}
		LinkedListNode head2 = new LinkedListNode(data, next2, null);
		return head2;
	}
	
	public static void printNodes(LinkedListNode n) {
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print("\n");
	}
	
}
