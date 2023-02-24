package assignments;

import java.util.Scanner;

public class BitWise_CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			//SetBits(n);
			optimized(n);
			t--;
		}
	}

	public static void SetBits(int n) {
		int count = 0;
		while(n > 0){
			if((n & 1) != 0) {
				count++;
			}
			n >>= 1;
		}
		System.out.println(count);
	}
	public static void optimized(int n) {
		int count =0;
		while(n>0) {
			n = (n & (n-1));
			count++;
		}
		System.out.println(count);
	}

}
