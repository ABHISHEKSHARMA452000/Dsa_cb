package lec8_27_11_22;

public class Fun_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a=7;
		int b=9;
		Addition(a,b); //function calling
		System.out.println("hello");
		sub(b,a);
	}
	public static void Addition(int a,int b) { //a=7 b=9 
		
		int c = a+b;
		
		System.out.println(c);
	}
	public static void sub(int a,int b) { //a=9 and b=7 aaya ga
		
		int c = a-b;
		System.out.println(c);
	}

}
