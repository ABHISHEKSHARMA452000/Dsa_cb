package lec57_10_06_23;

import java.util.Arrays;
//similar to lcs hi toh hai ya
public class leetcode_72_Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s1 = "FOOD";
		String s2 = "MONEY";
//		int[][] dp = new int[s1.length()][s2.length()];
//		for(int[] a:dp) {
//			Arrays.fill(a, -1);
//		}
//		System.out.println(MinoperationTD(s1,s2,0,0,dp));
		System.out.println(MinoperationBU(s1, s2));
	}
	public static int MinoperationTD(String s1,String s2,int i,int j,int[][] dp) {
		if(i == s1.length()) {
			return s2.length() - j;
		}
		if(j == s2.length()) {
			return s1.length() - i;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if(s1.charAt(i) == s2.charAt(j)) {
			ans = MinoperationTD(s1,s2,i+1,j+1,dp);
		}else {
			int del = MinoperationTD(s1,s2,i+1,j,dp);
			int insert = MinoperationTD(s1,s2,i,j+1,dp);
			int replace = MinoperationTD(s1,s2,i+1,j+1,dp);
			ans = Math.min(del, Math.min(insert, replace)) + 1;
		}
		dp[i][j] = ans;
		return ans;
	}
	public static int MinoperationBU(String s1,String s2) {
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i=1;i<dp[0].length;i++) {
			dp[0][i] = i;
		}
		for(int i=0;i<dp.length;i++) {
			dp[i][0] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					ans = dp[i-1][j-1];
				}else {
					int del = dp[i-1][j];
					int insert = dp[i][j-1];
					int replace = dp[i-1][j-1];
					ans = Math.min(del, Math.min(insert, replace)) + 1;
				}
				dp[i][j] = ans;
			}
		}
		return dp[s1.length()][s2.length()];
	}
	

}
