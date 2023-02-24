package assignments;

import java.util.Scanner;

public class String_DifferenceInAsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		difference(str);
	}

	public static void difference(String str) {
		int i = 0;
		String ans = "";
		while (i < str.length()-1) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			int diff = ch2 - ch1;
			//ans = ch1 +  diff + ch2; //error cannot convert from int to String
			ans += ch1  + "" + diff ;
			//System.out.println(ans);
			i++;
		}
		ans = ans + str.charAt(str.length()-1);
		System.out.println(ans);
	}
}
