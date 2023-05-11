package lec48_07_05_23;

import Linked_List_Implementation.LinkedList.Node;

public class LinkedList_floydc_algo {
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
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
	public void Display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	public void CreateCycle() throws Exception{
		
	}
}
