package lec60_24_06_23;

import java.util.*;

public class leetcode239_MaxInEveryWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int[] Max(int[] arr,int k) {
		//first k size ki window
		int[] max = new int[arr.length-k+1];
		Deque<Integer> dq = new LinkedList<>();
		for(int i=0;i<k;i++) {
			if(!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();//last sa remove
			}
			dq.add(i);//last ma add karaga
		}
		max[0] = arr[dq.getFirst()];
		int j=1;
		for(int i=k;i<arr.length;i++) {
			if(!dq.isEmpty() && dq.getFirst() <= i-k) {
				dq.remove();//unwanted element remove kar diya
			}
			if(!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();//last sa remove
			}
			dq.add(i);
			max[j] = arr[dq.getFirst()];
			j++;
		}
		return max;
	}

}
