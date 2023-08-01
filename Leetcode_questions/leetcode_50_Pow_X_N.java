package Leetcode_questions;

public class leetcode_50_Pow_X_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.000;
		int n = 3;
		System.out.println(mypow(x,n));
	}
	public static double mypow(double x,int n) {
		double ans = 1.0;
		long nn = n;////ki jab int -(2)^31 hoga toh +ve karta time int sa number overflow ho jaya ga isliya long lena padha hai
		//ma phele x ki n find kar raha hu chahai n +ve or -ve ho if n<0 hai to 1/ans kar dunga bas 
		if(n <0) {
			nn = -1*nn;//to make it positive
		}
		while(nn>0) {
			if(nn%2 == 0) {//if nn%2 == 0 means (2)^10 = (4)^5
				x = x*x;
				nn = nn/2;
			}else if(nn%2 == 1) {// (4)^5 = 4*(4)^4;
				ans = ans*x;
				nn = nn-1;
			}
		}
		if(n<0) {
			ans = (double)1.0/(double)ans;
		}	
		return ans;
	}
}
