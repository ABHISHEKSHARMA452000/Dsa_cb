package lec9_3_12_22;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int arr[] = new int[n];
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);
	}
	public static void Display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
