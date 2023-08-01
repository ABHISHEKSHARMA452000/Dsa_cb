package lec56_04_06_23;

public class leetcode_1035_UncrossedLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int UncrossedLines(int[] arr1,int[] arr2) {
		int[][] dp = new int[arr1.length+1][arr2.length+1];
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(arr1[i-1] == arr2[j-1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}else {
					int f = dp[i-1][j];
					int s = dp[i][j-1];
					dp[i][j] = Math.max(f, s);
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
		
	}

}
