package assignments;

import java.util.Iterator;

public class Max_sumCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,5,-5,1-6,4,-1,7};
		System.out.println(Circular_Sum(arr));
	}
	public static int Circular_Sum(int[] arr) {
		int len_sum = MaximumSum(arr);
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			arr[i] *= -1;
		}
		int mid_sum = MaximumSum(arr);
		int curr = sum + mid_sum;
		if(curr == 0) {
			return len_sum;
		}
		
		return Math.max(curr, len_sum);
		
		
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
