package Leetcode_questions;

public class leetcode_538_1038_ConvertBSTtoGreaterTree {

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
		int sum = 0;

		public TreeNode convertBST(TreeNode root) {
			GreaterTree(root);
			return root;
		}

		public void GreaterTree(TreeNode root) {
			if (root == null) {
				return;
			}
			GreaterTree(root.right);
			sum = sum + root.val;
			root.val = sum;
			GreaterTree(root.left);
		}
	}

}
