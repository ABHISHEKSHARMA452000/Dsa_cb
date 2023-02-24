package lec27_18_02_23;

public class PdAndPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		//Pd(n);
		Pi(n);
	}
	public static void Pd(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		Pd(n-1);
	}
	public static void Pi(int n) {
		if(n == 0) {
			return;
		}
		Pi(n-1);
		System.out.println(n);
	}

}
