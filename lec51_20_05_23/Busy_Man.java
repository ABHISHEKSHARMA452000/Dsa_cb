package lec51_20_05_23;

import java.util.*;
//activivties selection problem
public class Busy_Man {
	
	public static class Pair{
		int st;
		int et;
		public Pair(int st,int et) {
			this.st = st;
			this.et = et;
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Pair[] arr = new Pair[n];
			for (int i = 0; i < n; i++) {
				int st = sc.nextInt();
				int et = sc.nextInt();
				arr[i] = new Pair(st,et);//error aaya bcoze non static thi Pair class
			}
			Arrays.sort(arr,new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
					//this - other hua hai ya marks based hai
				}
			});
			int activities = 1;
			int end = arr[0].et;
			for (int i = 0; i < arr.length; i++) {
				if(end <= arr[i].st) {
					activities++;
					end = arr[i].et;
				}
			}
			System.out.println(activities);
		}
	}
	
}
