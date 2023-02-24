package assignments;

import java.util.Scanner;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			long n =sc.nextLong();
			long k = sc.nextLong();
			kth_Root(n,k);
		}
		
	}
	public static void kth_Root(long n,long k) {
		long lo = 0; 
		long hi = n;
		long ans = 0;
		while(lo<=hi) {
			long mid = lo+(hi - lo)/2;
			if((long)Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid+1;
			}else {
				hi = mid -1;
			}
		}
		System.out.println(ans);
	}

}
