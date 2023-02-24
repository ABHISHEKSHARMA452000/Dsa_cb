package lec27_18_02_23;

public class tail_fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=4;
		int b=3;
		System.out.println(fact(n,1));
		System.out.println(pow(a,b));
	}
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return fact(n-1,ans*n);
	}
	public static int pow(int a,int b) {
		return 1;
	}
}
