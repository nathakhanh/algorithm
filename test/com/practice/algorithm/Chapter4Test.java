package com.practice.algorithm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.practice.datastructure.Graph;
import com.practice.datastructure.Node;
import com.practice.datastructure.TreeNode;

public class Chapter4Test {
	@Test
	public void test_4_1_1() {
		Graph g = new Graph();        
		Node[] temp = new Node[6];

		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		
		Node[] n = g.getNodes();
		Node start = n[3];
		Node end = n[5];
		assertTrue(Chapter4.search(g, start, end));
		
	}
	
	@Test
	public void test_4_1_2() {
		Graph g = new Graph();        
		Node[] temp = new Node[6];

		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		
		Node[] n = g.getNodes();
		Node start = n[0];
		Node end = n[5];
		assertTrue(Chapter4.search2(g, start, end));
		
	}
	
	@Test
	public void test_4_1_3() {
		Graph g = new Graph();        
		Node[] temp = new Node[6];

		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 0);
		temp[5] = new Node("f", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
//		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		
		Node[] n = g.getNodes();
		Node start = n[0];
		Node end = n[5];
		assertTrue(Chapter4.search3(g, start, end));
	}
	
	@Test
	public void test_4_2_1() {
		int[] a = {1,3,5,7,9,11,13,15};
		TreeNode root = Chapter4.sortedArrayToBST(a);
		TreeNode.printPreOrder(root);
		System.out.println();
		TreeNode.printInOrder(root);
		System.out.println();
		TreeNode.printPostOrder(root);
	}
}
