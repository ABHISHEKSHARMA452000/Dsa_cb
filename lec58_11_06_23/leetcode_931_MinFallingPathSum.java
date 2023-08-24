package lec58_11_06_23;

import java.util.Arrays;

public class leetcode_931_MinFallingPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
		int[][] dp = new int[grid.length][grid[0].length];
		for(int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<grid[0].length;i++) {
			ans = Math.min(ans, minsum(grid,0,i,dp));
		}
		System.out.println(ans);
	}
	public static int minsum(int[][] grid,int i,int j,int[][] dp) {
		if(j<0 || j>= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if(i==grid.length-1) {
			return grid[i][j];
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int leftd = minsum(grid,i+1,j-1,dp);
		int down  = minsum(grid,i+1,j,dp);
		int rightd = minsum(grid,i+1,j+1,dp);
		
		return dp[i][j] = grid[i][j] + Math.min(down, Math.min(leftd, rightd));
		
	}

}
