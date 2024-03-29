package lec48_07_05_23;

public class leetcode_98_isValid_BST {

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
	        return ValidBst(root).isbst;
	    }
	    public BstPair ValidBst(TreeNode root) {
	    	if(root == null) {
	    		return new BstPair();
	    	}
	    	BstPair lbstp = ValidBst(root.left);
	    	BstPair rbstp = ValidBst(root.right);
	    	BstPair sbstp = new BstPair();//self bst pair
	    	sbstp.max = Math.max(root.val,Math.max(lbstp.max,rbstp.max));
	    	sbstp.min = Math.min(root.val,Math.min(lbstp.min,rbstp.min));
	    	if(lbstp.isbst && rbstp.isbst && lbstp.max<root.val && rbstp.min > root.val) {
	    		sbstp.isbst = true;
	    	}else {
	    		sbstp.isbst = false;
	    	}
	    	return sbstp;
	    }
	    class BstPair{
	    	boolean isbst = true;
	    	long min = Long.MAX_VALUE;
	    	long max = Long.MIN_VALUE;
	    }
	}
}



