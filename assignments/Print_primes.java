package assignments;

import java.util.*;

public class Print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			primenumber(i);
		}	
	}
	public static void primenumber(int n) {
		int fact = 0;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				fact++;
			}
		}
		if(fact == 0) {
			System.out.println(n);
		}
	}

}
