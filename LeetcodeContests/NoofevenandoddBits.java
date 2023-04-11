package LeetcodeContests;

public class NoofevenandoddBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int[] ans = bits(n);
		System.out.println("[" + ans[0] + "," + ans[1] + "]");
	}

	public static int[] bits(int n) {
		int ec = 0;
		int oc = 0;
		int[] ans = new int[2];
		for (int i = 0; n > 0; i++) {
			if (i % 2 == 0) {
				if ((n & 1) != 0) {
					ec++;
				}
			}
			if (i % 2 == 1) {
				if ((n & 1) != 0) {
					oc++;
				}
			}
			n = n>>1;
		}
		ans[0] = ec;
		ans[1] = oc;
		return ans;
	}
}
