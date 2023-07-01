package lec56_04_06_23;

import java.util.Arrays;

public class leetcode_198_house_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,9,3,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(RobberTD(arr,arr.length-1,dp));
	}
//	public static int RobberTD(int[] arr,int i,int[] dp) {
//		if(i<0) {
//			return 0;
//		}
//		int rob = arr[i] + RobberTD(arr,i-1);
//		int dontrob = RobberTD(arr,i-1);
//		return Math.max(rob, dontrob);
//	}
	public static int RobberTD(int[] arr,int i,int[] dp) {
		if(i<0) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD(arr,i-1,dp);
		int dontrob = RobberTD(arr,i-1,dp);
		return dp[i] =  Math.max(rob, dontrob);
	}
//	public static int RobberBU(int[] arr) {
//		int[] dp = new int[arr.length];
//		dp[0] = arr[0];
//		dp[1] = Math.max(arr[1],arr[0]);
//		for(int i=2;i<dp.length;i++) {
//			int rob = arr[i] + dp[i-2];
//			int dontrob = dp[i-1];
//			dp[i] = Math.max(rob,dontrob);
//		}
//		return dp[dp.length-1];
//		
//	}
//	public static int RobberBU(int[] arr) {
//		int[] dp = new int[arr.length];
//		dp[0] = arr[0];
//		dp[1] = Math.max(arr[1],arr[0]);
//		for(int i=2;i<dp.length;i++) {
//			int rob = arr[i] + dp[i-2];
//			int dontrob = dp[i-1];
//			dp[i] = Math.max(rob,dontrob);
//		}
//		return dp[dp.length-1];
//		
//	}

}
