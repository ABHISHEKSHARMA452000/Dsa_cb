package assignments;

import java.util.Scanner;

public class Cal_theSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long totsum = 0;
		int z = 1000000000 + 7;
		int[] cycarr = new int[n];
		for(int i=0;i<cycarr.length;i++) {
			cycarr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int x = sc.nextInt();
			totsum = totsum %z + sum(cycarr,x)%z;
		}
		System.out.println(totsum);
		
	}
	public static long sum(int[] A,int x) {
		int sum1 =0;
		for(int j=1;j<A.length;j++) {
			int z = (A.length -x + j) % A.length;
			A[j] = A[j] + A[z];
		}
		for(int j=0;j<A.length;j++) {
			sum1 += A[j];
		}
		
		return sum1;
	}

}
