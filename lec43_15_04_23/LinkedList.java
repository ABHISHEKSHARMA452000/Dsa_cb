package lec43_15_04_23;

public class LinkedList {
	
	public class Node{ //ya bhi linked list ka data menmber hai
		int val;
		Node next;
	}
	private Node head;//ya phele diary ka address hai
	private int size;
	private Node tail;
	public void Addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		}else {
			nn.next = head; //jo new node banayi hai auska next ko head ka address diya jissa node aaga connect ho jaya 
			head = nn; //then head ko new node ko point kar diya  jo ki head of thenlinkedlist bata rahi hai
			size++;
		}
	}
	public void Addlast(int item) {
		if(size == 0) {
			Addfirst(item);
		}else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	public void Addatindex(int item,int k) throws Exception {
		if(k==0) {
			Addfirst(item);
		}else if(k ==size) {
			Addlast(item);
		}else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k-1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
			
		}
	}
	//display
	public void Display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	//get
	private Node GetNode(int k) throws Exception{ //kth index ka address daga
		if(k<0 || k>=size) {
			throw new Exception("Baklol");
		}
		Node temp = head;
		for(int i=0;i<k;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public int getfirst() {
		return head.val;
	}
	public int getlast() {
		return tail.val;
	}
	public int getatindex(int k) throws Exception{
		return GetNode(k).val;
	}
	//remove
	public int removeFirst() {
		Node rv = head;
		if(size == 1) {
			head = null;
			tail = null;
			size--;
		}
		else {
			head = head.next;
			size--;
			rv.next = null;
		}
		return rv.val;
	}
	public int removelast() throws Exception {
		//Node rv = ;
		if(size == 1) {
			return removeFirst();
		}else {
			Node rv = GetNode(size-2);
			int val = tail.val;
			rv.next = null;
			tail = rv;
			size--;
			return val;
		}
	}
	public int removeatindex(int k) throws Exception {
		if(k == 0) {
			return removeFirst();
		}else if(k == size-1) {
			return removelast();
		}else {
			Node k_1th = GetNode(k-1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.val;
		}
	}
	
}
