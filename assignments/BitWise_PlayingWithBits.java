package assignments;

import java.util.Scanner;

public class BitWise_PlayingWithBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			for(int i=a;i<=b;i++) {
				ans += SetBits(i);
			}
			System.out.println(ans);
			t--;
		}
	}
	public static int SetBits(int n) {
		int count = 0;
		while(n>0) {
			n = (n & (n-1));
			count++;
		}
		return count;
	}

}
