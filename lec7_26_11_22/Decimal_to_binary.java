package lec7_26_11_22;

import java.util.Scanner;

public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem * mul;
			mul = mul*10;
			n = n/2;
		}
		System.out.println(sum);
	}

}
