package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class Boolean_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] bool = new int[m][n];
		for (int i = 0; i < bool.length; i++) {
			for (int j = 0; j < bool[0].length; j++) {
				bool[i][j] = sc.nextInt();
			}
		}
		Update_Matrix(bool, m, n);
	}

	public static void Update_Matrix(int[][] arr, int m, int n) {
		int[][] result = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1) {
					for (int k = 0; k < result[0].length; k++) {
						result[i][k] = 1;
					}
					for (int l = 0; l < result.length; l++) {
						result[l][j] = 1;
					}
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
