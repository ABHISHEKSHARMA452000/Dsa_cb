package Leetcode_questions;

import java.util.*;

public class leetcode_95_Unique_BST_II {

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
	    public List<TreeNode> generateTrees(int n) {
	        return GenTrees(1,n);
	    }
	    public List<TreeNode> GenTrees(int start,int end){
	    	List<TreeNode> list = new ArrayList<>();	    	
 	    	if(start > end) {
 	    		list.add(null);
	    		return list;
	    	}
// 	    	if(start == end) {
// 	    		list.add(new TreeNode(start));
// 	    		return list;
// 	    	}
	    	for(int i = start;i<=end;i++) {//1 as a root node 2 as a root node 3 as a root node la raha hai 
	    		List<TreeNode> leftPossibleTrees = GenTrees(start,i-1);
	    		List<TreeNode> rightPossibleTrees = GenTrees(i+1,end);
	    		for(TreeNode eachleft : leftPossibleTrees) {
	    			for(TreeNode eachright : rightPossibleTrees) {
	    				TreeNode root = new TreeNode(i);
	    				root.left = eachleft;
	    				root.right = eachright;
	    				list.add(root);
	    			}
	    		}
	    		
	    	}
	    	return list;
	    }
	}

}
