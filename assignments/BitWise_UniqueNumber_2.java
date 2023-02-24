package assignments;

import java.util.Scanner;

public class BitWise_UniqueNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		UniqueNumber(arr);
	}

	public static void UniqueNumber(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if((mask & arr[i]) != 0) {
				a = a^arr[i];
			}	
		}
		int b = ans^a;
		System.out.println(a + " " + b);
	}

}
