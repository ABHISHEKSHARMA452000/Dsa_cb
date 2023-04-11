package Leetcode_questions;

public class leetcode_79_WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if(maze[i][j] == word.charAt(0)) { //fuction call tabhi kar raha hai jab char(0) mila with maze[i][j] sa
					boolean ans = Search(maze,word,i,j,0);
					if(ans == true) {
						System.out.println(ans);
						return;
					}
				}
			}
		}
		System.out.println(false);
	}
	public static boolean Search(char[][] maze,String word,int row,int col,int idx) {
		if(idx == word.length()) {
			return true;
		}
		if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] != word.charAt(idx)) {
			return false;
		}
		int[] r = {-1,1,0,0}; //up - down - left - right
		int[] c = {0,0,-1,1}; //up - down - left - right
		maze[row][col] = '*';
		//es case ma backtracking loop sa bahar hogi bcoz if loop ka andar karta toh maze ka character hi change kar deta ma toh
		for(int i=0;i<c.length;i++) {
			boolean ans = Search(maze,word,row + r[i],col + c[i],idx+1);
			if(ans == true) { //direct bahar aa raha hai ans milna ka baad or koi search nhi kar raha hai
				return true;
			}
		}
		maze[row][col] = word.charAt(idx);
		return false;
	}

}
