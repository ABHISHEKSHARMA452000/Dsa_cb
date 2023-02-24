package lec2_06_11_22;

import java.util.*;

public class reverse_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rev = 0;
		while(n > 0) {
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		System.out.println(rev);
	}

}
