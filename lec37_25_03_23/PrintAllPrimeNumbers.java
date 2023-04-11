package lec37_25_03_23;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;
		System.out.println(IsPrime(n));
		
	}
	public static boolean IsPrime(int n) {
		int div = 2;
		while(div*div <= n) {
			if(n%div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
