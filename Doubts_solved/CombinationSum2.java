package Doubts_solved;

import java.util.Arrays;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,2,7,6,1,5};
		Arrays.sort(arr);
		int target = 8;
		Combination(arr,target,0,"");
	}
	public static void Combination(int[] arr,int target,int idx,String ans) {
		if(target == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = idx;i<arr.length;i++) {
			if(i>idx && arr[i] == arr[i-1]){ //i>idx means ki phele call toh laga dega har baar and auska baad duplicate ki call na laga
				continue;					 // arr[i] == arr[i-1] check kar raha hai ki i and i-1 ki value same hai toh i ki call mat do 
			}
			if(target >= arr[i]) {
				Combination(arr,target-arr[i],i+1,ans+arr[i]);
			}
		}
	}
}
