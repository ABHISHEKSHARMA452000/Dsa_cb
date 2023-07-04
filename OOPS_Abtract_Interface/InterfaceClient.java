package OOPS_Abtract_Interface;

public class InterfaceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_InterfaceUsing st = new Stack_InterfaceUsing();
		st.Display();
		st.pop();
		st.push();
		System.out.println(StackI.val);
		//st.hello();
	}

}
