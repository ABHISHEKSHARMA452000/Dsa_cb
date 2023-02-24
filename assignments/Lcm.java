package assignments;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divident = sc.nextInt();
		int divisor = sc.nextInt();
		int n1 = divident;
		int n2 = divisor;
		while(divident %divisor != 0) {
			int rem = divident %divisor;
			divident = divisor;
			divisor = rem;
		}
		int lcm = (n1*n2)/divisor;
		System.out.println(lcm);
	}

}
