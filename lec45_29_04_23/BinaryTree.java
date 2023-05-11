package lec45_29_04_23;
import java.util.*;
public class BinaryTree {
	
	public class Node{ //data member
		int data;
		Node left;
		Node right;
	}
	private Node root; //data member
	Scanner sc = new Scanner(System.in); //data member
	public BinaryTree() {
		root = CreateTree(); //object bana ga toh ya apna aap hi call ho jaya ga function constructor call ho jayaga apna aap
	}
	private Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if(hlc) { //has left child
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) { //has right child
			nn.right = CreateTree();
		}
		return nn;
	}
	public void Display() {// ya isliya banaya hai bcoze root not accessible to client toh ek display funtion public banaya jo public hai vo internally privte display ko call kara ga and root of tree internaaly hi pass ho jayagi of particular that tree ki
		
		Display(root);
	}
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		String s = "";
		s = s + nn.data;
		s = "<--" + s + "-->";
		if(nn.left != null) {
			s = nn.left.data + s;
		}else {
			s = "." + s;
		}
		if(nn.right != null) {
			s =  s + nn.right.data;
		}else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	public int max() {
		return max(root);
	}
	private int max(Node nn) {
		if(nn == null) {
			return Integer.MIN_VALUE;//-infinity
		}
		int left = max(nn.left);
		int right = max(nn.right);
		
		return Math.max(left, Math.max(right,nn.data));
	}
	public boolean find(int item) {
		return find(this.root,item);
	}
	private boolean find(Node nn,int item) {
		if(nn==null) {
			return false;
		}
		if(nn.data == item) {
			return true;
		}
		boolean left = find(nn.left,item);
		boolean right = find(nn.right,item);
		return left || right;
	}
	public int ht() {
		return ht(this.root);
	}
	private int ht(Node node) {
		if(node == null) {
			//return 0; if single node ki ht 1 mani toh
			return -1; //if single node ki ht 0 mani toh
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	private void PreOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}
	private void InOrder(Node node) {
		if(node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);
	}
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}
	private void PostOrder(Node node) {
		if(node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data + " ");
	}
	public void levelorder() {
		//LinkedList<Node> q = new LinkedList<>(); //add last remove first sa queue
		//or
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.data + " ");
			if(rv.left != null) {
				q.add(rv.left);//last ma add krega
			}
			if(rv.right != null) {
				q.add(rv.right);//last me add krega
			}
		}
		System.out.println();
	}
}
