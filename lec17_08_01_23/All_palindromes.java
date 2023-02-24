package lec17_08_01_23;

import java.util.Scanner;

public class All_palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		PrintAllSubString(s);
	}
	public static void PrintAllSubString(String s) {
		 for(int i=0;i<s.length();i++) {
			 for(int j=i+1;j<=s.length();j++) {
				 String s1 = s.substring(i,j);
				 if(ispalindrome(s1) == true) {
					 System.out.println(s1);
				 }
			 }
		 }
	}
	public static boolean ispalindrome(String s) { 
		int left = 0;
		int right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
