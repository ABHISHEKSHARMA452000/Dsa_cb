package Leetcode_questions;

import java.util.Arrays;

public class leetcode_746_MinCostClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,100,1,1,1,100,1,1,100,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		int ans = Helper(arr,dp);
		System.out.println(ans);
	}
	public static int Helper(int[] arr,int[] dp) {
//		for (int i = 0; i < dp.length; i++) {
//			System.err.print(dp[i] + " ");
//		}
//		System.out.println();
		int zerostart = mincostTD(arr,0,dp);
		Arrays.fill(dp, -1);
//		for (int i = 0; i < dp.length; i++) {
//			System.err.print(dp[i] + " ");
//		}
//		System.out.println();
		int firststart = mincostTD(arr,1,dp);
		return Math.min(zerostart, firststart);
	}
	public static int mincostTD(int[] arr,int i,int[] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int first = mincostTD(arr,i+1,dp);
		int second = mincostTD(arr,i+2,dp);
		dp[i] = Math.min(first, second) + arr[i];
		return dp[i];
		//recursion wala jitni choice utni calls ans tree bana lo and baki recusrion dehk lega
		//isma last sa dp table fill honi start hui hai
	}
	public int mincostBU(int[] arr){
		int[] dp = new int[arr.length];
		int n = arr.length;
		dp[0] = arr[0];
		dp[1] = arr[1];
		for(int i=2;i<arr.length;i++){
			int first = dp[i-1];
			int second = dp[i-2];
			dp[i] = Math.min(first,second) + arr[i];
		}
		return Math.min(dp[n-1],dp[n-2]);
	}

}
