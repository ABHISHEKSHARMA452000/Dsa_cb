package Doubts_solved;

import java.util.Scanner;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Transpose(arr);
		Reversecol(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
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
	}
	public static void Reversecol(int[][]arr) {
		for(int c=0;c<arr[0].length;c++) {
			int i=0;
			int j=arr.length-1;
			while(i<j) {
				int temp = arr[i][c];
				arr[i][c] = arr[j][c];
				arr[j][c] = temp;
				i++;
				j--;
			}
		}
	}

}
