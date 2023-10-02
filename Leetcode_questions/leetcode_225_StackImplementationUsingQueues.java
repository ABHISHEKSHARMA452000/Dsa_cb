package Leetcode_questions;

import java.util.*;

public class leetcode_225_StackImplementationUsingQueues {

	class MyStack {
	    Queue<Integer> q;
	    //constructor of MyStack class
	    public MyStack() {
	        q = new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        Queue<Integer> hlp =new LinkedList<>();
	        while(!q.isEmpty()) {
	        	hlp.add(q.remove());
	        }
	        q.add(x);
	        while(!hlp.isEmpty()) {
	        	q.add(hlp.remove());
	        }
	    }
	    
	    public int pop() {
	        return q.remove();
	    }
	    
	    public int top() {
	        return q.peek();
	    }
	    
	    public boolean empty() {
	        return q.size() == 0;
	    }
	}
	
//	with one queue
//	public void push(int x) {
//        q.add(x);
//        for(int i=1;i<q.size();i++) {
//        	q.add(q.remo ve());
//        }
//    }
	
}
