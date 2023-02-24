package assignments;

import java.util.Scanner;

public class Product_of_array_ExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextLong();
		}
		Product_ExceptSelf(arr,n);
	}
	public static void Product_ExceptSelf(long[] arr,int n) {
		long[] leftProd = new long[arr.length];
		leftProd[0] = 1;
		for(int i=1;i<leftProd.length;i++) {
			leftProd[i] = leftProd[i-1]*arr[i-1];
		}
		long[] rightProd = new long[arr.length];
		rightProd[n-1] = 1;
		for(int i=n-2;i>=0;i--) {
			rightProd[i] = rightProd[i+1]*arr[i+1];
		}
		long[] result = new long[n];
		for(int i=0;i<n;i++) {
			result[i] = leftProd[i]*rightProd[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
