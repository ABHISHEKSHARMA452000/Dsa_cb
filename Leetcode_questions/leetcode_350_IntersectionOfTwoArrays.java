package Leetcode_questions;

import java.util.*;

public class leetcode_350_IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,7,4,3,2,5,9,7,4,2,3};
		int[] arr2 = {5,11,4,7,3,1,2,3,1,5,4};
		
	}
	public int[] Intersection(int[] arr1,int[] arr2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int val = map.get(arr1[i]);
				map.put(arr1[i], val+1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i]) >0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}
		}
		int[] ans = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

}
