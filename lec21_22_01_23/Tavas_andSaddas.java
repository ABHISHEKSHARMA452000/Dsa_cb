package lec21_22_01_23;

import java.util.Scanner;

public class Tavas_andSaddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Str = sc.next();
		System.out.println(Index(Str));
	}

	public static int Index(String str) {
		int n = str.length();
		int count = (1 << n) - 2; // n-1 tak ka saari lucky number ka count hai ya sab
		int pos = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				count = count + (1 << pos);
			}
			pos++;
		}
		return count + 1;
	}
}
