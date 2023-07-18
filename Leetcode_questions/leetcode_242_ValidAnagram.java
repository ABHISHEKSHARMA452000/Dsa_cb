package Leetcode_questions;

import java.util.*;

public class leetcode_242_ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(isAnagram(s,t));
	}

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<t.length();i++) {
			if(map.containsKey(t.charAt(i)) == false || map.get(t.charAt(i)) <= 0) {
				return false;
			}else {
				map.put(t.charAt(i),map.get(t.charAt(i)) -1);
			}
		}
		Set<Character> set = map.keySet();
		for(Character ch : set) {
			if(map.get(ch) >= 1) {
				return false;
			}
		}
		return true;
		
	}

}
