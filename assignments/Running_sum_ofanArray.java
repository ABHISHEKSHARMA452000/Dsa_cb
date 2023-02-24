package assignments;

import java.util.*;

public class Running_sum_ofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Running_sum(arr,n);
	}
	public static void Running_sum(int[] arr,int n) {
		int[] sum = new int[n];
		sum[0] = arr[0];
		for(int i=1;i<n;i++) {
			sum[i] = sum[i-1] + arr[i]; //why not work sum[i] += arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(sum[i] + " ");
		}
	}

}
