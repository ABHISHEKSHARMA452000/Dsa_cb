package LeetcodeContests;

import java.util.Arrays;

public class MinTimeToRepairCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ranks = {4,3,2,1};
		int cars = 10;
		Arrays.sort(ranks);
		long ans = Repair(ranks,cars);
		System.out.println(ans);
	}
	public static long Repair(int[] ranks,int cars) {
		long lo = 0;
		long hi = ranks[ranks.length-1] *cars*cars;
		long ans = 0;
		while(lo<hi) {
			long mid = (lo+hi)/2;
			if(isitpossible(ranks,cars,mid) == true) {
				ans = mid;
				hi = mid-1;
			}else {
				lo = mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] ranks,int cars,long pans) {
		//int tm = ;
		int time = 0;
		int i=0;
		int rkh = 1;
		int trc = 0; //total car repaired
		int emr = 0;
		while(i<ranks.length) {
			if(ranks[i]*rkh*rkh <= pans) {
				rkh++;
				emr = rkh;
			}else {
				emr = 0;
				rkh = 0;
				i++;
			}
			trc += emr;
			if(trc >= cars) {
				return true;
			}
		}
		return false;
	}

}
