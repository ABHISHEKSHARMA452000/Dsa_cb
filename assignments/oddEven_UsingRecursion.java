package assignments;

import java.util.Scanner;

public class oddEven_UsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		OddEven(n);
	}

	public static void OddEven(int n) {
		if(n==0) {
			return;
		}
		if(n%2 == 1) {
			System.out.println(n);
		}
		OddEven(n-1);
		if(n%2 == 0) {
			System.out.println(n);
		}
	}
}
