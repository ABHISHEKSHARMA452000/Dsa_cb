package lec46_30_04_23;
import java.util.*;
public class leetcode199_BT_RightSide {

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
	int maxdepth = -1;
	class Solution {
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			View(root,ll,0);
			return ll;
		}
		public void View(TreeNode root,List<Integer> ll,int curr) {
			if(root == null) {
				return;
			}
			if(maxdepth < curr) {
				ll.add(root.val);
				maxdepth = curr;
			}
			View(root.right,ll,curr+1);
			View(root.left,ll,curr+1);
		}
	}

}
