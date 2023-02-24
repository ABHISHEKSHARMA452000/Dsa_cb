package lec15_25_12_22;

import java.util.Scanner;

public class Spiral_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); // no. of rows
//		int m = sc.nextInt(); // no. of column
//		int [][] arr = new int [n][m];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		int[][] arr = {{1,2,3,4},
			           {5,6,7,8},
			           {10,11,12,13} };
		Spiral(arr);
	}
	public static void Spiral(int[][] arr) {
		int minc =0;
		int minr = 0;
		int maxc = arr[0].length-1;
		int maxr = arr.length-1;
		int te = arr.length*arr[0].length;
		int count = 0;
		while(count<te) { // bcoze if not square matrix toh print ma rmin rmax cman cmin sa some elemnet kam jaaa print ho sakta hai
			for(int i=minc;i<=maxc && count<te;i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			for(int i=minr;i<=maxr && count<te;i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc && count<te;i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			for(int i=maxr;i>=minr && count<te;i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
		}
		
	}

}
//5 5 
//1 2 3 4 5
//6 7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20
//21 22 23 24 25
