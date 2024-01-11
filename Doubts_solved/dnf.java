package Doubts_solved;

import java.util.Scanner;

public class dnf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sort(int[] arr) {
		int i=0;
		int l=0; //sort 0 ke liya;//l ya bata raha hai ki next 0 konsi index par rakhna hai 
		int r = arr.length-1; // sort 2 ke liya//r ya bata raha hai ki next 2 konsi index par rakhna hai 
		while(i<=r) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[l];
				arr[l] = temp;
				i++;
				l++;
			}
			else if(arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[r];
				arr[r] = temp;
				r--;
			}else {
				i++;
			}
		}
		
	}

}

//6
//0 1 2 0 1 2
//8
//1 0 2 1 0 0 2 1
