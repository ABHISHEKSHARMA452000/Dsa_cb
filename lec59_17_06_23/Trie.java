package lec59_17_06_23;

import java.util.*;

public class Trie {
	public class Node{
		char ch;
		HashMap<Character,Node> child = new HashMap<>();
		boolean isterminal = false;
	}
	private Node root;
	public Trie() {
		Node nn = new Node();
		nn.ch = '*';
		this.root = nn;
	}
	public void insert(String word) {
		Node curr = root;
		for(int i=0;i<word.length();i++) {
			char ch =  word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;
	}
	public boolean search(String word) {
		Node curr = root;
		for(int i=0;i<word.length();i++) {
			char ch =  word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}else {
				return false;
			}
		}
		return curr.isterminal;
	}
	public boolean start(String prefix) {
		Node curr = root;
		for(int i=0;i<prefix.length();i++) {
			char ch =  prefix.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
	}
	
}
