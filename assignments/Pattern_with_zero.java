package assignments;

import java.util.Scanner;

public class Pattern_with_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); 
		int row = 1;
		int star = 1;
		while(row <= n) {
			int i = 1;
			int val = row;
			while(i<=star) {
				if(i == 1 || i == star) {
					System.out.print(val + " ");
				}else {
					System.out.print("0 ");
				}
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
