package Leetcode_questions;

import java.util.*;

public class leetcode_145_BT_PostOrderTraversal {

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
		public List<Integer> postorderTraversal(TreeNode root) {
			List<Integer> list = new ArrayList<>();
			Traversal(root, list);
			return list;
		}

		public void Traversal(TreeNode root, List<Integer> list) {
			if (root == null) {
				return;
			}
			Traversal(root.left, list);
			Traversal(root.right, list);
			list.add(root.val);
		}
	}

}
