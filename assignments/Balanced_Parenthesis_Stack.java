package assignments;

import java.util.*;

public class Balanced_Parenthesis_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean ans = Balanced(str);
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static boolean Balanced(String str) {
		Stack<Character> st = new Stack<>();
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				st.push(str.charAt(i));
			}else if(str.charAt(i) ==')') {
				if(st.size() == 0 || st.peek() != '(') {
					return false;
				}else {
					st.pop();
				}
			}else if(str.charAt(i) =='}') {
				if(st.size() == 0 || st.peek() != '{') {
					return false;
				}else {
					st.pop();
				}
			}else if(str.charAt(i) ==']') {
				if(st.size() == 0 || st.peek() != '[') { //phele ya check ki stack empty hai ya nhi then peek check karo if peek 
					return false; //par kuch or brackett hai then also return false
				}else {
					st.pop();
				}
			}
			i++;
		}
		if(!st.isEmpty()) {//((()) after all function for balanced parenthesis stack should be empty if not then return false
			return false;
		}
		return true;
	}
	
}
