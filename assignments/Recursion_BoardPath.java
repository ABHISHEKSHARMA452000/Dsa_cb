package assignments;

import java.util.Scanner;

public class Recursion_BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = BoardPath(n,m,0,"");
		System.out.println("\n" + count);
	}

	public static int BoardPath(int len,int faces,int sum,String ans) {
		if(sum > len) {
			return 0;
		}
		if(sum == len) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		for(int i=1;i<=faces;i++) {
			int a = BoardPath(len,faces,sum + i,ans + i);
			count += a;
		}
		return count;
	}
}
