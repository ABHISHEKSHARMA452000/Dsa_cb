package lec24_04_02_23;

public class CoinToss2HHNotTake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		String ans = "";
		No2H(n,ans);
	}
	public static void No2H(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') { //phele ans.length vala condition check hogi ig vahi sahi hue toh next par check
			No2H(n-1,ans + "H");
		}
			No2H(n-1,ans + "T");
	}

}
