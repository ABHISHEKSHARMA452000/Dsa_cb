package Leetcode_questions;
//not completed
import java.util.Arrays;

public class leetcode_47_Permutation_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2 };
		boolean[] board = new boolean[arr.length];
		Arrays.sort(arr);
		Permute(arr, "", 0,board,0);
	}

	public static void Permute(int[] arr, String ans, int npfs,boolean[] board,int idx) {
		if(arr.length == npfs) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i > idx && arr[i] == arr[i-1]) {
				continue;
			}
			if(board[i] ==false) {
				board[i] = true;
				Permute(arr,ans + arr[i] + ",",npfs+1,board,idx+1);
				board[i] = false;
			}
		}
	}
}
