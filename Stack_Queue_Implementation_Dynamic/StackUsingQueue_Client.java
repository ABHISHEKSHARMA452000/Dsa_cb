package Stack_Queue_Implementation_Dynamic;

public class StackUsingQueue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackImplement_UsingQueue st = new StackImplement_UsingQueue();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
		st.push(40);
		System.out.println(st.pop());
	}

}
