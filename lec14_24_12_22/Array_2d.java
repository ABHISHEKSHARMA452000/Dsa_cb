package lec14_24_12_22;

import java.util.Scanner;

public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no. of rows
		int m = sc.nextInt(); // no. of column
		int [][] arr = new int [n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Display(arr);
	}
	public static void Display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

//4 5 
//1 2 3 4 5
//6 7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20
