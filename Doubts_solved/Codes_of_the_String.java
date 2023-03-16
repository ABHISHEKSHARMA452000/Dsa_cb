package Doubts_solved;

public class Codes_of_the_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1123";
		Print(s,"");
	}
	public static void Print(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		Print(ques.substring(1), ans + (char)(ch + 16));
		if(ques.length() >= 2) {
			String s1 = ques.substring(0,2);
			int num = Integer.parseInt(s1); //string to int ma karna
			if(num <= 26) {
				Print(ques.substring(2),ans + (char)( 64+ num));
			}
		}
	}

}
