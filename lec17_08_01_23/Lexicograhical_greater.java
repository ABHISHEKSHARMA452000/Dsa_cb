package lec17_08_01_23;

import java.util.Scanner;

public class Lexicograhical_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(s1.compareTo(s2));
		int ans = Greater_String(s1,s2);
		System.out.println(ans);
	}
	public static int Greater_String(String s1,String s2) {
		int len = Math.min(s1.length(),s2.length());
//		if(s1.equals(s2)) {
//			return 0;
//		}
		for(int i=0;i<len;i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();
	}

}
