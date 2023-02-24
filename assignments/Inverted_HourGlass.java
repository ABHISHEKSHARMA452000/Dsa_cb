package assignments;

import java.util.Scanner;

public class Inverted_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star1 = 1;
		int star2 = 1;
		int space = 2 * n - 1;
		int val = n;
		while (row <= 2 * n + 1) {
			int i = 1;
			int p = n;
			while (i <= star1) {
				System.out.print(p + " ");
				p--;
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			int m = val;
			if (row == n + 1) {
				k = 2;
				m = val + 1;

			}

			while (k <= star2) {
				System.out.print(m + " ");
				m++;
				k++;
			}

			if (row <= n) {
				star1 += 1;
				space -= 2;
				star2 += 1;
				val--;

			} else {
				star1 -= 1;
				space += 2;
				star2 -= 1;
				val++;
			}
			row++;
			System.out.println();
		}
	}

}
