package lec52_21_05_23;

import java.util.*;

public class leetcode_215_KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,1,2};
		int k=3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();//for min heap
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //max heap;
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if(arr[i] > pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		//return pq.peek()
		
	}
	//add
	//peek
	//remove
	
	
}
