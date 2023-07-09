package lec60_24_06_23;

public class Kartik_bhaiya_and_String {
	public static void main(String[] args) {
		String str = "aaababbaaba";
		int k = 2;
		int flipa = Flips(str,k,'a');
		int flipb = Flips(str,k,'b');
		int ans = Math.max(flipa, flipb);
		System.out.println(ans);
	}
	public static int Flips(String s,int k,char ch) {
		int si = 0;
		int ei = 0;
		int flips = 0;
		int ans = 0;
		while(ei<s.length()) {
			//growing
			if(s.charAt(ei) == ch) {
				flips++;
			}
			//shrinking
			while(flips>k && si <= ei) {
				if(s.charAt(si) == ch) {
					flips--;
				}
				si++;
			}
			
			//answer
			ans = Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}
}
