package Leetcode_questions;

import java.util.*;

public class leetcode_13_Roman_To_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashMap<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int ans = RomanToInteger(str, map);
		System.out.println(ans);
		
	}
	public static int RomanToInteger(String str,HashMap<Character,Integer> map) {
		int ans = 0;
		int chala = 0;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i) == 'I' && (str.charAt(i+1) == 'V' || str.charAt(i+1) == 'X')) || (str.charAt(i) == 'X' && (str.charAt(i+1) == 'L' || str.charAt(i+1) == 'C')) || (str.charAt(i) == 'C' && (str.charAt(i+1) == 'D' || str.charAt(i+1) == 'M'))){
				int chip1 = map.get(str.charAt(i+1));
				int chi = map.get(str.charAt(i));
				ans = ans + chip1 - chi;
				//i ka increment
				i++;
				chala += 2;
//			}else if(str.charAt(i) == 'X' && (str.charAt(i+1) == 'L' || str.charAt(i+1) == 'C')){
//				int chip1 = map.get(str.charAt(i+1));
//				int chi = map.get(str.charAt(i));
//				ans = ans + chip1 - chi;
//			}else if(str.charAt(i) == 'C' && (str.charAt(i+1) == 'D' || str.charAt(i+1) == 'M')) {
//				int chip1 = map.get(str.charAt(i+1));
//				int chi = map.get(str.charAt(i));
//				ans = ans + chip1 - chi;
			}else {
				int chi = map.get(str.charAt(i));
				ans = ans + chi;
				chala += 1;
			}
		}
		if(chala == str.length()-1) {
			ans = ans + map.get(str.charAt(chala));
		}
		
		return ans;
	}

}
