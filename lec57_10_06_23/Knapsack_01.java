package lec57_10_06_23;

import java.util.Arrays;

public class Knapsack_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = {1,4,2,3,6};
		int[] val = {1,1,7,9,1};
		int cap = 8;
		int[][] dp = new int[cap +1][wt.length+1];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		int ans = KnapsackTD(wt,val,cap,0,dp);
		System.out.println(ans);
	}
	public static int KnapsackTD(int[] wt,int[] val,int cap,int i,int[][] dp) { 
		if(cap == 0 || i == wt.length) {
			return 0;
		}
		if(dp[cap][i] != -1) {
			return dp[cap][i];
		}
		int inc = 0;
		int exe = 0;
		if(cap>=wt[i]) {
			inc = val[i] + KnapsackTD(wt,val,cap-wt[i],i+1,dp);
		}
		exe = KnapsackTD(wt,val,cap,i+1,dp);		
		return dp[cap][i] =  Math.max(inc, exe);
	}

}
