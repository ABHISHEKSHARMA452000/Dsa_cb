package assignments;

import java.util.Scanner;

public class Hollow_rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = n;
		int space = n-1;
		int row = 1;
		//int constant = n-2;
		while(row <= n) {
			int j = 1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int i= 1;
			while(i<=n) {
				if(row==1 || row == n || i==1 || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
			row++;
			space--;
		}
//		for(int i =1;i<=n;i++) {
//			for(int j=1;j<=space;j++) {
//				System.out.print(" ");		
//			}
//			for(int k=1;k<=n;k++) {
//				
//			}
//			space--;
//		}
	}

}
