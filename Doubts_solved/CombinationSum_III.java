package Doubts_solved;

public class CombinationSum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[10];
		int k = 3;
		int n = 9;
		Combination(board,k,n,"",1);
	}
	public static void Combination(boolean[] board,int k,int n,String ans,int idx) {
		if(n == 0 && k ==0) {
			System.out.println(ans);
			return;
		}
		if(k==0) {
			return;
		}
		for(int i = idx;i<board.length;i++) {
			if(board[i] == false) {
				board[i] = true;
				Combination(board,k-1,n-i,ans+i,i+1);
				board[i] = false;
			}
		}
	}
}
