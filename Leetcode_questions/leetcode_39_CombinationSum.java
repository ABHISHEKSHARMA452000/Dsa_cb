package Leetcode_questions;
import java.util.*;
public class leetcode_39_CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination(candidates,target,0,list,ans);
		System.out.println(ans);
	}
	public static void Combination(int[] candidates,int target,int idx,List<Integer> list,List<List<Integer>> ans) {
		if(target == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for(int i=idx;i<candidates.length;i++) {
			if(target >= candidates[i]) {
				list.add(candidates[i]);
				Combination(candidates,target-candidates[i],i,list,ans);
				list.remove(list.size()-1);
			}
		}
	}
}
