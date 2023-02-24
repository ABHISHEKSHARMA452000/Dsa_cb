package lec2_06_11_22;

import java.util.*;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}	
		System.out.println(sum);
	}

}
