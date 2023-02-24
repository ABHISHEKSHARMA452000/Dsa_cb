package lec27_18_02_23;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int fn = fact(n-1); //sp
		return n*fn;
	}

}
