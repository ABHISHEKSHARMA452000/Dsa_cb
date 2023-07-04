package Leetcode_questions;

import java.util.*;

public class leetcode_1305_AllElementsinTwoBinarySearchTrees {

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
	    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
	    	ArrayList<Integer> list1 = Inorder(root1);
	        ArrayList<Integer> list2 = Inorder(root2);
	        List<Integer> ans = new ArrayList<>();
	        int n = list1.size();
	        int m = list2.size();
	        int i=0,j=0;
	        while(i<n && j<m) {
	        	if(list1.get(i) < list2.get(j)) {
	        		ans.add(list1.get(i));
	        		i++;
	        	}else {
	        		ans.add(list2.get(j));
	        		j++;
	        	}
	        }
	        while(i<n) {
	        	ans.add(list1.get(i));
        		i++;
			}
			while(j<m) {
				ans.add(list2.get(j));
        		j++;
			}
			return ans;
	    }
	    public ArrayList<Integer> Inorder(TreeNode root){
	    	ArrayList<Integer> list = new ArrayList<>();
	    	Traversal(root,list);
	    	return list;
	    }
	    public void Traversal(TreeNode root,ArrayList<Integer> list) {
	    	if(root == null) {
	    		return;
	    	}
	    	Traversal(root.left,list);
	    	list.add(root.val);
	    	Traversal(root.right,list);
	    }
	}
}