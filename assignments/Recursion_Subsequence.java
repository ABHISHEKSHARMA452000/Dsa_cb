package assignments;

import java.util.Scanner;

public class Recursion_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "";
		Subseq(s,ans);
		System.out.println();
		count(s);
	}
	public static void Subseq(String s,String ans) {
		if(s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = s.charAt(0);
		Subseq(s.substring(1),ans + "");
		Subseq(s.substring(1),ans + ch);
		
	}
	public static void count(String s) {
		int len = s.length();
		System.out.println(1<<len);
	}
}
