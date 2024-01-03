package lec5_19_11_22;

import java.util.Scanner;

public class Gcd_Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int divident = scn.nextInt();
		//int i = 1;
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		
		System.out.println(divisor);
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("heloo");
//		}
//		int i=1; //scope of access change ho gaya i ka 
//		for(;i<=5;i++) {
//			System.out.println("heloo");
//		}
//		for(int i=1;i<=5;) {
//			System.out.println("heloo");
//			i++;
//		}
	}

}

//Neither does either or both of the values, whose greatest common divisor is being sought, have any impact of which positive
//divisor is greatest. Therefore, GCD(a, b) = GCD(|a|, |b|) for any integers a and b, at least one of which is nonzero. 
//GCD(18, −12) = GCD(−18, 12) = GCD(−18, −12) = GCD(18, 12) = 6

