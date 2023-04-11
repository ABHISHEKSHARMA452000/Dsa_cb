package Doubts_solved;

import java.util.Scanner;

public class N_knight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		knight(board,0,0,"",n);
	}

	public static void knight(boolean[][] board, int cr, int cc, String ans, int tk) {
		if (tk == 0) {
			System.out.print(ans);
			System.out.print("***");
			return;
		}
		if (cc == board.length) {
			cr++;
			cc = 0;
		}
		if (cr >= board.length) {
			return;
		}
		if (issafe(board, cr, cc)) {
			board[cr][cc] = true;
			knight(board, cr, cc + 1, ans + "{" + cr + "-" + cc + "}" +" ", tk - 1);
			board[cr][cc] = false;
		}
		knight(board, cr, cc + 1, ans, tk);
	}

	public static boolean issafe(boolean[][] board,int cr,int cc) {
		int[] r = {-2,-2,-1,-1};
		int[] c = {-1,1,-2,2};
		
		for(int i=0;i<c.length;i++) {
			int x = cr + r[i];
			int y = cc+ c[i];
			if(x>= 0 && y>=0 && y<board.length && x<board.length && board[x][y] == true) {
				return false;
			}
		}
		return true;
		
	}
}
