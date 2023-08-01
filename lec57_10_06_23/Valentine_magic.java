package lec57_10_06_23;

import java.util.Arrays;

public class Valentine_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = {2,11,3};
		int[] girls = {5,7,3,2};
		Arrays.sort(boys);//needed bcoze min ko min ka saath pair banaya ja saka
		Arrays.sort(girls);
		System.out.println(Valentine(boys,girls,0,0));
		
	}
	public static int Valentine(int[] boys,int[] girls,int i,int j) {
		if(i==boys.length) {
			return 0;
		}
		if(j == girls.length) {
			return 1000000;//not INTEGER_MAX.VALUE  to avoid overflow
			//not return 0 bcoze it will not retun the min of both then dry run karo
		}
		
		int sel = Math.abs(boys[i]-girls[j]) + Valentine(boys,girls,i+1,j+1);
		int rej = Valentine(boys,girls,i,j+1);
		return Math.min(sel, rej);
	}

}
