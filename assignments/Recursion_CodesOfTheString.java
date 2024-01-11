package assignments;

import java.util.*;

public class Recursion_CodesOfTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<String> list = new ArrayList<>();
		Print(s, "");
		ArrayList<String> ans = CodesofString(s,"",list);
		System.out.println(ans);
	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		int num = ch-'0';
		Print(ques.substring(1), ans + (char) (96 + num));
		if (ques.length() >= 2) {
			int val = Integer.parseInt(ques.substring(0, 2));
			if (val <= 26) {
				Print(ques.substring(2), ans + (char) (96 + val));
			}
		}
	}
	public static ArrayList<String> CodesofString(String ques,String ans,ArrayList<String> list){
		if(ques.length() == 0) {
			list.add(ans);
			return list;
		}
		char ch = ques.charAt(0);
		int num = ch-'0';
		CodesofString(ques.substring(1),ans + (char) (96 + num),list);
		if (ques.length() >= 2) {
			int val = Integer.parseInt(ques.substring(0, 2));
			if (val <= 26) {
				CodesofString(ques.substring(2), ans + (char) (96 + val),list); //ja ruree nhi ki return value ko lena hi hai bus call laga do aaga ka liya
			}
		}
		return list;
	}
}







