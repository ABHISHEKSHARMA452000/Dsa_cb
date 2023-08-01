package Leetcode_questions;

import java.util.*;
//exact similar question lcs jasa hai
public class leetcode_712_MinimumASCII_DeleteSumforTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = "delete";
		String s2 = "leet";
		int[][] dp = new int[s1.length()][s2.length()];
		for(int[] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(min_deleteSum(s1, s2, 0, 0,dp));
		
	}
	public static int min_deleteSum(String s1,String s2,int i,int j,int[][] dp) {
		if(i == s1.length()) {
			int val = 0;
			for(int k=j;k<s2.length();k++) {
				val += s2.charAt(k);
			}
			return val;
		}
		if(j == s2.length()) {
			int val = 0;
			for(int k=i;k<s1.length();k++) {
				val += s1.charAt(k);
			}
			return val;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if(s1.charAt(i) == s2.charAt(j)) {
			ans = min_deleteSum(s1,s2,i+1,j+1,dp);
		}else {
			int f = s1.charAt(i) + min_deleteSum(s1,s2,i+1,j,dp);
			int s = s2.charAt(j) + min_deleteSum(s1,s2,i,j+1,dp);
			ans = Math.min(f, s);
		}
		dp[i][j] = ans;
		return dp[i][j];
	}
	
}
