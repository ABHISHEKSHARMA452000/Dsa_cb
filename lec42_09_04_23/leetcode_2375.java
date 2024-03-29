package lec42_09_04_23;

import java.util.*;

public class leetcode_2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IIIDIDDD";
		System.out.println(DI(str));
	}
	public static String DI(String s) {
		Stack<Integer> st = new Stack<>();
		int count =1;
		int[] ans =new int[s.length() + 1];
		for (int i = 0; i <= s.length(); i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				while(!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;
				}
			}else {
				st.push(i);
			}
		}
		String str = "";
		for (int i = 0; i < ans.length; i++) {
			str += ans[i];
		}
		return str;
	}
}
