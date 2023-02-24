package assignments;

import java.util.*;

public class Arrays_TargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Target_SumPairs(arr,n,target);
	}
	public static void Target_SumPairs(int[] arr,int n,int target) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] + arr[j] == target) {
					if(arr[i] > arr[j]) {
						System.out.println(arr[j] + " and " + arr[i]);
					}else {
						System.out.println(arr[i] + " and " + arr[j]);
					}
				}
			}
		}
	}

}
