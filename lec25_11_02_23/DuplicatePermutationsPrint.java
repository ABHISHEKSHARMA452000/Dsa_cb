package lec25_11_02_23;

import java.util.Scanner;

public class DuplicatePermutationsPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String ans = "";
		Permutation(ques,ans);
	}
	public static void Permutation(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			boolean flag = false;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j) == ch) {
					flag = true;
					break;	
				}
			}
			if(!flag) { //or flag == false
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				Permutation(s1+s2,ans+ch);
			}	
		}
	}

}
