package assignments;

import java.util.Scanner;

public class String_FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Isnumber(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			t--;
		}
	}

	public static void Isnumber(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static long compare(long a, long b) {
		String n1n2 = "" + a + b;
		String n2n1 = "" + b + a;
		return Long.parseLong(n2n1) - Long.parseLong(n1n2); // to string to long
	}
  
}
