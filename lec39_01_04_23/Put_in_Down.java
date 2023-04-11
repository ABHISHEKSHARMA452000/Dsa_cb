package lec39_01_04_23;

import java.util.Stack;

public class Put_in_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		Insert_Down(st,-8);
		System.out.println(st);
	}
	private static void Insert_Down(Stack<Integer> st,int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int val = st.pop();
		Insert_Down(st,item);
		st.push(val);
	}

}
