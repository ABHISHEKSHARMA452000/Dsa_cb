package Leetcode_questions;
import java.util.*;
public class leetcode_257_BinaryTreePaths {
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
	    public List<String> binaryTreePaths(TreeNode root) {
	        List<String> paths = new ArrayList<>();
	        RLPaths(root,paths,"");
	        return paths;
	    }
	    public void RLPaths(TreeNode root,List<String> paths,String path){
	        if(root == null){
	            return;
	        }
	        if(root.left == null && root.right == null){
	            String fpath = path + root.val;
	            paths.add(fpath);
	        }
	        RLPaths(root.left,paths,path + root.val + "->");
	        RLPaths(root.right,paths,path + root.val + "->");

	    }
	}
}
