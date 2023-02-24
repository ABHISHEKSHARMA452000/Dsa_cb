package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Target_sumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int target = sc.nextInt();
		Target_SumPairs(arr, n, target);
	}

	public static void Target_SumPairs(int[] arr, int n, int target) {
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						//int f, s, t = largestofthree(arr[i], arr[j], arr[k]);
						if(arr[i] > arr[j] && arr[i] > arr[k]) {
							if(arr[j] > arr[k]) {
								System.out.println(arr[k] + ", " + arr[j] + " and " + arr[i]);
							}else {
								System.out.println(arr[j] + ", " + arr[k] + " and " + arr[i]);
							}
						}else if(arr[j] > arr[k]){
							if(arr[i] > arr[k]) {
								System.out.println(arr[k] + ", " + arr[i] + " and " + arr[j]);
							}else {	
								System.out.println(arr[i] + ", " + arr[k] + " and " + arr[j]);
							}
						}else {
							if(arr[i] > arr[j]) {
								System.out.println(arr[j] + ", " + arr[i] + " and " + arr[k]);
							}else {	
								System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
							}
						}
					}
				}
//				if(arr[i] + arr[j] == target) {
////					if(arr[i] > arr[j]) {
////						System.out.println(arr[j] + " and " + arr[i]);
////					}else {
////						System.out.println(arr[i] + " and " + arr[j]);
////					}
//				}
			}
		}
	}

//	public static int largestofthree(int i, int j, int k) {
//		if (i > j && i > k) {
//			if(j>k) {
//				return i,j,k;
//			}else {
//				return i,k,j;
//			}
//		}
//		return 0;
//	}

}
