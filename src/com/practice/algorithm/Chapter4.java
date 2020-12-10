package com.practice.algorithm;

import java.util.LinkedList;
import java.util.Stack;

import com.practice.datastructure.Graph;
import com.practice.datastructure.Node;
import com.practice.datastructure.TreeNode;

public class Chapter4 {

	public enum State {
		Unvisited, Visited, Visiting;
	}
	
	/* Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a
	 * route between two nodes
	 */
	
	//BFS
	public static boolean search(Graph g, Node s, Node e) {
		if(s == e) {
			return true;
		}
		for(Node n : g.getNodes()) {
			n.state = State.Unvisited;
		}
		//operates as queue
		LinkedList<Node> q = new LinkedList<Node>();
		s.state = State.Visiting;
		q.add(s);
		while(!q.isEmpty()) {
			Node c = q.removeFirst();
			if(c != null) {
				for(Node v : c.getAdjacent()) {
					if(v.state == State.Unvisited) {
						if(v == e) {
							return true;
						} else {
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
			}
			c.state = State.Visited;
		}
		return false;
	}
	
	//BFS
	public static boolean search2(Graph g, Node s, Node e) {
		if(s == e) {
			return true;
		}
		for(Node n : g.getNodes()) {
			n.state = State.Unvisited;
		}
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(s);
		while(!q.isEmpty()) {
			Node c = q.removeFirst();
			if(c != null) {
				for(Node v : c.getAdjacent()) {
					if(v.state == State.Unvisited) {
						if(v == e) {
							return true;
						} else {
							q.add(v);
						}
					}
				}
			}
			c.state = State.Visited;
		}
		return false;
	}
	
	//TODO: DFS
	public static boolean search3(Graph g, Node s, Node e) {	
		for(Node n : g.getNodes()) {
			n.state = State.Unvisited;
		}
		
		return hasPathDFS(s, e);
	}
	
	public static boolean hasPathDFS(Node s, Node e) {
		if(s.state == State.Visited) {
			return false;
		}
		s.state = State.Visited;
		if(s == e) {
			return true;
		}
		for(Node child : s.getAdjacent()) {
			if(hasPathDFS(child, e)) {
				return true;
			}
		}
		return false;
		
	}
	
	
	/* Minimal Tree: Given a sorted(increasing order) array with unique integer
	 * elements, write an algorithm to create a binary search tree with minimal
	 * height
	 */
	public static TreeNode sortedArrayToBST(int[] a) {
		return sortedArrayToBST(a, 0, a.length-1);
	}
	
	private static TreeNode sortedArrayToBST(int[] a, int s, int e) {
	    /* Base Case */
        if (s > e) { 
            return null; 
        } 
  
        /* Get the middle element and make it root */
        int mid = (s + e) / 2; 
        TreeNode node = new TreeNode(a[mid]); 
  
        /* Recursively construct the left subtree and make it 
         left child of root */
        node.left = sortedArrayToBST(a, s, mid - 1); 
  
        /* Recursively construct the right subtree and make it 
         right child of root */
        node.right = sortedArrayToBST(a, mid + 1, e); 
          
        return node; 
	}
	
	
	
}
