package lec30_26_02_23;

public class Lexicographical_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		Counting(0, n);
	}

	public static void Counting(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr == 0) {
			i=1;
		}
		for(;i<=9;i++) {
			Counting(curr*10 + i,end);
		}
	}

}
