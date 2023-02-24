package lec4_13_11_22;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int star = 1;
		while(row<= 2*n-1) {
			int i=1;
			while(i<= star) {
				System.out.print("* ");
				i++;
			}
			if(row< n) {
				star++;
			}else {
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
