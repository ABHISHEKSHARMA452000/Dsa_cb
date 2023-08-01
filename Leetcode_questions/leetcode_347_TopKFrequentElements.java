package Leetcode_questions;

import java.util.*;
//kth largest element and merge k sorted list ka dono ka milta sa question hai
public class leetcode_347_TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,2,3,3,3,3,5,5};
		int k = 2;//top 2 element batana  hai
		int[] ans = topKFrequent(arr,k);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] topKFrequent(int[] nums, int k) {
		//1.frequency map banaya 
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		//2.object pair bana ka priority set kar on the basis of freq
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.freq - o2.freq;
			}
		});
		
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		for (int i = 0; i < k; i++) {
			Pair p = new Pair(list.get(i), map.get(list.get(i)));
			pq.add(p);
		}
		for (int i = k; i < list.size(); i++) {
			if (map.get(list.get(i)) > pq.peek().freq) {
				Pair p = new Pair(list.get(i), map.get(list.get(i)));
				pq.remove();
				pq.add(p);
			}
		}
		int[] arr = new int[k];
		int i = 0;
		while (!pq.isEmpty()) {
			arr[i] = pq.peek().val;
			pq.remove();
			i++;
		}
		return arr;
	}

}
class Pair {
	int val;
	int freq;

	public Pair(int val, int freq) {
		this.val = val;
		this.freq = freq;
	}
}
