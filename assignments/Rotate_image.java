package assignments;

import java.util.Scanner;

public class Rotate_image {

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
		Reversecol(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public static void Transpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	public static void Reversecol(int[][] arr) {
		for(int col=0;col<arr[0].length;col++) {
			int left = 0;
			int right = arr.length-1;
			while(left<right) {
				int temp = arr[left][col];
				arr[left][col] = arr[right][col];
				arr[right][col] = temp;
				left++;
				right--;
			}
		}
	}
}
