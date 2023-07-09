package Leetcode_questions;

import java.util.*;

public class leetcode_589_N_ary_Preorder {

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
	};
	
	class Solution {
	    public List<Integer> preorder(Node root) {
	        List<Integer> list = new ArrayList<>();
	        Traversal(root,list);
	        return list;
	    }
	    public void Traversal(Node root,List<Integer> list) {
	    	if(root == null) {
	    		return;
	    	}
	    	list.add(root.val);
	    	for(int i=0;i<root.children.size();i++) {
	    		Traversal(root.children.get(i),list);
	    	}	
	    }
	}

}
