package assignments;

import java.util.Scanner;

public class Ultra_Fast_Mathematicans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String str1 = sc.next();
			String str2 = sc.next();
			Fast(str1, str2);
			t--;
		}
	}

	public static void Fast(String s1, String s2) {
		String ans = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				ans = ans + "1";
			}else {
				ans = ans + "0";
			}
		}
		System.out.println(ans);
	}

}
