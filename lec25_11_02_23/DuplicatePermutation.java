package lec25_11_02_23;

import java.util.Scanner;
//my try to solve
public class DuplicatePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String ans = "";
		int[] arr = new int[27];
		for(int i=0;i<arr.length;i++) {
			char ch = ques.charAt(i);
			int val = 96 - ch;
			arr[i] = Math.abs(val);
		}
		//String ques = "";
//		for(int i=1;i<arr.length;i++) {
//			int ch = 96+arr
//			ques += 
//		}
		Permutation(ques,ans);
		
	}
	public static void Permutation(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			Permutation(s1+s2,ans+ch);
		}
	}

}
