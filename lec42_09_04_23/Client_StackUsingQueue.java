package lec42_09_04_23;

public class Client_StackUsingQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackImplementation_UsingQueue st = new StackImplementation_UsingQueue();
		st.push(10);
		st.push(20);
		st.push(1);

		st.push(-10);
		st.push(105);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

}
