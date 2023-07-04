package Leetcode_questions;

import java.util.*;

public class leetcode_429_NarryTree_LvlOrderTraversal {

	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}

	class Solution {
		public List<List<Integer>> levelOrder(Node root) {
			List<List<Integer>> list = new ArrayList<>();
			if (root == null) {
				return list;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			int idx = 0;
			while (!q.isEmpty()) {
				list.add(new ArrayList<>());
				int size = q.size();
				for(int i=0;i<size;i++) {
					Node rv = q.poll();
					list.get(idx).add(rv.val);
					for(Node child : rv.children) {
						q.add(child);
					}
				}
				idx++;
			}
			return list;
		}
	}

}
