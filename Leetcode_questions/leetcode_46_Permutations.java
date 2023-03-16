package Leetcode_questions;

import java.util.*;

public class leetcode_46_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		boolean[] bool =new boolean[nums.length];
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Permutation(nums,bool,0,list,ans);
		System.out.println(ans);
	}
	public static void Permutation(int[] nums,boolean[] bool,int npsf,List<Integer> list,List<List<Integer>> ans) { //number permute so far
		if(npsf == nums.length) {
			//System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(bool[i] == false) {
				bool[i] = true;
				list.add(nums[i]);
				Permutation(nums,bool,npsf + 1,list,ans);
				list.remove(list.size()-1);
				bool[i] = false;
			}
		}
	}
}
