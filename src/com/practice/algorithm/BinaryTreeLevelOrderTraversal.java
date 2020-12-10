package com.practice.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.practice.datastructure.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> output = new ArrayList<>();
	        if(root == null) {
	            return output;
	        }
	        List<Integer> currentLayerOutput = new ArrayList<>();
	        LinkedList<TreeNode> currentQueue = new LinkedList<>();
	        LinkedList<TreeNode> nextQueue = new LinkedList<>();
	        currentQueue.add(root);
	        while(!currentQueue.isEmpty()) {
	            TreeNode currentNode = currentQueue.remove();
	            currentLayerOutput.add(currentNode.data);
	            if(currentNode.left != null) {
	                nextQueue.add(currentNode.left);
	            }
	            if(currentNode.right != null) {
	                nextQueue.add(currentNode.right);
	            }
	            if(currentQueue.isEmpty()) {
	                currentQueue = nextQueue;
	                nextQueue = new LinkedList<TreeNode>();
	                output.add(currentLayerOutput);
	                currentLayerOutput = new ArrayList<Integer>();
	            }
	        }
	        return output;
	    }
}
