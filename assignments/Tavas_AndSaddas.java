package assignments;

import java.util.Scanner;

public class Tavas_AndSaddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Number(str));
	}

	public static int Number(String s) {
		int n = s.length();
		int count = (1 << n) - 2;
		int pos = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				count = count + (1 << pos);
			}
			pos++;
		}
		return count + 1;
	}

}
