package assignments;

import java.util.Scanner;

public class Recursion_AsciiSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "";
		//int count = 0;
		AsciiSubseq(s,ans);
		System.out.println();
		Count(s);
	}
	public static void AsciiSubseq(String s,String ans) {
		if(s.length() == 0) {
			System.out.print(ans + " ");
			//count++;
			return;
		}
		char ch = s.charAt(0);
		int val = ch;
		AsciiSubseq(s.substring(1),ans + "");
		AsciiSubseq(s.substring(1),ans + ch);
		AsciiSubseq(s.substring(1),ans + val);
	}
	public static void Count(String s) {
		int len = s.length();
		int count = (int)Math.pow(3, len);
		System.out.println(count);
	}
}
