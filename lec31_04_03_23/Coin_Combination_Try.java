package lec31_04_03_23;

public class Coin_Combination_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2,3,5,6};
		int amt = 8;
		Coins_Com(coins,"",amt,0);
	}
	public static void Coins_Com(int[] coins,String ans,int amt,int idx) {
		if(amt == 0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coins.length;i++) {
			if(amt >= coins[i]) {
				Coins_Com(coins,ans + coins[i],amt - coins[i],idx);
			}
		}
	}
}
