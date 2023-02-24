package lec4_13_11_22;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = 1;  // no need to maintain more variable
		int space = 2*n-3;
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
			if(row == n) {  //if last aati hai toh ek star extra aata hai that why ya condition daal do k=2 kar do jissa ek star kam print hoga
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			star++;
			space-=2;
			row++;
			System.out.println();
		}
	}

}
