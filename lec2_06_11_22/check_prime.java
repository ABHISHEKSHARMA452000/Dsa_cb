package lec2_06_11_22;

import java.util.*;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		int fact = 0;
		while(i<n) {
			if(n%i == 0) {
				fact++;
				break;
			}
			i++;
		}
		if(fact == 1) {
			System.out.println("Not prime");
		}else {
			System.out.println("Prime");
		}
	}

}
