package assignments;

import java.util.Scanner;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int tar = sc.nextInt();
		int ans = Search(arr,tar);
		System.out.println(ans);
	}

	public static int Search(int[][] arr,int tar) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if(tar == arr[row][col]) {
				return 1;
			}
			else if(arr[row][col] < tar) {
				row++;
			}
			else if(arr[row][col] > tar) {
				col--;
			}
		}
		return 0;
	}
}
