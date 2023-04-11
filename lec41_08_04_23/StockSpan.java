package lec41_08_04_23;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,35,40,38,35};
		Span(arr);
	}
	
	private static void Span(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i] = i+1;
			}else {
				ans[i] = i-st.peek();
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}
}
