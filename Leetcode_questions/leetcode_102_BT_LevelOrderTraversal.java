package Leetcode_questions;

import java.util.*;

public class leetcode_102_BT_LevelOrderTraversal {

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
		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> list = new ArrayList<>();
			if (root == null) {
				return list;
			}
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			int idx = 0; // to add value to particular index of the list
			while (!q.isEmpty()) {
				list.add(new ArrayList<>());

				int lvlSize = q.size();// after removal of last element of each level only elemnt of next lvl are
										// present in queue size
				for (int i = 0; i < lvlSize; i++) {
					TreeNode rv = q.remove();
					list.get(idx).add(rv.val);
					if (rv.left != null) {
						q.add(rv.left);
					}
					if (rv.right != null) {
						q.add(rv.right);
					}
				}
				idx++;
			}
			return list;
		}
	}

}
