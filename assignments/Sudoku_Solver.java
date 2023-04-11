package assignments;

import java.util.Scanner;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
//		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
//				 { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
//				 { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
//				 { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
//				 { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
//				 { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
//				 { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
//				 { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
//				 { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
//				 };
		Print(grid,0,0);
		//System.out.println("**********");
		//Display(grid);
	}
	//0 based indexing kari hai and at 9 par aana pa col and row end hai 
	//col ja 9 hoga means row increase karni and col =0 karna hai
	//when row 9 means all cell fill hogaya hai and ans ban raha haitoh base case for Display
	public static void Print(int[][] grid,int row,int col) {
		if(col == 9) {
			row++;
			col = 0;
		}
		if(row == 9) {
			Display(grid);
			return;
		}
		
		if(grid[row][col] != 0) {
			Print(grid,row,col+1);
		}else {
			for(int val = 1;val<=9;val++) {
				if(issafe(grid,row,col,val) == true) {
					grid[row][col] = val;
					Print(grid,row,col+1);
					grid[row][col] = 0;
				}
			}
		}
	}
	public static void Display(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static boolean issafe(int[][] grid,int row,int col,int val) {
		//row same rakna par
		for(int c=0;c<9;c++) {
			if(grid[row][c] == val) {
				return false;
			}
		}
		//col same kara toh 
		for(int r = 0;r<9;r++) {
			if(grid[r][col] == val) {
				return false;
			}
		}
		//3x3 ki grid ma check
		int r = row - row%3;
		int c = col - col%3;
		//these two are starting index of any 3x3 matrix based on row and col passed to this function or cell passed to this function
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}
}
