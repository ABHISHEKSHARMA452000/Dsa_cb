package lec7_26_11_22;

import java.util.Scanner;

public class Data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte b = (byte)(191);
		int a = 10;
		b = (byte) (a); //explict conversion
		b=10;
		long l1 = 265416456;
		long l2 = 2654164565l;
		
		double d = 8.9;
		float f = 8.8f;
		
		long l = sc.nextLong(); //595321661628 user input lata time no problem
		float fl = sc.nextFloat(); //839.5
		System.out.println(l);
		System.out.println(f);
		
		boolean f1 = true;
		boolean f2 = false;
		System.out.println(f1);
		System.out.println(f2);
		
	}

}
