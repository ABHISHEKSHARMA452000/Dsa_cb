package assignments;

import java.util.Scanner;

public class Arrays_linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(Linear_search(arr,m));
	}
	public static int Linear_search(int[] arr,int m) {
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[index] == m) {
				return index;
			}
			index++;
		}
		
		
		return -1;
	}

}
