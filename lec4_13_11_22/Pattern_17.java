package lec4_13_11_22;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = n/2;  // no need to maintain more variable
		int space = 1;
		int row = 1;
		while(row <= n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			if(row < n/2+1) {   //or row <= n/2 same
				star--;
				space = space + 2;
			}else {
				space = space - 2;
				star++;
			}
			row++;
		}				
	}

}
