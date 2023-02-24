package assignments;

import java.util.Scanner;

public class Array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = Reverse(arr);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] Reverse(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

}
