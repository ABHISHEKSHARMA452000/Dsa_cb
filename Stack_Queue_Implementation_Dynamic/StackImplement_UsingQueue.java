package Stack_Queue_Implementation_Dynamic;

//ya import dynamicqueue nhi ki bcoze ausko same package ma hi bana hai and public bhi kiya hua hai
//mana dynamic ko import kiya means normal stack/queue parent hai auska vo is package ma apna aap hi aagaya dynamic ka saath
//pop efficient o(1) and push o(n)
//opposite bhi possible in stack and queue both ma

public class StackImplement_UsingQueue {
	DynamicQueue q;
	
	public StackImplement_UsingQueue() {
		q = new DynamicQueue(); //q= [30,20,10]
	}
	public void push(int item) throws Exception {
		DynamicQueue hlp = new DynamicQueue(); //hlp = [], q=[30,20,10]
		while(!q.IsEmpty()) {
			hlp.Enqueue(q.Dequeue()); // hlp = [30,20,10], q= []
		}
		q.Enqueue(item); // q = [40]; hlp = [30,20,10]
		while(!hlp.IsEmpty()) {//
			q.Enqueue(hlp.Dequeue()); // q = [40,30,20,10] , hlp = []
		}
	}
	public int size() {
		return q.size();
	}
	public boolean IsEmpty() {
		return q.IsEmpty();
	}
	public int peek() throws Exception {
		return q.GetFront();
	}
	public int pop() throws Exception{
		return q.Dequeue();
	}
}
