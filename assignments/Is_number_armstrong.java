package assignments;

import java.util.*;

public class Is_number_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean flag = Isarmstrong(n);
		System.out.println(flag);
		
	}
	public static int Countofdigit(int n) {
		int c=0;
		while(n>0) {
			n=n/10;
			c++;
		}
		return c;
	}
	public static boolean Isarmstrong(int n) {
		int c  = Countofdigit(n);
		int temp = n;
		int sum = 0;
		while(temp>0) {
			int rem = temp%10;
			sum = sum + (int)Math.pow(rem, c);
			temp = temp/10;
		}
		return sum == n;
		
	}

}
