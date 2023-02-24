package assignments;

import java.util.Scanner;

public class Print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 1;
		//int n=1;
		int pos =1;
		while(pos <=  n1) {
			
			int number = 3*count + 2;
			if(number % n2 != 0) {
				System.out.println(number);
				pos++;
				
			}
			count++;
			//n++;
		}
		//Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int count = 1;
//		
//		while(count <= n1 + n2) {
//			int number = 3*count + 2;
//			if(number%n2 != 0 ) {
//				System.out.println(number);
//				
//			}
//			count++;
//		}
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int count = 1;
//        
//		
//		while(count <= n1) {
//			int n = 1;
//			int number = 3*count + 2;
//			if(number%n2 != 0 ) {
//				System.out.println(number);
//				count++;
//			}
//			n++;
//		}
	}

}
