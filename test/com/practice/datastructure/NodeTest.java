package com.practice.datastructure;

import org.junit.Test;

public class NodeTest {
	
	@Test
	public void test_1() {
		Node node = new Node(5);
		node.appendToTail(4);
		node.appendToTail(3);
		node.appendToTail(2);
		node.appendToTail(1);
		
		node.deleteNode(node, 3);
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
		
	}

}
