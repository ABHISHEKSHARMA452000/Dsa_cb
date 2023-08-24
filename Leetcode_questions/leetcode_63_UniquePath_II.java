package Leetcode_questions;

import java.util.*;

public class leetcode_63_UniquePath_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};
		int[][] dp = new int[arr.length][arr[0].length];
		for(int[] a : dp){
			Arrays.fill(a,-1);
		}
		System.out.println(uniquePaths(arr,0,0,dp));
	}

	public static int uniquePaths(int[][] arr,int row,int col,int[][] dp) {
		int ans = 0;
		if(row == arr.length || col == arr[0].length || arr[row][col] == 1) {
			return 0;
		}
		if(row == arr.length-1 && col == arr[0].length - 1) {
			return 1;
		}
		if(dp[row][col] != -1){
			return dp[row][col];
		}

		int right = uniquePaths(arr,row,col+1,dp);
		int down = uniquePaths(arr,row+1,col,dp);
		ans = right + down;
		dp[row][col] = ans;
		return ans;
	}

}
