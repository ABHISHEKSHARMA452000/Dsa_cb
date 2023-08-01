package Leetcode_questions;

public class leetcode_2141_MaximumRunningTimeOfNComputers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long maxRunTime(int n, int[] batteries) {
		long lo = 0;
		long hi = 0;
		for(int i=0;i<batteries.length;i++) {
			hi += batteries[i];
		}
		long ans=0;
		while(lo<=hi) {
			long mid = lo+(hi-lo)/2;
			if(IsItPossible(batteries,mid,n)) {
				ans = mid;
				lo = mid+1;//becoze maximize karna hai
			}else {
				hi = mid-1;
			}
		}
		return ans;
	}
	public static boolean IsItPossible(int[] B,long p_ans,int n) {
		long time = 0;
		for(int i=0;i<B.length;i++) {
			if(B[i] <= p_ans) {
				time+=B[i];
			}else {
				time+=p_ans;
			}
		}
		return time>=p_ans*n;
	}

}
