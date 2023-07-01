package Leetcode_questions;

import Leetcode_questions.leetcode_543_DiameterOfBinaryTree.TreeNode;

public class leetcode_110_BalancedBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	//o(n2)
//	class Solution {
//	    public boolean isBalanced(TreeNode root) {
//	    	if(root == null) {
//	    		return true;
//	    	}
//	    	 
//	    	boolean lb = isBalanced(root.left);
//	    	boolean rb = isBalanced(root.right);
//	    	boolean sb = Math.abs(ht(root.left) - ht(root.right)) <= 1;
//	    	return lb && rb && sb;
//	    }
//	    public int ht(TreeNode root) {
//	    	if(root == null) { 
//	    		return -1;
//	    	}
//	    	int lht = ht(root.left);
//	    	int rht = ht(root.right);
//	    	return Math.max(lht, rht) + 1;
//	    }
//	}
	
	//O(n)
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	        return Balanced(root).fg;
	    }
	    public Pair Balanced(TreeNode root) {
	    	if(root == null) {
	    		return new Pair();
	    	}
	    	Pair lbp = Balanced(root.left);
	    	Pair rbp = Balanced(root.right);
	    	boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
	    	Pair sbp = new Pair();
	    	sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
	    	sbp.fg = lbp.fg && rbp.fg && sb;
	    	return sbp;
	    }
	}
	class Pair{
		boolean fg = true;
		int ht =-1;
	}
	
}
