package assignments;

import java.util.*;

public class Inverse_ofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Inverse_Array(arr,n);
	}
	public static void Inverse_Array(int[] arr,int n) {
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			result[arr[i]] = i;
		}
		for(int i=0;i<n;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
