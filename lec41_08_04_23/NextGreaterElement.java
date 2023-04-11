package lec41_08_04_23;
import java.util.*;
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,3,23,9,15};
		NGE(arr);
	}
	private static void NGE(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>(); //stack jisma index hai
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i); // ya toh haar bar hoga jo elemnet st ma jaya ga hi
		}
		while(!st.isEmpty()) { 
			ans[st.pop()] = -1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}

}
