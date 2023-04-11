package assignments;

import java.util.Scanner;

public class N_Knight_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		int ans = Print(board, n, 0, 0);
		System.out.println();
		System.out.println(ans);
	}

	public static int Print(boolean[][] board, int tk, int row, int col) {
		if (tk == 0) {
			Display(board);
			System.out.print(" ");
			return 1;
		}
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return 0;
		}
		int a1 = 0;
		if (issafe(board, row, col) == true) {
			board[row][col] = true;
			a1 = Print(board, tk - 1, row, col + 1);
			board[row][col] = false;
		}
		int a2 = Print(board, tk, row, col + 1);
		return a1 + a2;
	}

	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == true) {
					System.out.print("{" + i + "-" + j + "}" + " ");
				}
			}
		}
	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		int[] r = { -1, -1, -2, -2 };
		int[] c = { -2, 2, -1, 1 };
		for(int i=0;i<c.length;i++) {
			int xr = row + r[i];
			int yc = col + c[i];
			if(xr >= 0 && yc >= 0 && xr < board.length && yc < board[0].length && board[xr][yc] == true) {
				return false;
			}
		}
		return true;
	}
}
