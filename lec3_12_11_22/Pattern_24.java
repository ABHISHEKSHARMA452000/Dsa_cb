package lec3_12_11_22;

import java.util.Scanner;

public class Pattern_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int star = 1;
//		int space = n-1;
//		int row = 1;
//		while (row <= n) {  // ctrl + shift + f for formating code
//			int i = 1;
//			while (i <= space) {
//				System.out.print("  ");
//				i++;
//			}
//			
//			int j = 1;
//			while(j<= star) {
//				System.out.print(j );
//			}
//			j++;
//			System.out.println();
//			row++;
//			star = star + 2;
//			space--;
//		}
		int count =1;
		for(int i =1;i<=n;i++) {
			
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=2*i-1;j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

}
