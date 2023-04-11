package Leetcode_questions;
import java.util.*;
public class leetcode_216_CombinationSum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 9;
		boolean[] board = new boolean[10];
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		CombinationSum(board,k,n,0,"",1,list,ans);
		System.out.println(ans);
		
	}
	public static void CombinationSum(boolean[] board,int k,int n,int sum,String ans,int idx,List<Integer> list1,List<List<Integer>> list2) {
		if(k==0 && sum == n) { //when jitna coin choose kkarna tha kara and saath ma sum bhi proper bana
			//System.out.println(ans + " ");
			list2.add(new ArrayList<>(list1));
			return;
		}
		if(k == 0) { //means choose kar liya saara possible num but sum nhi bana
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i] == false) {
				list1.add(i);
				board[i] = true;
				CombinationSum(board,k-1,n,sum + i,ans + i + ",",i+1,list1,list2);
				board[i] = false;
				list1.remove(list1.size()-1);
			}
		}
	}
}
