package Leetcode_questions;

import java.util.*;

public class leetcode_78_SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] set = new int[n];
		for (int i = 0; i < set.length; i++) { 
			set[i] = sc.nextInt();              
		}
		int idx = 0;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Subset(set,idx,list,ans);
		System.out.println(ans);
	}
	public static void Subset(int[] set,int idx,List<Integer> list,List<List<Integer>> ans) {
		if(idx == set.length) {
			//System.out.println(list);
			//syso(ans); empty lists data bcoz of backtracking elements of list remove ho jata from list bcoz ya sab kuch kaam heap ma hua hai
			ans.add(new ArrayList<>(list));
			return;
		}
		Subset(set,idx+1,list,ans);
		list.add(set[idx]);
		Subset(set,idx+1,list,ans);
		list.remove(list.size()-1); //backtraing ki need
	}
}
