package lec22_28_01_23;

public class PrintDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//dec(n);
		pd(5);
	}
//	public static void dec(int n) {
//		if(n==1) {
//			System.out.println(1);
//			return;
//		}
//		System.out.println(n);
//		dec(n-1);
//	}
	public static void pd(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		pd(n-1);
	}

}
