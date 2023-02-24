package lec28_19_02_23;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String ans = "";
		sequence(s, ans);
	}

	public static void sequence(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		sequence(ques.substring(1), ans);
		sequence(ques.substring(1), ans + ch);
	}

}
