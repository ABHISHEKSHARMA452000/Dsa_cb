package lec4_13_11_22;

import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val = row;
			while(j<=star) {
				System.out.print(val + " ");
				if(j<=star/2) {
					val++;
				}else {
					val--;
				}
				j++;
			}
			System.out.println();
			row++;
			star += 2;
			space--;
		}  
	}

}
