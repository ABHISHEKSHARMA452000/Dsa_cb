package lec21_22_01_23;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		if(n==0) {
			return 1;
		}
		int fn = fac(n-1); //sp
		return n*fn;
	}

}
