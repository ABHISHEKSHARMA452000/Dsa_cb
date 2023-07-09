package Leetcode_questions;

public class leetcode_713_Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,2,3};
		int k = 10;
		int ans =SubArrayProduct(arr,k);
		System.out.println(ans);
	}

	public static int SubArrayProduct(int[] arr,int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while(ei<arr.length) {
			//growing
			p = p*arr[ei];
			//shrinking
			while(p>= k && si<=ei) {//ya si<=ei for the case [1,2,3] k=0;
				p = p/arr[si];
				si++;
			}
			//ans
			ans += (ei - si + 1);
			ei++;
		}
		return ans;
	}
}
