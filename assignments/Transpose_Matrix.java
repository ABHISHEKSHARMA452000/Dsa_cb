package assignments;

import java.util.*;

public class Transpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Transpose(arr);
	}

	public static void Transpose(int[][] arr) {
		int row = 0;
		while (row < arr.length) {
			int i = row;
			int j = 0;
			while(i > j) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				
				j++;
			}
			row++;
		}
		for (int a = 0; a < arr.length; a++) {
			for (int k = 0; k < arr[0].length; k++) {
				System.out.print(arr[a][k] + " ");
			}
			System.out.println();
		}
	}
}
