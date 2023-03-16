package assignments;

import java.util.Scanner;

public class Recursion_Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = Twins(s,0);
		System.out.println(ans);
	}
	public static int Twins(String s,int ans) {
		if(s.length() <= 2) {
			return 0;
		}
		if(s.charAt(0) == s.charAt(2)) {
			ans = 1 + Twins(s.substring(1),ans);
		}else {
			ans = Twins(s.substring(1),ans);
		}
		return ans;
	}

}
