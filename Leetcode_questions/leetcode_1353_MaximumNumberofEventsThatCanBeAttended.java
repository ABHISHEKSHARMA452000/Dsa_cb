package Leetcode_questions;

import java.util.*;
//not completed fully
public class leetcode_1353_MaximumNumberofEventsThatCanBeAttended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2},{2,3},{3,4},{1,1}};
		sortBycol(matrix,0,1);
//		for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++)
//                System.out.print(matrix[i][j] + " ");
//            System.out.println();
//        }
		int day = 1;
		int activity = 1;
		int PreviousActivityend = matrix[0][1];
		for(int i=1;i<matrix.length;i++) {
			if(matrix[i][0]<PreviousActivityend  && PreviousActivityend < matrix[i][1]) {
				activity++;
				PreviousActivityend = matrix[i][1];
			}
		}
		System.out.println(activity);
	}
	public static void sortBycol(int[][] arr,int si,int ei) {
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				//positive aaya toh swap karaga 
				if(o1[si] >o2[si]) { //marks jaisi sorting hai if arr[1] > arr[2] then swap karna hai bubble sort jaisa hai
					//start par sort kar in ascending ordee ma
					return o1[si] - o2[si];
				}else {
					//if start same hai toh end par sort kar ascending order ma
					return o1[ei] - o2[ei];
				} 
			}
		});
	}
}
