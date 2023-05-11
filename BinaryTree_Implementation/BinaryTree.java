package BinaryTree_Implementation;

import java.util.*;

public class BinaryTree {
	
	//Data member
	public class Node{ //ek node kasa dehkti hai tree ma
		int data;
		Node left;
		Node right;
	}
	private Node root;//becoze is ka access ma kisi ko nhi dena chahata bcoz na koi change na karda only es class ma hi access raha root ka
	Scanner sc = new Scanner(System.in);//tree create karna la liya input lena hoga so scanner ki need hogi
	public BinaryTree() {
		root = CreateTree();//object bana ga toh ya apna aap hi call ho jaya ga function constructor call ho jayaga apna aap
		//es CreateTree sa jonode ka address milaga vo root ma ja kar save hoga
	}
	//Create BinaryTree Function
	private Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();//has left child
		if(hlc) {
			nn.left = CreateTree(); //hai recursion tu left tree bana kar la
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = CreateTree();//hai recursion tu right tree bana kar la
		}
		return nn;
	}
	//Display funtion
	public void Display() {
		Display(root);
	}
	private void Display(Node nn) {//public karna sa BinaryTreeClient ma root nhi visible hai //root cannot be resolved to a variable so kasa call kara jayaga ab by making a public dispay and then call private display
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
			s = s + nn.right.data;
		}else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left); //left recursion
		Display(nn.right);//right recursion
	}
	//Find Maximum in binary tree
	public int max() {
		return max(root);
	}
	private int max(Node nn) {
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		
		int left = max(nn.left);
		int right = max(nn.right);
		
		return Math.max(left,Math.max(nn.data, right));
	}
	//find or search of elemnt in tree
	public boolean find(int item) {
		return find(root,item);
	}
	private boolean find(Node nn,int item) {
		if(nn == null) {
			return false;
		}
		if(nn.data == item) {
			return true;
		}
		boolean left = find(nn.left,item);
		boolean right = find(nn.right,item);
		return left || right;
	}
	//height of binary tree
	//if single node ki height ko 1 manta hai toh return 0 karo
	//if single node ki height ko 0 manta hai toh return -1 karo
	//dry run sa samaj aaya ga
	public int ht() {
		return ht(root);
	}
	private int ht(Node nn) {
		if(nn == null) {
			return -1;//when single node ki height 0 mana toh
		}
		int lh = ht(nn.left);
		int rh = ht(nn.right);
		return Math.max(lh,rh) + 1;
	}
	//preorder traversal
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	private void PreOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);//left subtree print kar ja
		PreOrder(node.right);//right subtree print kar in preorder
	}
	//InOrder
	public void InOrder() {
		InOrder(root);
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
	//PostOrder
	public void PostOrder() {
		PostOrder(root);
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
	//levelOrder traversal
	//Queue bana na ways bcoze queue koi class nhi interface hai so direct use nhi kar sakta
	//1.linkedlist sa
	//LinkedList<Node> list = new LinkedList<>();// use function of ll to implement queue
	//2.Queue interface sa
	//Queue<Node> q = new LinkedList<>();
	//3.ArrayDeque<Node> q= new ArrayDeque<>
	public void levelorder() { //remove print and add childen
		
		//ArrayDeque<Node> p = new ArrayDeque<>();
		Queue<Node> q = new LinkedList<>();//this will act as queue add->in last,remove from front,peek->front
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.data + " ");
			if(rv.left != null) {
				q.add(rv.left);
			}
			if(rv.right != null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
}

















