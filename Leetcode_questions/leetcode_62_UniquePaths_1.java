package Leetcode_questions;

import java.util.*;

public class leetcode_62_UniquePaths_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 7;
		int[][] dp = new int[m][n];
		for(int[] a : dp){
			Arrays.fill(a,-1);
		}
		System.out.println(Paths(m,n,0,0,dp));
	}
	public static int Paths(int m,int n,int row,int col,int[][] dp){
        int ans = 0;
        if(row == m || col == n){
            return 0;
        }
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        int right = Paths(m,n,row,col+1,dp);
        int down = Paths(m,n,row+1,col,dp);
        ans = right + down;
		dp[row][col] = ans;
		return ans;

    }
}
