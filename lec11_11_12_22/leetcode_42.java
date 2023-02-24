package lec11_11_12_22;

public class leetcode_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.print(RainWater(arr));
		
	}
	public static int RainWater(int[] arr) {
		int [] left = new int[arr.length];
		left[0] = arr[0];
		for(int i=1;i<left.length;i++) {
			left[i] = Math.max(left[i-1],arr[i]);
		}
		int [] right =  new int[arr.length];
		int n = arr.length;
		right[n-1] = arr[n-1];
		for(int i= n-2;i>=0;i--) {
			right[i] = Math.max(right[i+1],arr[i]);
		}
		int sum = 0;
		for(int i=0;i<right.length;i++) {
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		return sum;
	}

}
