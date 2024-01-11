package lec14_24_12_22;

import java.util.Scanner;

public class DiagonalPrint {

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
		String d1 = "";
		String d2 = "";
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i == j) {
					d1 = d1 + arr[i][j] + " ";
				}
				if((i+j) == (n-1)) {
					d2 = d2 + arr[i][j] + " ";
				}
			}
		}
		System.out.println(d1);
		System.out.println(d2);
		
	}

}

//Condition for Principal Diagonal: The row-column condition is row = column. i==j
//The secondary diagonal is formed by the elements A03, A12, A21, A30.
//Condition for Secondary Diagonal: The row-column condition is row = numberOfRows – column -1. (i+j) == (n-1)

//A simple java program to find
//sum of diagonals
//import java.io.*;
//
//public class GFG {
//
//	static void printDiagonalSums(int [][]mat,
//										int n)
//	{
//		int principal = 0, secondary = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//	
//				// Condition for principal
//				// diagonal
//				if (i == j)
//					principal += mat[i][j];
//	
//				// Condition for secondary
//				// diagonal
//				if ((i + j) == (n - 1))
//					secondary += mat[i][j];
//			}
//		}
//	
//		System.out.println("Principal Diagonal:"
//									+ principal);
//									
//		System.out.println("Secondary Diagonal:"
//									+ secondary);
//	}
//
//	// Driver code
//	static public void main (String[] args)
//	{
//		
//		int [][]a = { { 1, 2, 3, 4 },
//					{ 5, 6, 7, 8 }, 
//					{ 1, 2, 3, 4 },
//					{ 5, 6, 7, 8 } };
//					
//		printDiagonalSums(a, 4);
//	}
//}

//4 4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16

