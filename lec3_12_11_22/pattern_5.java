package lec3_12_11_22;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int star = n;
		int space = 0;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<= star) {
				System.out.print("* ");
				j++;
			}
			// next row
			System.out.println();
			row++;
			space++;
			star--;
		}
	}

}
