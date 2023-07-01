package Leetcode_questions;

public class leetcode_617_MergeTwoBinaryTrees {

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
	//one solution
	class Solution1 {
		public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
			if(root1 == null && root2 == null){
	            return null;
	        }
	        TreeNode root = new TreeNode();
	        if(root1 != null && root2 != null){
	            root.val = root1.val + root2.val;
	        }else if(root1 != null && root2 == null){
	            root.val = root1.val;
	        }else{
	            root.val = root2.val;
	        }

	        root.left = mergeTrees(root1 == null? null : root1.left,root2 == null? null :root2.left);
	        root.right = mergeTrees(root1 == null? null : root1.right,root2 == null? null :root2.right);

	        return root;
		}
	}
	//solution 2
	class Solution2 {
		public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
			if(root1 == null){
	            return root2;
	        }
	        if(root2 == null){
	            return root1;
	        }
	        TreeNode root = new TreeNode();
	        root.val = root1.val + root2.val;
	        root.left = mergeTrees(root1.left,root2.left);
	        root.right = mergeTrees(root1.right,root2.right);
	        return root;
		}
	}

}
