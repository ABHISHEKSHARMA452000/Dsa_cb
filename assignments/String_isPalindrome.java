package assignments;

import java.util.Scanner;

public class String_isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Palindrome(str));
	}

	public static boolean Palindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
