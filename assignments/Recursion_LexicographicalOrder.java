package assignments;

import java.util.Scanner;

public class Recursion_LexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Orders(0,n);
	}
	public static void Orders(int curr,int end) {
		if(curr > end) {
			return;
		}
		System.out.print(curr + " ");
		int i=0;
		if(curr == 0) {
			i=1;
		}
		for(;i<=9;i++) {
			Orders(curr*10 + i,end);
		}
	}

}
