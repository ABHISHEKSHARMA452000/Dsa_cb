package lec47_06_05_23;

public class leetcode543_DiameterOfBT {

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
	//iski complexity jada hai O(n^2) do do bar har node visit ho rahi hai do recursion chala == recursion ka andar recursion 
//	class Solution {
//	    public int diameterOfBinaryTree(TreeNode root) {
//	        if(root == null) {
//	        	return 0;
//	        }
//	        int ld = diameterOfBinaryTree(root.left); //left ka diameter
//	        int rd = diameterOfBinaryTree(root.right);//right ka diameter
//	        int sd = ht(root.left) + ht(root.right) + 2;//recursion ka andar recursion complexity aachi nhi hai iski
//	        //mere sa pass hona vala diameter //self diameter
//	        return Math.max(rd,Math.max(ld, sd));
//	    }
//	    public int ht(TreeNode root) {
//	    	if(root == null) {
//	    		return -1;
//	    	}
//	    	int left = ht(root.left);
//	    	int right = ht(root.right);
//	    	return Math.max(left, right) + 1;
//	    }
//	
	class Solution {
	    public int diameterOfBinaryTree(TreeNode root) {
	       return diameter(root).dia;
	    }
	    public DiaPair diameter(TreeNode root) {
	    	if(root == null) {
	    		return new DiaPair();
	    	}
	    	DiaPair ldp = diameter(root.left);
	    	DiaPair rdp = diameter(root.right);
	    	int sd = ldp.ht + rdp.ht + 2;
	    	DiaPair sdp = new DiaPair(); //apna liya ek pair bana liya 
	    	sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
	    	sdp.ht = Math.max(ldp.ht,rdp.ht) + 1;
	    	return sdp;
	    }
	}
	class DiaPair{
		int ht = -1;
		int dia = 0;
	}

}
