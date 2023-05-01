package lec46_30_04_23;

public class leetcode951_FlipEquivalent {
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
	    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
	    	if(root1 == null && root2 == null) {
	    		return true; //symmteric check
	    	}
	    	if(root1 == null || root2 == null) {
	    		return false; //strc same nhi
	    	}
	    	if(root1.val != root2.val) {
	    		return false; //strc same value same nahi
	    	}
	    	boolean flip = flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);
	    	boolean noflip = flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right);
	    	return flip || noflip;
	    }
	}
	
}
