package assignments;

import java.util.Scanner;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Print(n,0,0,"");
	}
	public static void Print(int n,int open,int close,String ans) {
		if(ans.length() == 2*n) {
			System.out.println(ans +" ");
			return;
		}
		
		if(open < n) {
			Print(n,open + 1,close,ans + '(');
		}
		if(close < open) {
			Print(n,open,close + 1,ans + ')');
		}
		
	}

}
