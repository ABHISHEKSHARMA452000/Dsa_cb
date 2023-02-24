package assignments;

import java.util.Scanner;

public class Vn_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int bn = sc.nextInt();
			int dn = 0;
			int mul = 1;
			while(bn >0) {
				int rem = bn%10;
				dn = dn + rem*mul;
				mul = mul*2;
				bn = bn/10;
			}
			System.out.println(dn);
		}
	}

}
