package Leetcode_questions;

public class leetcode_129 {
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
		public int sumNumbers(TreeNode root) {
			return sum(root,0);
		}
		public int sum(TreeNode root,int ans){
	        if(root == null){
	            return 0;
	        }
	        if(root.left == null && root.right == null){
	            return ans*10+root.val;
	        }
	        int leftkasum = sum(root.left,ans*10+root.val);
	        int rightkasum = sum(root.right,ans*10+root.val);
	        return leftkasum + rightkasum;
	    }
	}
	
}
