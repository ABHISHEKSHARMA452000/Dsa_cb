package Linked_List_Implementation;

public class LinkedList {
	//DATA MEMBER OF LINKEDLIST
		public class Node{
			int data;
			Node next; //Student s = new Student();  s ka type Student hai and in same way next node ka address lena hai toh vo Node type ka hona chahiya
		}//next jo hai vo address rak rah hai na ek node ka toh kis type ka hoga node type ka
		private Node head; //first node of ll ka address
		private Node tail; //last node of ll ka address
		private int size; //tells about the size 
		
		//METHODS OF LINKEDLIST
		//Add Methods
		public void Addfirst(int item) {
			Node nn = new Node();
			nn.data = item;
			if(size == 0) {
				head = nn;
				tail = nn;
				size++;
			}else {
				nn.next = head;//jo new node banayi hai auska next ko head ka address diya jissa node aaga connect ho jaya
				head = nn;//then head ko new node ko point kar diya  jo ki head of thenlinkedlist bata rahi hai
				size++;
			}
		}
		public void Addlast(int item) {
			if(size == 0) {
				Addfirst(item);
			}else {
				Node nn = new Node();
				nn.data = item;
				tail.next = nn;
				tail = nn;
				size++;
			}
		}
		public void Addatindex(int item,int k) throws Exception{
			if(k==0) {
				Addfirst(item);
			}else if(k==size) {
				Addlast(item);
			}else {
				Node nn = new Node();
				nn.data = item;
				Node k_1 = GetNode(k-1);
				nn.next = k_1.next;
				k_1.next = nn;
				size++;
			}
		}
		//Remove Methods
		public int removeFirst() {
			Node temp = head;
			if(size == 1) {
				head = null;
				tail = null;
				size--;
			}else {
				head = head.next;
				temp.next = null;
				size--;
			}
			return temp.data;
		}
		public int removeLast() throws Exception {
			if(size == 1) {
				return removeFirst();
			}else {
				Node Last2nd = GetNode(size-2);
				int val = tail.data;
				Last2nd.next = null;
				tail = Last2nd;
				size--;
				return val;
			}
		}
		public int removeatindex(int k) throws Exception{
			if(k == 0) {
				return removeFirst();
			}else if(k==size-1) {
				return removeLast();
			}else {
				Node k_1th = GetNode(k-1);
				Node kth = k_1th.next;
				k_1th.next = kth.next;
				kth.next = null;
				size--;
				return kth.data;
			}
			
		}
		//Get Methods
		private Node GetNode(int k) throws Exception {
			if(k <0 || k >= size) { 
				throw new Exception("bklol");
			}
			Node temp = head;
			for(int i=0;i<k;i++) {
				temp = temp.next;
			}
			return temp;
		}
		public int GetFirst() {
			return head.data;
		}
		public int GetLast() {
			return tail.data;
		}
		public int Getatindex(int k) throws Exception {
			return GetNode(k).data;
		}
		//Display method
		public void Display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(".");
		}
}
