package Leetcode_questions;

public class leetcode_543_DiameterOfBinaryTree {

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

	// o(n^2)
//	class Solution {
//	    public int diameterOfBinaryTree(TreeNode root) {
//	    	if(root == null) {
//	    		return 0;
//	    	}
//	        int ld = diameterOfBinaryTree(root.left);
//	        int rd = diameterOfBinaryTree(root.right);
//	        int sd = ht(root.left) + ht(root.right) + 2; //self diameter
//	        return Math.max(rd, Math.max(ld, sd));
//	         
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

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dia;
		}
		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			// sd sa diametr nikal liya jo aus node sa pass hoga
			int sd = ldp.ht + rdp.ht + 2;
			// sdp bana hai tree ka liya ki har node ki sahi ht and diapair nikal kar aus
			// diapair ma rahai
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			sdp.dia = Math.max(ldp.dia, Math.max(rdp.dia, sd));
			// par send diapair ma vo diameter kiya hai jo diameter of tree bana ga
			return sdp;

		}
	}

	class DiaPair {
		int ht = -1;
		int dia = 0;
	}

}
