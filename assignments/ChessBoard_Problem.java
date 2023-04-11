package assignments;

import java.util.Scanner;

public class ChessBoard_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = BoardPath(n, 0, 0, "");
		System.out.println("\n" + ans);
	}

	public static int BoardPath(int n,int cr,int cc,String ans) {
		if(cr == n-1 && cc == n-1) {
			System.out.print(ans + "{" + cr + "-" + cc + "}" + " ");
			return 1;
		}
		if(cr >= n || cc >= n) {
			return 0;
		}
		
		//knight
		int k1 = BoardPath(n,cr+2,cc+1,ans + "{" + cr + "-" + cc + "}K");
		int k2 = BoardPath(n,cr+1,cc+2,ans + "{" + cr + "-" + cc + "}K");
		//rook
		int r1 = 0;
		int r2 = 0;
		if(cr == 0 || cc == 0 || cr == n-1 || cc == n-1) {
			for(int i=1;i<n;i++) {
				r1 += BoardPath(n,cr,cc+i,ans + "{" + cr + "-" + cc + "}R");
			}
			for(int i=1;i<n;i++) {
				r2 += BoardPath(n,cr+i,cc,ans + "{" + cr + "-" + cc + "}R");
			}
		}
		//bishop
		int b = 0;
		if(cr == cc || cr + cc == n-1) {
			for(int i=1;i<n;i++) {
				b += BoardPath(n,cr + i,cc+i,ans + "{" + cr + "-" + cc + "}B");
			}
		}
		return k1+k2+r1+r2+b;
	}

}
