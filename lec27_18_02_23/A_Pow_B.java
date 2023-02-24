package lec27_18_02_23;

public class A_Pow_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 3;
		int ans = Pow(a,b);
		System.out.println(ans);
	}
	public static int Pow(int a,int b) {
		if(b == 1) {
			return a;
		}
		int ans = Pow(a,b-1);
		return a*ans;
		
	}

}
