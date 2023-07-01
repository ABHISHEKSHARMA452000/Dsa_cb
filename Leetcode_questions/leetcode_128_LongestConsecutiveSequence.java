package Leetcode_questions;

import java.util.*;

public class leetcode_128_LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4,11,7,5,9,8,1,16,20,21,15,13};
		
	}
	public int ConsecutiveSequence(int[] arr) {
		HashMap<Integer,Boolean> map =new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i] -1)) {
				map.put(arr[i],false);
			}else {
				map.put(arr[i], true);
			}
			if(map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1,false);
			}
		}
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])) {
				int count = 0;
				int val = arr[i];
				while(map.containsKey(val)) {
					count++;
					val++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}
