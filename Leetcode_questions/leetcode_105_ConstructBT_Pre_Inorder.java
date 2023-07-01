package Leetcode_questions;

public class leetcode_105_ConstructBT_Pre_Inorder {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
		}
		public TreeNode Build(int[] pre,int[] in,int plo,int phi,int ilo,int ihi) {
			if(plo > phi || ilo > ihi) {
				return null;
			}
			
			TreeNode node  = new TreeNode();
			int idx = search(in,ilo,ihi,pre[plo]);
			int net = idx - ilo;
			node.val = pre[plo];
			node.left = Build(pre,in,plo + 1,plo + net,ilo,idx-1);
			node.right = Build(pre,in,plo + net + 1,phi,idx+1,ihi);
			return node;
		}
		public int search(int[] in,int ilo,int ihi,int value) {
			for(int i=ilo;i<=ihi;i++) {
				if(in[i] == value) {
					return i;
				}
			}
			return 0;
		}
	}
}
