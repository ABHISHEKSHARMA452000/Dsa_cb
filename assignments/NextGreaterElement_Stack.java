package assignments;

import java.util.*;

public class NextGreaterElement_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			nextLarger(arr);
			t--;
		}
	}

//	1.
//	O(n^2) NGE
	
//	public static void NGE(int[] arr) {
//		int[] ans = new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			//int nge = arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j] > arr[i]) {
//					ans[i] = arr[j];
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < ans.length; i++) {
//			if(ans[i] == 0) {
//				ans[i] = -1;
//			}
//		}
//		for (int i = 0; i < ans.length; i++) {
//			System.out.print(ans[i] + " ");
//		}
//	}

	//O(n) using stack

	public static void nextLarger(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + "," + ans[i]);
		}
	}
}
