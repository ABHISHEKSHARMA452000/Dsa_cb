package assignments;

import java.util.*;

public class Square_ofSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Square(arr);
		
	}
	public static void Square(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int sq = arr[i]*arr[i];
			arr[i] = sq;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
