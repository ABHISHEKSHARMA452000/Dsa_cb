package assignments;

import java.util.*;

public class StringsStringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		compression(str);
	}

	public static void compression(String str) {
		String ans = "";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			else {
				ans += str.charAt(i);
				if(count > 1) {
					ans += count;
					count = 1;
				}
			}
		}
		ans += str.charAt(str.length()-1);
		if(count > 1) {
			ans += count;
		}
		System.out.println(ans);
	}
}
