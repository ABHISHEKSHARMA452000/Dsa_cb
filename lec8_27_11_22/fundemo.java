package lec8_27_11_22;

public class fundemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		System.out.println("bye");
		Addition(); //function calling
		System.out.println("hello");
	}
	
	public static void Addition() {
		int a = 7;
		int b = 9;
		int c = a+b;
		sub();
		System.out.println(c);
	}
	public static void sub() {
		int a = 7;
		int b = 9;
		int c = a-b;
		System.out.println(c);
	}
}
