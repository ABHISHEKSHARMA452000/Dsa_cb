package lec48_07_05_23;

import java.util.*;

public class Create_LevelOrder_Tree {

	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public Create_LevelOrder_Tree() {
		root = createTree();
	}
	private Node createTree() {
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		q.add(nn);
		while(!q.isEmpty()) {
			Node rn = q.poll();//remove first
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1 != -1) {
				Node n = new Node();
				n.val = c1;
				rn.left = n;
				q.add(n);
			}
			if(c2 != -1) {
				Node n = new Node();
				n.val = c2;
				rn.right = n;
				q.add(n);
			}		
		}
		return nn;
		
	}
}
