package lec4_13_11_22;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
		System.out.println();
		if (row < n) {
			star++;
			space--;
		} else {
			space++;
			star--;
		}
		row++;
		
		}
	}

}
