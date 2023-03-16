package Doubts_solved;

import java.util.Scanner;

public class ReplacePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			Replace(s,"");
			System.out.println();
		}
	}
	public static void Replace(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		if(ques.length() >= 2 && ques.charAt(0) == 'p' && ques.charAt(1) == 'i') {
			Replace(ques.substring(2),ans+ "3.14");
		}else {
			Replace(ques.substring(1) , ans + ques.charAt(0));
		}
	}

}
