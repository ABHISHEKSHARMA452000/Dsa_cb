package lec15_25_12_22;

import java.util.Iterator;

public class Transpose_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},
		           {5,6,7,8},
		           {9,10,11,12},
		           {13,14,15,16}
		           };
		//array before
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println();
		Transpose(arr);
		//array after
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	public static void Transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

}
