package Leetcode_questions;

import java.util.Scanner;

public class RatChasesItsCheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] arr = new int[n][m];
		PrintMaze(maze, 0, 0,arr);
		if(f == false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean f = false;
	public static void PrintMaze(char[][] maze, int cr, int cc,int[][] arr) {
		if (cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] != 'X') {
			arr[cr][cc] = 1;
			f = true;
			Display(arr);
			return;
		}
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		arr[cr][cc] = 1;
		int[] r = {-1,1,0,0};
		int[] c = {0,0,-1,1};
//		PrintMaze(maze, cr - 1, cc,arr); // top
//		PrintMaze(maze, cr + 1, cc,arr); // bottom
//		PrintMaze(maze, cr, cc - 1,arr); // left
//		PrintMaze(maze, cr, cc + 1,arr); // right
		for(int i=0;i<r.length;i++) {
			PrintMaze(maze,cr + r[i],cc + c[i],arr);
		}
		arr[cr][cc] = 0;
		maze[cr][cc] = 'O';
	}
	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
