package Leetcode_questions;

import java.util.*;

public class leetcode_74_search_In_2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int tar = scn.nextInt();
		System.out.print(searchMatrix(arr, tar));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		// Write your code here
		int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else if(matrix[row][col] > target){
                col--;
            }
        }
        return false;
	}

}
