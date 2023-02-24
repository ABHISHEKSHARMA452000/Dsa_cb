package lec12_17_12_22;
//max sum of subarray o(n^2) and next kadens algo o(n)
public class Leetcode_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int ans =Subarray(arr);
		System.out.println(ans);
	}
	public static int Subarray(int[] arr) {
		
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum += arr[j];
				ans = Math.max(ans,sum);
			}
		}
		return ans;
	}

}
