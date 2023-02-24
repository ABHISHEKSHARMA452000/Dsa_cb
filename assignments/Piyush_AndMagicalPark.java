package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class Piyush_AndMagicalPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		
		Escapes(arr,k,s);
	}
	public static void Escapes(char[][] arr,int k,int s) {
		for (int row = 0; row < arr.length;) {
			for (int col = 0; col < arr[0].length; col++) {
				if(arr[row][col] == '#') {
					if(row == arr.length-1) {
						row++;
						break;
					}else {
						row++;
						break;
					}
				}
				if(arr[row][col] == '.') {
					if(col == arr[0].length-1) {
						s = s-2;
						row++;
					}else {
						s = s-3;
					}
				}
				if(arr[row][col] == '*') {
					if(col == arr[0].length-1) {
						s = s+5;
						row++;
					}else {
						s = s+4;
					}
				}
			}
		}
		if(s>= k) {
			System.out.println("Yes");
			System.out.println(s);
		}else if(s<k){
			System.out.println("No");
		}
	}

}
