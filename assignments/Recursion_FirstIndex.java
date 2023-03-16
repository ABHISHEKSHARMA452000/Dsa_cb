package assignments;

import java.util.Scanner;

public class Recursion_FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(FirstIndex(arr,m,0));
	}
	public static int FirstIndex(int[] arr,int item,int idx) {
		if(idx == arr.length) {
			return -1;
		}
		if(arr[idx] == item) {
			return idx;
		}
		return FirstIndex(arr,item,idx+1);
		
	}

}
