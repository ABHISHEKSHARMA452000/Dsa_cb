package Leetcode_questions;

public class leetcode_98_isValidBST {

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
	    public boolean isValidBST(TreeNode root) {
	    	return isValid(root).valid;
	    }
	    public ValidPair isValid(TreeNode root) {
	    	if(root ==  null) {
	    		return new ValidPair();
	    	}
	    	ValidPair lvp = isValid(root.left);//left valid pair
	    	ValidPair rvp = isValid(root.right);//right valid pair
	    	ValidPair svp = new ValidPair();//self valid pair
	    	svp.max = Math.max(root.val,Math.max(lvp.max,rvp.max));
	    	svp.min = Math.min(root.val,Math.min(lvp.min,rvp.min));
	    	if(lvp.valid && rvp.valid &&  lvp.max < root.val && rvp.min > root.val) {
	    		svp.valid = true;
	    	}else {
	    		svp.valid = false;
	    	}
	    	return svp;
	    }
	}
	class ValidPair{
		int max = Integer.MIN_VALUE;//tree ka max value ya hai
		int min = Integer.MAX_VALUE;//tree ki min value kya hai
		boolean valid = true;//true isliya liya hai bcoze null par jab return hoga toh vo single node toh bst hoti hai so vo condition sahi chal jayagi
	}

}

