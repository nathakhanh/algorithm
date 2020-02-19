package com.practice.algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.practice.datastructure.LinkedListNode;

public class Chapter2 {
	/* Remove Dups: Write a code to remove duplicates from an unsorted linked list.
	 * Follow UP: How would you solve this problem if a temporary buffer is not allowed?
	 */
	public static void deleteDups(LinkedListNode n) {
		Set<Integer> set = new HashSet<>();
		LinkedListNode previous = null;
		while(n != null) {
			if(set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	//Without using additional datastructure
	public static void deleteDups2(LinkedListNode n) {
		while(n != null) {
			LinkedListNode runner = n;
			while(runner.next != null) {
				if(n.data == runner.next.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			n = n.next;
		}
	}
	
	/* Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list
	 */
	public static void printKthToLastElement(LinkedListNode n, int k) {
		int length = 0;
		LinkedListNode current = n;
		while(current != null) {
			length++;
			current = current.next;
		}
		int kthElement = length - k;
		while(kthElement > 1) {
			n = n.next;
			kthElement--;
		}
		System.out.println(n.data);
	}
	
	//Recursive solution
	public static int printKthToLastElement2(LinkedListNode n, int k) {
		if(n == null) {
			return 0;
		}
		int index = printKthToLastElement2(n.next, k) + 1;
		if(index == k) {
			System.out.println(n.data);
		}
		return index;
	}
	
	/* Delete Middle Node: Implement an algorithm to delete any node in the
	 * middle (i.e., any node but the first and last node, not necessarily
	 * the exact middle) of a singly linked list, given only access to
	 * that node
	 * 
	 * Example
	 * input: the node c from the linked list a->b->c->d->e->f
	 * output: new linked list a->b->c->e->f
	 */
	public static boolean deleteNode(LinkedListNode n) {
		if(n == null || n.next == null) {
			return false;
		}
		
		if(n.next.next != null) {
			n.next = n.next.next;
			return true;
		}
		
		return false;
	}
	
	/* Partition: Write a code to partition a linked list around a value x,
	 * such that all nodes less than x come before all nodes greater than
	 * or equal to x. If x is contained within the list, the values of x only
	 * need to be after the elements less than x (see below). The partition
	 * element x can appear anywhere in the "right partition"; it does not
	 * need to appear between the left and right partitions
	 * 
	 * Example
	 * Input: 3->5->8->5->10->2->1 [partition = 5]
	 * Output: 3->1->2->10->5->5->8
	 */
	public static LinkedListNode partitionNode(LinkedListNode n, int partition) {
		LinkedListNode leftPartitionStart = null;
		LinkedListNode leftPartitionEnd = null;
		LinkedListNode rightPartitionStart = null;
		LinkedListNode rightPartitionEnd = null;
		while (n != null) {
			LinkedListNode next = n.next;
			n.next = null;
			if (n.data < partition) {
				if(leftPartitionStart == null) {
					leftPartitionStart = n;
					leftPartitionEnd = leftPartitionStart;
				} else {
					leftPartitionEnd.next = n;
					leftPartitionEnd = leftPartitionEnd.next;
				}	
			} else {
				if (rightPartitionStart == null) {
					rightPartitionStart = n;
					rightPartitionEnd = rightPartitionStart;
				} else {
					rightPartitionEnd.next = n;
					rightPartitionEnd = rightPartitionEnd.next;
				}
			}
			n = next;
		}
		
		if (leftPartitionStart == null) {
			return rightPartitionStart;
		} else if (rightPartitionStart == null) {
			return leftPartitionStart;
		} else {
			leftPartitionEnd.next = rightPartitionStart;
		}
		
		return leftPartitionStart;
	}
	
	public static LinkedListNode partitionNode2(LinkedListNode n, int partition) {
		LinkedListNode head = n;
		LinkedListNode tail = n;
		
		while(n != null) {
			LinkedListNode next = n.next;
			if(n.data < partition) {
				n.next = head;
				head = n;
			} else {
				tail.next = n;
				tail = n;
			}
			n = next;
		}
		tail.next = null;
		return head;
	}
	
	/* Sum Lists: You have two numbers represented by a linked list, where each node contains a single
	 * digit. The digits are stored in reversed order, such that the 1's digit is at the head of the list.
	 * Write a function that adds the two numbers and return the sum as linked list.
	 * 
	 * Example
	 * Input: (7->1->6) + (5->9->2). That is 617 + 295
	 * Output: 2->1->9
	 * 
	 * Follow Up
	 * Suppose the digits are stored in forward order. Repeat the above problem
	 * Example
	 * Input: (6->1->7) + (2->9->5). That is 617 + 295
	 * Output: 9->1->2
	 * 
	 */
	public static LinkedListNode sumNodes(LinkedListNode n1, LinkedListNode n2, int r) {
		if (n1 == null && n2 == null && r == 0) {
			return null;
		}
		LinkedListNode result = new LinkedListNode();
		int sum = (n1 != null ? n1.data : 0) + (n2 != null ? n2.data : 0) + r;
		result.data = sum % 10;
		
		if(n1 != null || n2 != null) {
			LinkedListNode next = sumNodes(n1 == null ? n2 : n1.next, n2 == null ? n2: n2.next, sum >= 10 ? 1 : 0);
			result.append(next);
		}
		
		return result;
	}
	
	public static LinkedListNode sumNodes2(LinkedListNode n1, LinkedListNode n2) {
		LinkedListNode result = null;
		int sum = 0;
		int r = 0;
		while(n1 != null || n2 != null || r > 0) {
			LinkedListNode sumNode = new LinkedListNode();
			sum = (n1 != null ? n1.data : 0) + (n2 != null ? n2.data : 0) + r;
			sumNode.data = sum % 10;
			
			if (result == null) {
				result = sumNode;
			} else {
				result.append(sumNode);
			}
			
			if(n1 != null) {
				n1 = n1.next;
			}
			if(n2 != null) {
				n2 = n2.next;
			}
			
			r = sum > 10 ? 1 : 0;
		}
		
		return result;
	}
	
	/* Palindrome: Implement a function to check if a linked list is a palindrome
	 */
	public static boolean isPalindrome(LinkedListNode n) {
		LinkedListNode startNode = n;
		LinkedListNode endNode = n;
		int length = 1;
		while(endNode.next != null) {
			endNode = endNode.next;
			length++;
		}
		length /= 2;
		while(length > 0) {
			if(startNode.data != endNode.data) {
				return false;
			}
			length--;
			startNode = startNode.next;
			endNode = endNode.prev;
		}
		
		return true;
	}
	
	/* Intersection: Given two singly linked lists, determine if the two lists intersect. Return the intersecting 
	 * nodes. Node that the intersection is defined based on reference, not value. That is, if the kth node
	 * of the first linked list is the exact same node (by reference) as the jth node of the second linked
	 * list, then they are intersecting
	 */
	public static LinkedListNode findInterSection(LinkedListNode n1, LinkedListNode n2) {
		LinkedListNode reversedN1 = n1;
		LinkedListNode reversedN2 = n2;
		
		//reverse the linkedlists
		n1 = reversedLinkedList(n1);
		n2 = reversedLinkedList(n2);
		
		//
		
		return null;
	}
	
	public static LinkedListNode reversedLinkedList(LinkedListNode n) {
		
		return null;
	}
	
	
	/* Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
	 * beginning of the loop.
	 * 
	 * DEFINITION
	 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node,
	 * so as to make a loop in the linked list.
	 * 
	 * EXAMPLE
	 * Input: A->B->C->D->E->C[same C as earlier]
	 * Output: C
	 */
	
	
	
	

}
