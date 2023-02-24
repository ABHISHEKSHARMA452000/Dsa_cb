package lec20_21_01_23;

public class Count_set_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(FastCountSet(n));
	}
	public static int CountSet(int n) {
		int count = 0;
		while(n>0) {
			if((n&1) != 0) {
				count++;
			}
			n=n>>1;
		}
		return count;
	}
	public static int FastCountSet(int n) {
		int count = 0;
		while(n>0) {
			n = (n & (n-1));
			count++;
		}
		return count;
	}

}
