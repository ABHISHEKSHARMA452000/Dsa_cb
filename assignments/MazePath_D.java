package assignments;

import java.util.*;

public class MazePath_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int ans =Paths(0, 0, n1 - 1, n2 - 1, "");
		System.out.println("\n" + ans);
	}

	public static int Paths(int crow, int ccol, int erow, int ecol, String ans) {
		if (crow == erow && ccol == ecol) {
			System.out.print(ans + " ");
			return 1;
		}
		if(crow > erow || ccol > ecol) {
			return 0;
		}
		int num1 = 0;
		int a1 = Paths(crow,ccol+1,erow,ecol,ans + "H");
		int a2 = Paths(crow+1,ccol,erow,ecol,ans + "V");
		if(crow < erow && ccol < ecol) {
			num1 = Paths(crow+1,ccol+1,erow,ecol,ans + "D");
		}
		return a1+ a2 + num1;
	}
}
