package Doubts_solved;

import java.util.*;;

public class Painter_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] board = new int[n];
		for (int i = 0; i < board.length; i++) {
			board[i] = sc.nextInt();
		}
		System.out.println(PainterPartition(board,k));
	}
	public static int PainterPartition(int[] board,int painter) {
		int ans = 0;
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < board.length; i++) {
			hi = hi + board[i];
		}
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(board,mid,painter) == true) {
				ans = mid;
				hi = mid - 1;
			}else {
				lo = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] board,int pans,int painters) { //pans == possible ans
		int time = 0;
		int p = 1; //used painter to paint ,,,,painters total painter available hai
		for (int i = 0; i < board.length;) {
			if(time + board[i] <= pans) {
				time += board[i];
				i++; //i++ tabhi hoga jab time in limits hai,if time out hua toh dusra painter hai aisko vo board paint karna hoga
			}else { //next commment continue down
				p++; //hence new painter lena hoga
				time = 0; //new painter ka bhi time zero sa start hoga
			}
			if(p > painters) {
				return false;
			}
		}
		
		
		return true;
	}

}
