package assignments;
import java.util.*;
public class DequeueEfficientQueueUsingStack {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public static class DequeueEfficientQueue_UsingStack {
		Stack<Integer> st;
		public DequeueEfficientQueue_UsingStack(){
			st = new Stack<>();
		}
		public void Enqueue(int item) throws Exception {
			Stack<Integer> hlp = new Stack<>();
			while(!st.isEmpty()) {
				hlp.push(st.pop());
			}
			st.push(item);
			while(!hlp.isEmpty()) {
				st.push(hlp.pop());
			}
		}
		public int Dequeue() throws Exception{
			return st.pop();
		}
		public boolean IsEmpty() {
			return st.isEmpty();
		}
		public int size() {
			return st.size();
		}
		public int GetFront() throws Exception{
			return st.peek();
		}
		
	}   
	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DequeueEfficientQueue_UsingStack dq = new DequeueEfficientQueue_UsingStack();
		for (int i = 0; i < n; i++) {
			dq.Enqueue(i);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(dq.Dequeue() + " ");
		}
	}

}
