package assignments;

import java.util.Scanner;

public class Recursion_NthTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int ans = 0;
		System.out.println(NthTriangle(n));
	}
	public static int NthTriangle(int n) {
		if(n == 1) {
			return 1;
		}
		int fnm1 = NthTriangle(n-1);
		return fnm1 + n;
	}

}
