package lec32_05_03_23;

import java.util.*;

public class leetcode_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(ques,list,ans);
		System.out.println(ans);
	}
	public static void Partitioning(String ques,List<String> list,List<List<String>> ans) {
		if(ques.length() == 0) {
			//System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(palindrome(s)) {
				list.add(s);
				Partitioning(ques.substring(i),list,ans);
				list.remove(list.size() -1);
			}
		}
	}
	public static boolean palindrome(String s) { 
		int left = 0;
		int right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
