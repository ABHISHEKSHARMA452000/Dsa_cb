package Leetcode_questions;

import java.util.*;

public class leetcode_435_NonOverLapping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = {{1,2},{2,3},{3,4},{1,3}};
		sortBycol(arr,1);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		int ans = eraseOverlapIntervals(arr);
		System.out.println(ans);
	}

	public static int eraseOverlapIntervals(int[][] arr) {
		int activities = 1;
		int start  = arr[0][0];
		int end = arr[0][1];
		for(int i=1;i<arr.length;i++) {
			if(arr[i][0] >= end) {
				activities++;
				end = arr[i][1];
			}
		}
		return arr.length - activities;
	}
	public static void sortBycol(int[][] arr,int col) {
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[col] - o2[col];
			}
		});
	}
}
