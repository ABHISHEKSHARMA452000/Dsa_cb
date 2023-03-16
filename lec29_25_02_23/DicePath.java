package lec29_25_02_23;

//amazon ma is type ka tha
public class DicePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dest = 4;
		int curr = 0;
		System.out.println("\n" + PrintPath(0, dest, ""));
	}

	public static int PrintPath(int curr, int des, String ans) {
		if (curr == des) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > des) {
			return 0;
		}
//		int a1 = PrintPath(curr + 1, des, ans + 1);
//		int a2 = PrintPath(curr + 2, des, ans + 2);
//		int a3 = PrintPath(curr + 3, des, ans + 3);
//		return a1 + a2 + a3;
		int count = 0;
		for(int dice=1;dice<=3;dice++) {
			count = count + PrintPath(curr + dice,des,ans + dice);
		}
		return count;
	}

}
