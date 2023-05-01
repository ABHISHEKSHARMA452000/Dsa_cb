package lec42_09_04_23;

import lec40_02_04_23.DynamicQueue;
//mana dynamic ko import kiya means normal stack/queue parent hai auska vo is package ma apna aap hi aagaya dynamic ka saath
//pop efficient o(1) and push o(n)
//opposite bhi possible in stack and queue both ma

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
