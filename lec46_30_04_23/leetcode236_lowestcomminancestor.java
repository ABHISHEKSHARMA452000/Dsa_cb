package lec46_30_04_23;

public class leetcode236_lowestcomminancestor {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root == null) {
	        	return null;
	        }
	        if(root == p || root ==q) {
	        	return root;
	        }
	        TreeNode left = lowestCommonAncestor(root.left,p,q);
	        TreeNode right = lowestCommonAncestor(root.right,p,q);
	        if(left != null && right !=null) {
	        	return root;
	        }else if(left == null) {
	        	return right;
	        }else {
	        	return left;    
	        }
	    }
	}
}
