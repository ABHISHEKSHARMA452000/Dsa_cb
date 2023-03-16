package assignments;

import java.util.Scanner;

public class MazePath_D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\n" + Paths(0,0,n-1,n-1,"",0));
	}
	// aasas count la kar bhi kara hai and mazepath_d jasa bhi kar sakta hai and check also keypad vala for count nikalna ka liya
	public static int Paths(int crow, int ccol, int erow, int ecol, String ans,int count) {
		if (crow == erow && ccol == ecol) {
			System.out.print(ans + " ");
			return 1;
		}
		if(crow > erow || ccol > ecol) {
			return 0;
		}
		int a1 = Paths(crow,ccol+1,erow,ecol,ans + "H",count);
		int a2 = Paths(crow+1,ccol,erow,ecol,ans + "V",count);
		if(crow < erow && ccol < ecol && crow == ccol) {
			count = Paths(crow+1,ccol+1,erow,ecol,ans + "D",count);
		}
		return a1+ a2 + count;
	}

}
