package Leetcode_questions;

import java.util.*;

public class leetcode_139_WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		HashMap<String,Boolean> map = new HashMap<>();
		String s = "catsandog";
		list.add("cats");
		list.add("sand");
		list.add("and");
		list.add("dog");
		list.add("cat");
//		String s = "leetcode";		
//		list.add("leet");
//		list.add("code");
		//System.out.println(wordbreak(s,list));
		System.out.println(wordbreak(s,list,map));
		
	}
	public static boolean wordbreak(String s,List<String> list,HashMap<String,Boolean> map) {
		if(list.contains(s)) {
			return true;
		}
		if(map.containsKey(s)) {
			return map.get(s);
		}
		for(int i=1;i<s.length();i++) {
			String str = s.substring(0,i);
			if(list.contains(str) == false) {
				continue;
			}else if(list.contains(str) == true) {
				boolean flag = wordbreak(s.substring(i),list,map);
				if(flag) {
					map.put(s,true);
					return true;
				}
			}
		}
		map.put(s, false);
		return false;		
	}

}
