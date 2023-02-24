package assignments;

import java.util.Scanner;

public class Playing_WithGoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		GoodString(s);
	}

	public static void GoodString(String s) {
		int ans = 0;
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				ans = Math.max(ans, count);
				
			}else {
				count = 0;
				continue;
			}
		}
		System.out.println(ans);
	}
}
