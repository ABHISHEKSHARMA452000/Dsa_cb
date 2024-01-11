package GeeksForGeeks;

import java.util.Scanner;
import java.util.Stack;

public class SortAStack_IBM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> s = new Stack<>();
//		s.push(3);
//		s.push(5);
//		System.out.println(s);
		for (int i = 0; i < n; i++) {
			s.push(sc.nextInt());
		}

		Stack<Integer> st = sort(s);
		System.out.println(st);
		System.out.println(st.peek());
	}
// 	5
//	11 2 32 3 41
//	3
//	3 2 1

//	public static Stack<Integer> sort(Stack<Integer> s)
//	{
//		//add code here.
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		while(!s.isEmpty()){
//		    int val = s.pop();
//		    pq.add(val);
//		}
//		while(!pq.isEmpty()){
//		    int val = pq.remove();
//		    s.push(val);
//		}
//		return s;
//	}
	public static Stack<Integer> sort(Stack<Integer> s) {
		// add code here.
		Stack<Integer> B = new Stack<>();
		Stack<Integer> C = new Stack<>();
		while (!s.isEmpty()) {
			int val = s.pop();
			if (B.isEmpty()) {
				B.push(val);
			} else {
				while (!B.isEmpty() && val >= B.peek()) { // jab ma pop kar raha hu B empty ho gaya but loop B.peek()
															// maang raha hai giving error os Empty stack exception
					int pop = B.pop();
					C.push(pop);
				}
				B.push(val);
				while (!C.isEmpty()) {
					B.push(C.pop());
				}
			}
		}
		while (!B.isEmpty()) {
			int val = B.pop();
			s.push(val);
		}
		return s;
	}
}
