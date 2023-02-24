package lec22_28_01_23;

public class a_kipower_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 5;
		int ans = pow(a,b);
		System.out.println(ans);
	}
	public static int pow(int a,int b) {
//		if(b==1) {
//			return a;
//		}
		
		if(b == 0) { //if 
			return 1;
		}
		
		int pow_oneless = pow(a,b-1); // recursion bhai tu mere ko ko a ki pow b-1 la de ma a sa multiply kar ka a ki pow b bana lunga 
		return a*pow_oneless;
	}
	public static int power(int a,int b) {
		if(b==1) {
			return a;
		}
		int ans = power(a,b-1);
		return ans*a;
	}

}
