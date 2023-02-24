package assignments;

import java.util.Scanner;
 
//dnf use karni hai not with this sort method

public class Sorting_InLinearTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
		
	}

	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int item = arr[i];
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
