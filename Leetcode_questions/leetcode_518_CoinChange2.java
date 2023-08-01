package Leetcode_questions;

public class leetcode_518_CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int CoinChangeBU(int[] coins,int amount) {
		int[][] dp = new int[amount+1][coins.length+1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;//base case if(amount == 0) return 1;
		}
		//if amount bach gayi and coins end toh dp[i][0] = 0; i from 0 to dp.length base case if(idx>coins.length) return 0;
		for(int amt = 1;amt<dp.length;amt++) {
			for(int i = 1;i<dp[0].length;i++) {
				int inc = 0;
				int exe = 0;
				if(amt >= coins[i-1]) {
					inc+=dp[amt-coins[i-1]][i];
				}
				exe += dp[amt][i-1];
				
				dp[amt][i] = inc+exe;
			}
		}
		return dp[amount][coins.length];
	}

}
