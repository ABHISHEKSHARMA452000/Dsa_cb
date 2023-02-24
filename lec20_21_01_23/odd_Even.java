package lec20_21_01_23;

public class odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		//1.
		if((n&1) != 0) {
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
		//2.
		float f = 10.2f;
		int x = 15;
		System.out.println( x >> 1);
		//System.out.println(f >> 1); // not used kabhi nhi chal tha float ka liya ya operator
		int a = -15;
		System.out.println( a >> 1); //right shift divide by 2;
		System.out.println(a<<2); //left shift multiply by 2
		System.out.println(x<<2); //left shift
	}

}
