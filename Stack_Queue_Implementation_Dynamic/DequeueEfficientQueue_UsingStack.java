package Stack_Queue_Implementation_Dynamic;

public class DequeueEfficientQueue_UsingStack {
	DynamicStack st;
	public DequeueEfficientQueue_UsingStack(){
		st = new DynamicStack();
	}
	public void Enqueue(int item) throws Exception {
		DynamicStack hlp = new DynamicStack();
		while(!st.IsEmpty()) {
			hlp.push(st.pop());
		}
		st.push(item);
		while(!hlp.IsEmpty()) {
			st.push(hlp.pop());
		}
	}
	public int Dequeue() throws Exception{
		return st.pop();
	}
	public boolean IsEmpty() {
		return st.IsEmpty();
	}
	public int size() {
		return st.size();
	}
	public int GetFront() throws Exception{
		return st.peek();
	}
	
	
}
