package assignments;

import java.util.Scanner;

public class Recursion_TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = Toh(n, "T1", "T2", "T3");
		System.out.println(ans);
	}

	public static int  Toh(int n,String sr,String dest ,String aux) {
		if(n == 0) {
			return 0;
		}
		int a1 = Toh(n-1,sr,aux,dest);
		System.out.println("Move " + n + "th disc from " + sr + " to " + dest); //Move 1th disc from T1 to T3
		int a2 = Toh(n-1,aux,dest,sr);
		return a1 + a2 + 1;
	}

}
