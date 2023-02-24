package assignments;

import java.util.Scanner;

public class Replace_themall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		long mul =1;
		if(n == 0) {
			System.out.println(5);
		}
		while(n>0) {
			long rem = n%10;
			if( rem != 0) {
				sum =sum + rem*mul;
			}else {
				sum = sum + 5*mul;
			}
			mul = mul*10;
			n = n/10;
		}
		System.out.println(sum);
	}

}

//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//		long n = sc.nextLong();
//        System.out.println(replace(n));
//    }
//    public static long  replace(long n ){
//
//		long sum = 0;
//		long mul =1;
//        if(n==0){
//            return 5;
//        }
//		while(n>0) {
//			long rem = n%10;
//            if(rem == 0){
//                rem = 5;
//            }
//            sum += rem*mul;
//			mul = mul*10;
//			n = n/10;
//		}
//		return sum;
//    }
//}
