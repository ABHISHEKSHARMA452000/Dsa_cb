package Leetcode_questions;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode_646_MaxLengthOfPairChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{7,8},{4,5}};
		sort(arr,1);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		int count = 1;
		int[] pre = arr[0];
		for(int curr=1;curr<arr.length;curr++) {
			if(arr[curr][0] > pre[1]) {
				count++;
				pre = arr[curr];
			}
		}
		System.out.println(count);
	}
	public static void sort(int[][] arr,int col) {
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[col] - o2[col];
			}
		});
	}

}
