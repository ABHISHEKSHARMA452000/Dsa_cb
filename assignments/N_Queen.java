package assignments;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		Print(board, n, 0);
	}

	public static void Print(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				Print(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}

	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("**************");
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
