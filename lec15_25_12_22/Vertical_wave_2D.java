package lec15_25_12_22;

import java.util.Scanner;

public class Vertical_wave_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr= {{1,2,3,4,5},
				  {6,7,8,9,10},
				  {11,12,13,14,15},
				  {16,17,18,19,20}
				  };
//		int[][] arr = {{1,2,3,4},
//				       {5,6,7,8},
//				       {9,10,11,12}
//		
//		};
//		int n = sc.nextInt(); // no. of rows
//		int m = sc.nextInt(); // no. of column
//		int [][] arr = new int [n][m];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		Vertical_wave(arr);
	}
	public static void Vertical_wave(int[][] arr) {
		for(int col=0;col<arr[0].length;col++) {
			if(col %2 == 0) {
				for(int row = 0;row<arr.length;row++) {
					System.out.print(arr[row][col] + " ");
				}
			}else {
				for(int row = arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}

}
