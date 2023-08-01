package lec57_10_06_23;

import java.util.*;

public class leetcode__518_CoinChange_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5};
		int amount = 5;
		int[][] dp = new int[coins.length +1][amount+1];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(CoinChange(coins,amount,0,dp));
	}
	
	public static int CoinChange(int[] arr,int amt,int idx,int[][] dp) {
		if(amt == 0) {
			return 1;
		}
		if(idx >= arr.length) {
			return 0;
		}
		if(dp[idx][amt] != -1) {
			return dp[idx][amt];
		}
		int inc = 0;//inclusion of the coin
		int exe = 0;//exclusion of the coin
		
		if(amt >= arr[idx]) {
			inc += CoinChange(arr,amt-arr[idx],idx,dp);
		}
		exe += CoinChange(arr,amt,idx+1,dp);
		
		return dp[idx][amt] = inc + exe;
	}
	public static int CoinChangeBU(int[] coin, int amount) {
		int[][] dp = new int[coin.length+1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0;
				int exc = 0;

				if (am >= coin[i - 1]) {
					inc += dp[i][am - coin[i - 1]];
				}

				exc += dp[i - 1][am];
				dp[i][am] = inc + exc;

			}
		}
		return dp[dp.length - 1][dp[0].length-1];
	}
}


/*
 * if aap ko recurion sa dp aati hai toh BU sa just conversion karna hai recusrive ka BU ma
 * aaga sa solve karta time 
 * recusion ma dp table piche sa fill honi start hoti hai jabki BU ma base case phele the aaga sa dp table fill ho rahi hai
 *jitna parameter vari kar raha hai utni hi size ki dp table banti hai
 *
*/