package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Single_inEngneeringCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		long x = sc.nextLong();
		Arrays.sort(arr);
		long ans = Cut(arr,x);
		System.out.println(ans);
	}

	public static long Cut(long[] arr,long x) {
		long ans = 0;
		long lo = 0;
		long hi = arr[arr.length - 1];
		long mid = lo + (hi - lo) / 2;
		while (lo <= hi) {
			if (isitpossible(arr,mid,x) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		return ans;
	}
	public static boolean isitpossible(long[]arr,long mid,long x) {
		return true;
	}

}
