package Leetcode_questions;

import java.util.*;

public class leetcode_40_CombinationSum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3};
		int target = 6;
		Arrays.sort(arr);
		List<Integer> list1 = new ArrayList<>();
		List<List<Integer>> list2 = new ArrayList<>();
		Combination(arr,target,"",0,list1,list2);
		System.out.println(list2);
		
 	}

	public static void Combination(int[] arr,int target,String ans,int idx,List<Integer> list1,List<List<Integer>> list2) {
		if(target == 0) {
			//System.out.println(ans);
			list2.add(new ArrayList<>(list1));
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(i>idx && arr[i] == arr[i-1]) {
				continue;
			}
			if(target >= arr[i]) {
				list1.add(arr[i]);
				Combination(arr,target-arr[i],ans + arr[i] + ",",i+1,list1,list2);
				list1.remove(list1.size()-1);
			}
		}
	}
}
