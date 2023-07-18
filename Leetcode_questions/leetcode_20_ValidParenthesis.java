package Leetcode_questions;

import java.util.*;

public class leetcode_20_ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(){}[]";
		System.out.println(IsValid(str));
	}

	public static boolean IsValid(String str) {
		Stack<Character> st = new Stack<>();
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				st.push(str.charAt(i));
			}else if(str.charAt(i) == ')') {
				if(st.size() == 0 || st.peek() != '(') {
					return false;
				}else {
					st.pop();
				}
			}else if(str.charAt(i) == '}') {
				if(st.size() == 0 || st.peek() != '{') {
					return false;
				}else {
					st.pop();
				}
			}else if(str.charAt(i) == ']') {
				if(st.size() == 0 || st.peek() != '[') {
					return false;
				}else {
					st.pop();
				}
			}
			i++;
		}
		if(st.size() != 0) {
			return false;
		}
		return true;
	}
}
