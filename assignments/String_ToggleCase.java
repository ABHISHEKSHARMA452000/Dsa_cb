package assignments;

import java.util.Scanner;

public class String_ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ToggleCase(s);
	}
	public static void ToggleCase(String s) {
		String ans = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >= 65 && ch<=90) {
				int val = ch+32;
				char newch = (char)val;
				ans = ans + newch;
			}
			else {
				int val = ch-32;
				char newch = (char)val;
				ans = ans + newch;
			}
		}
		System.out.println(ans);
	}
}
