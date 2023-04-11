package Leetcode_questions;

import java.util.*;

public class leetcode_77_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		boolean[] board = new boolean[n];
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination(board,k,0,0,"",list,ans);
		//System.out.println(list);
		System.out.println(ans);

	}
	public static void Combination(boolean[] board,int k,int npsf,int idx,String ans,List<Integer> list,List<List<Integer>> sol) {
		if(k == npsf) {
			//System.out.println(ans + " ");
			//System.out.println(list);
			sol.add(new ArrayList<>(list));
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i] == false) {
				board[i] = true;
				int val = i+1;
				list.add(val);
				Combination(board,k,npsf+1,i+1,ans + val + ",",list,sol);
				list.remove(list.size()-1);
				board[i] = false;
			}
		}
	}
}
