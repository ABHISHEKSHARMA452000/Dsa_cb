package Leetcode_questions;

public class leetcode_1302_DeepestLeavesSum {

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
		int ans = 0;//leetcode par static differnt chalta hai vo previous test case ki value bhi add kar lete hai isma
	    public int deepestLeavesSum(TreeNode root) {
	        int tht = Ht(root);
	        Sum(root,0,tht);
	        return ans;
	    }
	    public void Sum(TreeNode root,int lvl,int tht) {
	    	if(root == null) {
	    		return;
	    	}
	    	if(root.left == null && root.right == null && lvl == tht) {
	    		ans += root.val;
	    	}
	    	Sum(root.left,lvl + 1,tht);
	    	Sum(root.right,lvl + 1,tht);
	    }
	    public int Ht(TreeNode root){
	        if(root == null){
	            return -1;
	        }
	        int lht  = Ht(root.left);
	        int rht = Ht(root.right);
	        return Math.max(lht,rht) + 1;
	    }
	}
}
