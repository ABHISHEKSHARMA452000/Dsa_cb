package assignments;

import java.util.Scanner;

public class Incredible_Hulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			Jumpes(n);
			t--;
		}
	}
	public static void Jumpes(int n) {
		int count = 0;
		while(n>0) {
			if((n&1) != 0) {
				count++;
			}
			n = n>>1;
		}
		System.out.println(count);
	}

}
