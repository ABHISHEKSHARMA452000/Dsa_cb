package lec37_25_03_23;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		Prime_Sieve(n);
		
	}

	public static void Prime_Sieve(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// prime number nhi hai
		prime[1] = true;// prime number nahi hai;
		// jis index par false hai vo prime number hai and jis par true hai vo prime nhi
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[j * i] = true;
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}
	}
}
