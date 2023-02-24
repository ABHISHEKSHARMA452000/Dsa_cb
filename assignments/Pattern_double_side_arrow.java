package assignments;

import java.util.Scanner;

public class Pattern_double_side_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int space1 = n - 1;
		int space2 = -1;
		int star = 1;
		while (row <= n) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val1 = star;
			while(j<=star) {
				System.out.print(val1 + " ");
				val1--;
				j++;
			}
			int k=1;
			while(k<=space2) {
//				if(k == 1 || k == n) {
//					System.out.println();
//				}
				System.out.print("  ");
				k++;
			}
			if(row > 1 && row < n) {
				int l = 1;
				
				int val2 = 1;
//				if(l == 1 || l == n) {
//					System.out.println();
//			    }
				while(l<=star) {

					System.out.print(val2 + " ");
					l++;
					val2++;
				}	
			}
			
			System.out.println();
			if(row<=n/2) {
				star++;
				space1 -= 2;
				space2 += 2;
			}else {
				star--;
				space1 += 2;
				space2 -= 2;
			}
			row++;
		}
	}

}
