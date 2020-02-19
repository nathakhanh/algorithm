package com.practice.datastructure;

import org.junit.Test;

public class LinkedListNodeTest {
	
	private LinkedListNode makeNodes(int[] nodes) {
		LinkedListNode node = new LinkedListNode(nodes[0]);
		for(int i = 1; i < nodes.length; i++){
			node.append(new LinkedListNode(nodes[i]));
		}
		return node;
	}
	
	@Test
	public void test_1() {
		LinkedListNode n = makeNodes(new int[] {5,4,3,2,1});
		LinkedListNode.printNodes(n);
		n.append(new LinkedListNode(2));
		LinkedListNode.printNodes(n);
		n = n.push(new LinkedListNode(4));
		LinkedListNode.printNodes(n);
	}
}
