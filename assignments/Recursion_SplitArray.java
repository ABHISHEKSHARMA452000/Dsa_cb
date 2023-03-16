package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class Recursion_SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = SplitArray(arr, 0, 0, "", 0, "");
		System.out.println(ans);
	}

	public static int SplitArray(int[] arr, int idx, int sum1, String ans1, int sum2, String ans2) {
		if(idx == arr.length) {
			if(sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);
				return 1;
			}
			return 0;
		}
		int a1 = SplitArray(arr, idx+1, sum1 + arr[idx], ans1 + arr[idx] + " ", sum2, ans2);
		int a2 = SplitArray(arr, idx+1, sum1, ans1, sum2 + arr[idx], ans2 + arr[idx] + " ");
		return a1 + a2;
	}

}
