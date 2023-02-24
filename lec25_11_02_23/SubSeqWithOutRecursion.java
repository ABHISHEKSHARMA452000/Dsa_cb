package lec25_11_02_23;

public class SubSeqWithOutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";

	}

	public static void PrintPattern(String str) {
		int len = str.length();
		for (int i = 0; i < (1 << len); i++) {
			Pattern(i, str);
		}
	}

	public static void Pattern(int i, String str) {
		int pos = 0;
		while (i != 0) {
			if ((i & 1) != 0) {
				System.out.println(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();
	}
}
