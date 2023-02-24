package assignments;

import java.util.Scanner;

public class Pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 2*n-3;
		int star = 1;
		while(row <= n) {
			int i = 1;
			int val = 1;
			while(i<=star) {
				System.out.print(val + " ");
				i++;
				val++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			val=star;
			if(row == n) {
				k=2;
				val=star-1;
			}
			
			while(k<=star) {
				System.out.print(val + " ");
				val--;
				k++;	
			}
			System.out.println();
			space -= 2;
			star++;
			row++;
			
		}
	}

}
