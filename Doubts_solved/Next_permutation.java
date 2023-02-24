package Doubts_solved;

import java.util.*;

public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			Permutation(arr);
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}	
	}
	public static void Permutation(int[] arr) {
		int p=0;
		int q=0;
		int n = arr.length;
		for(int i=n-2;i>=0;i--) {
			if(arr[i] < arr[i+1]) {
				p=i;
				break;
			}
		}
		for(int i=n-1;i>p;i--) {
			if(arr[p]<arr[i]) {
				q=i;
				break;
			}
		}
		if(p == 0 && q == 0) {
			ReverseArray(arr,0,n-1);
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
		ReverseArray(arr,p+1,n-1);
		
	}
	public static void ReverseArray(int[] arr,int i,int j) { //array ma change kar diya toh no need to return type arr void sa bhi kam chal jaya ga
		int left = i;
		int right = j;
		while(left < right) { // array ki index ma hi change kar diya hai 
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}









