package Leetcode_questions;

import java.util.*;

public class leetcode_230_KthSmallestInBST {
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
		public int kthSmallest(TreeNode root, int k) {
			ArrayList<Integer> list = new ArrayList<>();
			Kth(root, list);
			return list.get(k - 1);

		}

		public void Kth(TreeNode root, ArrayList<Integer> list) {
			if (root == null) {
				return;
			}
			Kth(root.left, list);
			list.add(root.val);
			Kth(root.right, list);
		}
	}
}
