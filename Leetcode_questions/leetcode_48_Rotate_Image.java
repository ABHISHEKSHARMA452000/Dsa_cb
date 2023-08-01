package Leetcode_questions;

public class leetcode_48_Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(arr);
		Transpose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rotate(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			int left = 0;
			int right = arr.length-1;
			while (left < right) {
				int temp = arr[left][col];
				arr[left][col] = arr[right][col];
				arr[right][col] = temp;
				left++;
				right--;
			}
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

}
