package lec56_04_06_23;

import java.util.*;

public class leetcode_198_house_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);// isliya bcoz 0 constraint hai ki house ma money 0 bhi ho sakta hai so dp laga
							// na kiya kiya -1 fill kar diya
		// System.out.println(RobberTD1(arr,arr.length-1,dp));
		// System.out.println(RobberTD2(arr, arr.length - 1, dp));
	}

//  Ya wala tle da gaya hai without dp	
	public static int RobberTD(int[] arr, int i) {
		if (i < 0) {
			return 0;
		}
		int rob = arr[i] + RobberTD(arr, i - 2);
		int dontrob = RobberTD(arr, i - 1);
		return Math.max(rob, dontrob);
	}

//ya recursion use kar ka hai isma dp table hai vo aaga sa fill ho rahi hai hai 
//sabse important ya hai ki dp table ka index ka kya fill kar raha hai and kasa fill kar raha hai aaga sa ya piche sa
//isma hum dp table  aaga sa fill kar raha hai
//each index value ya bata rahi hai ki aus index ko lakar and auss piche ka saath kitna max rob kar sakta hai
	public static int RobberTD1(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD1(arr, i - 2, dp);
		int dontrob = RobberTD1(arr, i - 1, dp);
		return dp[i] = Math.max(rob, dontrob);
	}

//isma humna dp table piche sa fill kari hai jisma har elemnt ya bata rahia hai ki mere ko milakar mere sa aaga jo ghar hai untak kamax rob kya ho sakta hai	
	public static int RobberTD2(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = RobberTD2(arr, i + 2, dp);
		int dontrob = RobberTD2(arr, i + 1, dp);
		dp[i] = Math.max(rob, dontrob);
		return Math.max(rob, dontrob);
	}

//Bottom upsa isma humko aaga ki dp table fill karna ka liya piche ka value pata honi chahiya	
	public static int RobberBU(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[1], arr[0]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int dontrob = dp[i - 1];
			dp[i] = Math.max(rob, dontrob);
		}
		return dp[dp.length - 1];

	}

}
