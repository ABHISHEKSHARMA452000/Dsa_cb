package Leetcode_questions;
//not completed
public class leetcode_77_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		boolean[] bool = new boolean[n];
 		Combination(n,k,bool,0);
	}
	public static void Combination(int n,int k,boolean[] bool,int idx) {
		if(idx == k) {
			
		}
		for(int i=idx;i<n;i++) {
			if(bool[i] == false) {
				bool[i] = true;
				Combination(n,k,bool,i + 1);
				bool[i] = false;
			}
			
		}
	}

}
