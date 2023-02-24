package assignments;

import java.util.Scanner;

public class Upper_TriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
 		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
 		Upper_Triangle(arr);
	}
	public static void Upper_Triangle(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i<=j) {
					System.out.print(arr[i][j] + " ");
				}else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

}
