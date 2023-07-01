package Doubts_solved;

public class ReplaceWithSum {
	public class Node{
		int val;
		Node left;
		Node right;
	}
	Node root;
	public void replacesum() {
		replacesum(root);
	}
	int sum =0;
	private void replacesum(Node node) {
		if(node == null) {
			return;
		}
		replacesum(node.right);
		sum = node.val + sum;
		node.val = sum;
		replacesum(node.left);
	}
}
