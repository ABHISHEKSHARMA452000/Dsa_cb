package HackerankQuestion;

import java.io.*;
import java.util.*;

public class CaseInsensitive_Anagram {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean flag = ValidAnagram(a, b);
		if (flag) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}

	public static boolean ValidAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		int[] freq = new int[27];
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
				int idx = a.charAt(i) - 96;
				freq[idx]++;
			} else if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
				int idx = a.charAt(i) - 64;
				freq[idx]++;
			}
		}
		// for(int i=0;i<freq.length;i++){
		// System.out.print(freq[i] + " ");
		// }
		for (int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			if (b.charAt(i) >= 97 && b.charAt(i) <= 122) {
				int idx = ch - 96;
				freq[idx]--;
			} else if (b.charAt(i) >= 65 && b.charAt(i) <= 90) {
				int idx = ch - 64;
				freq[idx]--;
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				return false;
			}
		}
		return true;

	}
}