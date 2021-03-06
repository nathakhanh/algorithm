package com.practice.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.practice.datastructure.LinkedListNode;

public class Chapter2Test {
	
	private LinkedListNode makeNodes(int[] nodes) {
		LinkedListNode node = new LinkedListNode(nodes[0]);
		for(int i = 1; i < nodes.length; i++){
			node.append(new LinkedListNode(nodes[i]));
		}
		return node;
	}
	
	@Test
	public void test_2_1_1() {
		LinkedListNode node = makeNodes(new int[] {1,2,3,2,3});
		LinkedListNode.printNodes(node);
		Chapter2.deleteDups(node);
		LinkedListNode.printNodes(node);
	}
	
	@Test
	public void test_2_1_2() {
		LinkedListNode node = makeNodes(new int[] {1,2,3,2,3});
		LinkedListNode.printNodes(node);
		Chapter2.deleteDups2(node);
		LinkedListNode.printNodes(node);
	}
	
	@Test
	public void test_2_2_1() {
		LinkedListNode node = makeNodes(new int[] {1,2,3,2,3});
		Chapter2.printKthToLastElement(node, 1);
	}
	
	@Test
	public void test_2_2_2() {
		LinkedListNode node = makeNodes(new int[] {1,2,3,2,3});
		Chapter2.printKthToLastElement2(node, 1);
	}
	
	@Test
	public void test_2_3_1() {
		LinkedListNode node = makeNodes(new int[] {1,2,3,2,3});
		Chapter2.deleteNode(node.next);
		LinkedListNode.printNodes(node);
	}
	
	@Test
	public void test_2_4_1() {
		LinkedListNode node = makeNodes(new int[] {7,6,7,1,2,3,2,3,4,7,6,5});
		LinkedListNode n = Chapter2.partitionNode(node,7);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_4_2() {
		LinkedListNode node = makeNodes(new int[] {4,3,2,1});
		LinkedListNode n = Chapter2.partitionNode2(node,2);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_5_1() {
		LinkedListNode n1 = makeNodes(new int[] {7,1,6});
		LinkedListNode n2 = makeNodes(new int[] {5,9,2});
		LinkedListNode n = Chapter2.sumNodes(n1,n2,0);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_5_2() {
		LinkedListNode n1 = makeNodes(new int[] {7,1,6});
		LinkedListNode n2 = makeNodes(new int[] {5,9});
		LinkedListNode n = Chapter2.sumNodes(n1,n2,0);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_5_3() {
		LinkedListNode n1 = makeNodes(new int[] {7});
		LinkedListNode n2 = makeNodes(new int[] {5});
		LinkedListNode n = Chapter2.sumNodes(n1,n2,0);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_5_4() {
		LinkedListNode n1 = makeNodes(new int[] {7,1,6});
		LinkedListNode n2 = makeNodes(new int[] {5,9,2});
		LinkedListNode n = Chapter2.sumNodes2(n1,n2);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_5_5() {
		LinkedListNode n1 = makeNodes(new int[] {7,1,6});
		LinkedListNode n2 = makeNodes(new int[] {5,9});
		LinkedListNode n = Chapter2.sumNodes2(n1,n2);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_5_6() {
		LinkedListNode n1 = makeNodes(new int[] {7});
		LinkedListNode n2 = makeNodes(new int[] {5});
		LinkedListNode n = Chapter2.sumNodes2(n1,n2);
		LinkedListNode.printNodes(n);
	}
	
	@Test
	public void test_2_6_1() {
		LinkedListNode n = makeNodes(new int[] {0,1,2,1,0});
		boolean output = Chapter2.isPalindrome(n);
		assertTrue(output);
	}
	
	@Test
	public void test_2_6_2() {
		LinkedListNode n = makeNodes(new int[] {0,1,2,1});
		boolean output = Chapter2.isPalindrome(n);
		assertFalse(output);
	}
	
	@Test
	public void test_2_6_3() {
		LinkedListNode n = makeNodes(new int[] {0});
		boolean output = Chapter2.isPalindrome(n);
		assertTrue(output);
	}
	
	@Test
	public void test_2_7_1() {
		LinkedListNode n1 = makeNodes(new int[] {3,1,5,8,7,2,1});
		LinkedListNode n2 = makeNodes(new int[] {4,8});
		while(n1.data != 7) {
			n1 = n1.next;
		}
		n2.next.next = n1;
		while(n1.prev != null) {
			n1 = n1.prev;
		}
		
		LinkedListNode intersection = Chapter2.findInterSection(n1, n2);
		assertEquals(7, intersection.data);
	}
	
	@Test
	public void test_2_7_2() {
		LinkedListNode n1 = makeNodes(new int[] {3,1,5,8,7,2,1});
		LinkedListNode n2 = makeNodes(new int[] {4,8,7,2,1});
		
		LinkedListNode intersection = Chapter2.findInterSection(n1, n2);
		assertNull(intersection);
	}
}
