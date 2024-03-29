package lec47_06_05_23;

public class leetcode_110_BalanceBinaryTree {

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
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	    	if(root == null) {
	    		return true;
	    	}
	        boolean left = isBalanced(root.left);
	        boolean right = isBalanced(root.right);
	        boolean self = Math.abs(ht(root.left) - ht(root.right)) <= 1; //|x| <= 1 means -1<= x <= 1 
	        return left && right && self;
	    }
	    public int ht(TreeNode root) {
	    	if(root == null) {
	    		return -1;
	    	}
	    	int left = ht(root.left);
	    	int right = ht(root.right);
	    	return Math.max(left, right) + 1;
	    }
	}

}
