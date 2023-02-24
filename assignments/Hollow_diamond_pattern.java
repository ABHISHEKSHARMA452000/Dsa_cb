package assignments;

import java.util.*;

public class Hollow_diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();  // always an odd number
		int space = -1; // space -1 isliya bcoz 2 sa bada ya kaam kar raha hai
		int row = 1;
		int star = n / 2 + 1;  //is question ko vasa kiya hai jasa half half ma extra print ho jata hai toh ek kam karna ka liya k=2 kar deta hai
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(row == 1 || row == n) {
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			if (row <= n / 2) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			row++;
		}
	}

}
