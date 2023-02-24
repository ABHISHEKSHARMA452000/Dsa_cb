package assignments;

import java.util.Scanner;

public class Print_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int star = 2 * n + 1;
		int space = 0;
		int val = n;
		while (row <= 2 * n + 1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p = val;
			while(j<=star) {
				System.out.print(p + " ");
				if(j <= star/2) {
					p--;
				}else {
					p++;
				}
				j++;
			}
			System.out.println();
			if(row <= n) {
				space++;
				star -= 2;
				val--;
			}else {
				space--;
				star += 2;
				val++;
			}
			row++;
		}
	}

}
