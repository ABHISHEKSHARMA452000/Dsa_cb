package Leetcode_questions;

import java.util.*;

public class leetcode_103_LevelOrderZigZagBT {

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
		public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//			List<List<Integer>> list = new ArrayList<>();
//			if(root == null) {
//				return list;
//			}
//			//deque ma both side sa add and remove kar sakta hai
//			Deque<TreeNode> dq = new LinkedList<>();
//			int idx = 0;
//			dq.addFirst(root);
//			while(!dq.isEmpty()) {
//				list.add(new ArrayList<>());
//				int level = dq.size();
//				if(level%2 == 0) {
//					//removefirst addlast
//					for(int i=0;i<level;i++) {
//						TreeNode node = dq.removeFirst();
//						list.get(idx).add(node.val);
//						if(node.left != null) {
//							dq.addLast(node.left);
//						}
//						if(node.right != null) {
//							dq.addLast(node.right);
//						}
//					}
//				}else if(level%2 != 0) {
//					//removelast and addfirst
//					for(int i=0;i<level;i++) {
//						TreeNode node = dq.removeLast();
//						list.get(idx).add(node.val);
//						if(node.left != null) {
//							dq.addFirst(node.left);
//						}
//						if(node.right != null) {
//							dq.addFirst(node.right);
//						}
//					}
//				}
//				idx++;
//			}
//			
//			return list;
			
			
			
			//leetcode submit
			List<List<Integer>> list = new ArrayList<>();
			if (root == null) {
				return list;
			}
			// deque ma both side sa add and remove kar sakta hai
			Deque<TreeNode> dq = new LinkedList<>();
			int level = 0;//konsa lvl par left to right and right to left ka liya
			int idx = 0; //konsi index of list pa new list ma val dalni hai
			dq.addFirst(root);
			while (!dq.isEmpty()) {
				list.add(new ArrayList<>());
				int lsize = dq.size();
				if (level % 2 == 0) {
					// removefirst addlast
					for (int i = 0; i < lsize; i++) {
						TreeNode node = dq.removeFirst();
						list.get(idx).add(node.val);
						if (node.left != null) {
							dq.addLast(node.left);
						}
						if (node.right != null) {
							dq.addLast(node.right);
						}
					}
				} else if (level % 2 != 0) {
					// removelast and addfirst
					for (int i = 0; i < lsize; i++) {
						TreeNode node = dq.removeLast();
						list.get(idx).add(node.val);
						if (node.right != null) {
							dq.addFirst(node.right);
						}
						if (node.left != null) {
							dq.addFirst(node.left);
						}
					}
				}
				idx++;
				level++;
			}

			return list;
		}
	}
}
