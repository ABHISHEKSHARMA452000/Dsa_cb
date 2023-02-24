package assignments;

import java.util.Scanner;

public class Revising_QuadEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b * b - 4 * a * c;
		int sqrt = (int) Math.sqrt(d);
		int root1 = (-b + sqrt) / 2 * a;
		int root2 = (-b - sqrt) / 2 * a;
		if (d == 0) {
			System.out.println("Real and Equal");
			System.out.println(root1 + " " + root2);
		} else if (d > 0) {
			System.out.println("Real and Distinct");
			if(root1 > root2) {
				System.out.println(root2 + " " + root1);
			}else {
				System.out.println(root1 + " " + root2);
			}
			
		} else {
			System.out.println("Imaginary");
		}
	}

}
