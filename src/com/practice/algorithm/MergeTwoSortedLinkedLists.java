package com.practice.algorithm;

import com.practice.datastructure.LinkedListNode;

public class MergeTwoSortedLinkedLists {
	public static LinkedListNode mergeTwoLists(LinkedListNode l1, LinkedListNode l2) {
		LinkedListNode newList = null;
		LinkedListNode headNewList = null;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                if(headNewList == null) {
                    newList = new LinkedListNode(l2.data);
                    headNewList = newList;
                } else {
                    newList.next = new LinkedListNode(l2.data);
                    newList = newList.next;
                }
                l2 = l2.next;
            } else if (l2 == null) {
                  if(headNewList == null) {
                    newList = new LinkedListNode(l1.data);
                    headNewList = newList;
                } else {
                    newList.next = new LinkedListNode(l1.data);
                    newList = newList.next;
                }
                l1 = l1.next;
            } else if(l1.data <= l2.data) {
                if(headNewList == null) {
                    newList = new LinkedListNode(l1.data);
                    headNewList = newList;
                } else {
                    newList.next = new LinkedListNode(l1.data);
                    newList = newList.next;
                }
                l1 = l1.next;
            } else {
                 if(headNewList == null) {
                    newList = new LinkedListNode(l2.data);
                    headNewList = newList;
                } else {
                    newList.next = new LinkedListNode(l2.data);
                    newList = newList.next;
                }
                l2 = l2.next;
            }
           
        }
        return headNewList;
    }
	
	public static LinkedListNode mergeTwoLists2(LinkedListNode l1, LinkedListNode l2) {
		LinkedListNode head = new LinkedListNode(0);
		LinkedListNode tail = head;
		
		while(l1 != null || l2 != null) {
			if(l1 == null) {
				tail.next = l2;
				l2 = l2.next;
			} else if(l2 == null) {
				tail.next = l1;
				l1 = l1.next;
			} else if(l1.data <= l2.data) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		
		return head.next;
	}
	
	public static LinkedListNode mergeTwoLists3(LinkedListNode l1, LinkedListNode l2) {

        if(l1 == null) {
        	return l2; 
        }
        if(l2 == null) {
        	return l1; 
        }
          
        if(l1.data < l2.data)  { 
            l1.next = mergeTwoLists3(l1.next, l2); 
            return l1; 
        } else { 
            l2.next = mergeTwoLists3(l1, l2.next); 
            return l2; 
        } 
		
	}
}
