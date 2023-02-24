package lec28_19_02_23;

public class NoOfTossCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		CoinToss(n,"");
	}
	public static void CoinToss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		CoinToss(n-1,ans + 'H');
		CoinToss(n-1,ans + 'T');
	}
}
