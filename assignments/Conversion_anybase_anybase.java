package assignments;

import java.util.Scanner;

public class Conversion_anybase_anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int sn = sc.nextInt();
		//sb to decimal;
		int decimal = 0;
		int mul = 1;
		while(sn > 0) {
			int rem = sn%10;
			decimal = decimal + rem*mul;
			mul = mul*sb;
			sn = sn/10;
		}
		mul = 1;
		int ans = 0;
		while(decimal > 0) {
			int rem = decimal%db;
			ans = ans + rem*mul;
			mul = mul*10;
			decimal = decimal/db;
		}
		System.out.println(ans);
	}

}
