package assignments;

import java.util.Scanner;

public class RatChases_itsCheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<s.length();j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		PrintMaze(maze,0,0,ans);
		if(f == false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean f = false;
	public static void PrintMaze(char[][] maze,int cr,int cc,int[][] ans) {
		if(cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			f = true;
			display(ans);
			return;
		}
		if(cc < 0 || cr < 0 || cc>= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') { // last ma X vala condition hi hogi 
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int r[] = {-1,1,0,0};
		int c[] = {0,0,-1,1};
		for(int i=0;i<c.length;i++) {
			PrintMaze(maze,cr + r[i],cc + c[i],ans);
		}
//		PrintMaze(maze,cr-1,cc,ans);//up
//		PrintMaze(maze,cr+1,cc,ans);//down
//		PrintMaze(maze,cr,cc-1,ans);//left
//		PrintMaze(maze,cr,cc+1,ans);//right
		ans[cr][cc] = 0;
		maze[cr][cc] = 'O';
	}
	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
