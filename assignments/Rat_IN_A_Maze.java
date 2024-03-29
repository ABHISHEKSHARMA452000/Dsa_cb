package assignments;

import java.util.Scanner;

public class Rat_IN_A_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		Print(maze, 0, 0, ans);
		if(flag == false) {
			System.out.println(-1);
		}
	}

	static boolean flag = false; // yaha par 4 ans print ho raha tha toh flag sa only ek ans print kara vo bhi
									// rightmost vala

	public static void Print(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X' && flag == false) {
			ans[cr][cc] = 1;
			Display(ans);
			flag = true;
			return;
		}
		if (cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (flag == false) {
			ans[cr][cc] = 1;
			Print(maze, cr, cc + 1, ans);
			Print(maze, cr + 1, cc, ans);
			ans[cr][cc] = 0;
		}
	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
