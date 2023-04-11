package lec42_09_04_23;

import lec40_02_04_23.DynamicQueue;

public class StackImplementation_UsingQueue {

	DynamicQueue q;
	
	public StackImplementation_UsingQueue() {
		q = new DynamicQueue();
	}
	public void push(int item) throws Exception{
		DynamicQueue hlp = new DynamicQueue();
		while(!q.isEmpty()) {
			hlp.Enqueue(q.Dequeue());
		}
		q.Enqueue(item);
		while(!hlp.isEmpty()) {
			q.Enqueue(hlp.Dequeue());
		}
	}
	public int size() {
		return q.size();
	}
	public boolean isEmpty() {
		return q.size() == 0;
	}
	public int peek() throws Exception{
		return q.Getfront();
	}
	public int pop() throws Exception{
		return q.Dequeue();
	}
}
