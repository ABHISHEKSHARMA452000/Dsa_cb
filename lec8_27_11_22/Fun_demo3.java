package lec8_27_11_22;

public class Fun_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 7;
		int b = 9;
		int ans = Addition(a, b); // function calling
		System.out.println(ans);
		//System.out.println(Addition(a, b));
		System.out.println("hello");
		
	}

//	public static void Addition(int a, int b) { // a=7 b=9 c=16
//
//		int c = a + b;
//		sub(c, a);
//		System.out.println(c);
//	}
//
//	public static void sub(int a, int b) { // a=16 and b=7 aaya ga
//
//		int c = a - b;
//		System.out.println(c);
//	}
	
	public static int Addition(int a,int b) {
		int c = a+b;
		return c;
	}

}
