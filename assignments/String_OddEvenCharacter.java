package assignments;

import java.util.Scanner;

public class String_OddEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		OddEven(s);
	}
	public static void OddEven(String s) {
		String ans = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i%2 == 0) {
				int val = ch + 1;
				ans = ans + (char)val;
			}else {
				int val = ch - 1;
				ans = ans + (char)val;
			}
		}
		System.out.println(ans);
	}
}
