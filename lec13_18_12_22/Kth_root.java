package lec13_18_12_22;

import java.util.Scanner;

public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(Kthroot(N,k));
	}
	public static int Kthroot(int n,int k) {
		int lo=1;
		int hi = n;
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid+1;
			}else {
				hi = mid-1;
			}
		}
		return ans;
	}

}
