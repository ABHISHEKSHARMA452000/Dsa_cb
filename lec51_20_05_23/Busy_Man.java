package lec51_20_05_23;

import java.util.*;
//activivties selection problem
public class Busy_Man {
	//static ka andar static hi use kar sakta hai non static ka object nhi bana ga static ma ausk class ko static karna padaga
	//if static main class ma nonstatic ka object bana na hai toh
	//non static ma non static ka object ban jata hai
	//static ma staitc ka object ban jata hai
	//non static class ka static ma object nhi ban ta
	//static ka non static ma dehkna padaga
	public static class Pair{// pair inner claas hai yaha par jiska pair static ma use karna hai so pair class ko static karna hi padaga
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
			//activity select problem
			int activities = 1;
			int end = arr[0].et;//first activity ka end time
			for (int i = 0; i < arr.length; i++) {
				if(end <= arr[i].st) { //if other activity ka start time greater hai previos activity ka end time sa toh activity kar lo and if intersect hua time to vo activity perform nhi kar sakta
					activities++;
					end = arr[i].et;
				}
			}
			System.out.println(activities);
		}
	}
	
}
