package lec29_25_02_23;

public class CountSubseqWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintSub("abc","");
		//System.out.println(ans);
		System.out.println("\n" + PrintSub1("abc","")); // \n to make it to next line
	}
	public static int PrintSub1(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		
		char ch = ques.charAt(0);
		int a1 = PrintSub1(ques.substring(1),ans);
		int a2 = PrintSub1(ques.substring(1),ans + ch);
		return a1+a2;
	}
	public static void PrintSub(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		char ch = ques.charAt(0);
		PrintSub(ques.substring(1),ans);
		PrintSub(ques.substring(1),ans + ch);
	}

}
