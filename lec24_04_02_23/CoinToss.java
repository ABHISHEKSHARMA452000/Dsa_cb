package lec24_04_02_23;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String ans ="";
		Coin(n,ans);
	}
	public static void Coin(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		Coin(n-1,ans + 'H');
		Coin(n-1,ans + 'T');
	}
}
