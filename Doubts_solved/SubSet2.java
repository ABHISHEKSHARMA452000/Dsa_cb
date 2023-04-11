package Doubts_solved;

import java.util.*;

public class SubSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2};
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		PrintSubSet(arr,0,ll,ans);
		System.out.println(ans);
	}
	public static void PrintSubSet(int[] arr,int idx,List<Integer> ll,List<List<Integer>> ans) {
		ans.add(new ArrayList<Integer>(ll));
		for (int i = idx; i < arr.length; i++) {
			if(i > idx && arr[i] ==arr[i-1]) {
				continue;
			}
			ll.add(arr[i]);
			PrintSubSet(arr,i+1,ll,ans);
			ll.remove(ll.size()-1);
		}
	}
}
