package lec60_24_06_23;

//fixed size window ka problem

public class Maximum_SubSum_window_Size_K {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,7,5,11,3,2,1};
		int k=3;
		maxSum(arr,k);
	}
	public static int maxSum(int[] arr,int k) {
		int sum = 0;
		for(int i = 0;i<k;i++) {
			sum+= arr[i];
		}
		int ans = sum;
		for(int  i=k;i<arr.length;i++) {
			sum =sum + arr[i] - arr[i-k];
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
