package Leetcode_questions;

import java.util.Scanner;

public class Leetcode_278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first bad version
		Scanner sc = new Scanner(System.in)
;		int n = sc.nextInt();
		first_BadVersion(n);
	}
	public static void first_BadVersion(int n) {
		int lo=1;
		int hi = n;
		int ans =0;
		while(lo<=hi) {
			int mid  = lo + (hi-lo)/2; //bcoze of constraints in leetcode hi and lo set kiya hai int sa bahar ja raha hai toh in case to boundary value mid aasa calculate kar sakta hai
			if(isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			}else {
				lo = mid + 1;
			}
		}
		System.out.println(ans);
	}
	public static boolean isBadVersion(int n) {
		//defined by leetcode
		if(n<7) {
			return false;
		}
		return  true; //or false;
	}

}
