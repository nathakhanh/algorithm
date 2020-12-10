package com.practice.algorithm;

import org.junit.Test;

import com.practice.datastructure.LinkedListNode;

public class MergeTwoSortedLinkedListsTest {
	
	@Test
	public void test_1() {
		LinkedListNode l1 = new LinkedListNode(1);
		l1.append(new LinkedListNode(2));
		l1.append(new LinkedListNode(4));
		
		LinkedListNode l2 = new LinkedListNode(1);
		l2.append(new LinkedListNode(3));
		l2.append(new LinkedListNode(4));
		
		LinkedListNode m = MergeTwoSortedLinkedLists.mergeTwoLists(l1, l2);
		LinkedListNode.printNodes(m);
		
	}
	
	@Test
	public void test_2() {
		LinkedListNode l1 = new LinkedListNode(1);
		l1.append(new LinkedListNode(2));
		l1.append(new LinkedListNode(4));
		
		LinkedListNode l2 = new LinkedListNode(1);
		l2.append(new LinkedListNode(3));
		l2.append(new LinkedListNode(4));
		
		LinkedListNode m = MergeTwoSortedLinkedLists.mergeTwoLists2(l1, l2);
		LinkedListNode.printNodes(m);
		
	}
	
	@Test
	public void test_3() {
		LinkedListNode l1 = new LinkedListNode(1);
		l1.append(new LinkedListNode(2));
		l1.append(new LinkedListNode(4));
		
		LinkedListNode l2 = new LinkedListNode(1);
		l2.append(new LinkedListNode(3));
		l2.append(new LinkedListNode(4));
		
		LinkedListNode m = MergeTwoSortedLinkedLists.mergeTwoLists3(l1, l2);
		LinkedListNode.printNodes(m);
		
	}
}
