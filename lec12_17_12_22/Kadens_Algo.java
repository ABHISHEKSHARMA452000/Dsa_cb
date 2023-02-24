package lec12_17_12_22;
//max sum of subarray in o(n) ma
public class Kadens_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] arr = {2,5,-9,11,-2,7};
		System.out.println(MaximumSum(arr));
	}
	public static int MaximumSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
