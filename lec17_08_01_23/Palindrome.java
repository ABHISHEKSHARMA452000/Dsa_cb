package lec17_08_01_23;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(palindrome(s));
		
	}
	public static boolean palindrome(String s) { 
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
