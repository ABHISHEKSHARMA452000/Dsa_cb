package assignments;

import java.util.Scanner;

public class Arrays_SprialPrintClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // no. of rows
		int n = sc.nextInt(); // no. of column
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Print_Spiral(arr);
	}

	public static void Print_Spiral(int[][] arr) {
		int rmin = 0;
		int cmin = 0;
		int rmax = arr.length - 1;
		int cmax = arr[0].length - 1;
		int te = arr.length*arr[0].length;
		int count = 0;
		while(count < te) {
			for (int i = cmin; i <= cmax && count<te; i++) {
				System.out.print(arr[rmin][i] + ", ");
				count++;
			}
			rmin++;
			for (int i = rmin; i <= rmax && count<te; i++) {
				System.out.print(arr[i][cmax] + ", ");
				count++;
			}
			cmax--;
			for (int i = cmax; i >= cmin && count<te; i--) {
				System.out.print(arr[rmax][i] + ", ");
				count++;
			}
			rmax--;
			for (int i = rmax; i >= rmin && count<te; i--) {
				System.out.print(arr[i][cmin] + ", ");
				count++;
			}
			cmin++;
		}
		System.out.println("END");
	}
	
}
