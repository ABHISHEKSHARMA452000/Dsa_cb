package Leetcode_questions;

import java.util.*;

public class leetcode_863_AllNodesDistanceKinBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	class Solution {
	    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
	        List<Integer> list = new ArrayList<>();
	        List<TreeNode> NodeToRoot = NodeToRootPath(root,target);
	        for(int i=0;i<NodeToRoot.size();i++) {
	        	kLevelDown(NodeToRoot.get(i),k-i,i>0?NodeToRoot.get(i-1):null,list);
	        }
	        return list;
	    }
	    public List<TreeNode> NodeToRootPath(TreeNode node,TreeNode target){
	    	if(node == null) {
	    		return new ArrayList<>();
	    	}
	    	if(node.val == target.val) {
	    		List<TreeNode> list = new ArrayList<>();
	    		list.add(node);
	    		return list;
	    	}
	    	List<TreeNode> llist = NodeToRootPath(node.left, target);
	        if(llist.size() > 0){
	            llist.add(node);
	            return llist;
	        }
	        
	        List<TreeNode> rlist = NodeToRootPath(node.right, target);
	        if(rlist.size() > 0){
	            rlist.add(node);
	            return rlist;
	        }
	        return new ArrayList<>();
	    }
	    public void kLevelDown(TreeNode node,int k,TreeNode blocker,List<Integer> list) {
	    	if(node == null || k<0 || node == blocker) {
	    		return;
	    	}
	    	if(k == 0) {
	    		list.add(node.val);
	    		return;
	    	}
	    	kLevelDown(node.left,k-1,blocker,list);
	    	kLevelDown(node.right,k-1,blocker,list);
	    }
	    
	}
	

}
