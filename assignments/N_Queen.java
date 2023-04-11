package assignments;

import java.util.Scanner;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		System.out.println("\n" + Print(board, n, 0)); 
	}

	public static int Print(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			System.out.print(" ");
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				int ans = Print(board, tq - 1, row + 1);
				count += ans;
				board[row][col] = false;
			}
		}
		return count;
	}

	public static void Display(boolean[][] board) {
		for (int i = 1; i <= board.length; i++) {
			for (int j = 1; j <= board[0].length; j++) {
				if(board[i-1][j-1] == true) {
					System.out.print("{" + i + "-" + j + "}" + " " );
				}
			}
		}
	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// up
		int r = row;
		int c = col;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// right
		r = row;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		// left
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}
}
