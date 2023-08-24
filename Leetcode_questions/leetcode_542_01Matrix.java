package Leetcode_questions;

import java.util.*;

public class leetcode_542_01Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] updateMatrix(int[][] mat) {
		int[][] matrix = new int[mat.length][mat[0].length];
		Queue<Pair> q = new LinkedList<>();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j] ==0) {
					matrix[i][j] = 0;
					q.add(new Pair(i,j));
				}else {
					matrix[i][j] = -1;
				}
			}
		}
		int[][] direction = {{0,1},{1,0},{-1,0},{0,-1}};
		while(!q.isEmpty()) {
			Pair r = q.remove();
			for(int[] dir : direction) {
				int nrow = r.row + dir[0];
				int ncol = r.col + dir[1];
				if(nrow >= 0 && ncol >= 0 && nrow <mat.length && ncol < mat[0].length && matrix[nrow][ncol] == -1) {
					matrix[nrow][ncol] = matrix[r.row][r.col] + 1;
					q.add(new Pair(nrow,ncol));
				}
			}
		}
		return matrix;
	}
	class Pair{
		int row;
		int col;
		public Pair(int row,int col) {
			this.row = row;
			this.col = col;
		}
	}

}
