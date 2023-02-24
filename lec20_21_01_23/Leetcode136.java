package lec20_21_01_23;

public class Leetcode136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,2,7,5,7};
		System.out.println(Unique_number(arr));
	}
	public static int Unique_number(int[] arr) {
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}
}
