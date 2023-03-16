package lec32_05_03_23;

public class Coins_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2,5,3,6};
		int amt = 10;
		Coin_Com(coins,amt,"",0);
	}

	public static void Coin_Com(int[] coin,int amount,String ans,int idx) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx;i<coin.length;i++) {
			if(amount >= coin[i]) {
				Coin_Com(coin,amount - coin[i],ans+coin[i],i);
			}
		}
	}
}
