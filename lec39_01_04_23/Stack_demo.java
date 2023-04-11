package lec39_01_04_23; 
import java.util.Stack;
public class Stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println(st.peek()); //only top element ki value return kar ta hai
		System.out.println(st.pop()); //element remove bhi kar diya
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		
	}

}
