package Leetcode_questions;

public class leetcode_101_SymmetricTree {

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
		public boolean isSymmetric(TreeNode root) {
			return check(root.left, root.right);
		}
	}
	//is question ma do tree ki root bana kar parr kiya hai
	//1st tree ka left and 2nd tree ka right subtree ko check kiya and vice versa
	public boolean check(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		boolean leftroot1andrightroot2 = check(root1.left, root2.right);//left of root1 and right of root2
		boolean rightroot1andleftroot2 = check(root1.right, root2.left);//right of root1 and left of root2
		//isliya do call lagani padhi haiek bar leftroo1 and rightroot2 and vice versa
		return leftroot1andrightroot2 && rightroot1andleftroot2 ;
	}

}
