package Doubts_solved;

import java.util.Scanner;

public class MaxCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int ans = MaximumCircularSum(arr);
			System.out.println(ans);
		}
	}

	public static int MaximumCircularSum(int[] arr) {
		int LinearMax = kadens(arr);
		System.out.println(LinearMax);
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			arr[i] *= -1;
		}
		int minSubarrJoSignChangeSaMaxBanGaya = kadens(arr);
		System.out.println(minSubarrJoSignChangeSaMaxBanGaya);
		int CircularMax = sum + minSubarrJoSignChangeSaMaxBanGaya;
		if(CircularMax == 0) {
			return LinearMax;
		}
		int ans = Math.max(LinearMax,CircularMax);
		return ans;
	}

	public static int kadens(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(sum, ans);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
