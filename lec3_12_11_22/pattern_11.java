package lec3_12_11_22;

import java.util.Scanner;

public class pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		while (row <= n) {  // ctrl + shift + f for formating code
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<= star) {
				if(j%2 == 0) {
					System.out.print("  ");
					
				}else {
					System.out.print("* ");
					
				}	
				j++;
			}
			System.out.println();
			row++;
			star = star + 2;
			space--;
		}
	}

}
