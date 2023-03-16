package Leetcode_questions;

import java.util.ArrayList;
import java.util.*;

public class leetcode_17_letterCombinationOfAPhoneNumber {
	static String[] arr = { "","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		List<String> list = new ArrayList<>();
//		if(str.length() == 0) {
//			return list;
//		}
		Print(str,"",list);
		System.out.println(list);
	}

	public static void Print(String ques, String ans,List<String> list) {
		if (ques.length() == 0) {
			//System.out.println(ans + " ");
			list.add(ans);
			return;
		}

		char ch = ques.charAt(0);
		String key = arr[ch - '0'];
		for (int i = 0; i < key.length(); i++) {
			Print(ques.substring(1), ans + key.charAt(i),list);
		}
	}
	//123
}
