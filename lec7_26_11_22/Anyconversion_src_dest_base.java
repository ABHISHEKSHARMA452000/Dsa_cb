package lec7_26_11_22;

import java.util.Scanner;

public class Anyconversion_src_dest_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0; // dest ma division vala hota hai and src ma mul vala hota hai but one of the base should be 10 base
		
		int mul = 1;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem * mul;
			mul = mul*8;
			n = n/10;
		}
		System.out.println(sum);
	}

}
