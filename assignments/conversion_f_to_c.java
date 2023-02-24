package assignments;

import java.util.Scanner;

public class conversion_f_to_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int minf = sc.nextInt();
//		int maxf = sc.nextInt();
//		int steps = sc.nextInt();
//		for(int i = minf;i<=maxf;i=i+steps) {
//			int c = (5*(i-32))/9;
//			System.out.println(i + "	" + c);
//		}
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int steps = sc.nextInt();
		for(int i = minf;i<=maxf;i=i+steps) {
			int c =(int) (5.0/9)*(i-32); //5.0 sa number floatthen type convert kar diya int ma back 
			System.out.println(i + "	" + c);
		}
	}

}
