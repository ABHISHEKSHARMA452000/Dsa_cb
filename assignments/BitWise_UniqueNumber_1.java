package assignments;

import java.util.Scanner;

public class BitWise_UniqueNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = UniqueNumber(arr);
		System.out.println(ans);
	}
	public static int UniqueNumber(int[] arr) {
		int ans = 0;
		for(int i =0;i<arr.length;i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

}
