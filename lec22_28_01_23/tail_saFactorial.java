package lec22_28_01_23;

public class tail_saFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=1;
		int result = fac(n,ans);
		System.out.println(result);
	}
	public static int fac(int n,int ans) {
		if(n == 0) {
			return ans;
		}
		return fac(n-1,ans*n);
	}

}
