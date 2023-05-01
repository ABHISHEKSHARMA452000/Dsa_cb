package Stack_Queue_Implementation_Static;

public class ClientStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		System.out.println(st.IsEmpty());
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.peek());
		System.out.println(st.IsEmpty());
		st.Display();
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.IsFull());
		st.Display();
		st.push(4);
		st.push(5);
		st.Display();
		System.out.println(st.peek());
		System.out.println(st.IsFull());
		//st.push(6);
//		while(st.size() > 0) {
//			st.pop();
//		}
		//st.pop();
	}

}
