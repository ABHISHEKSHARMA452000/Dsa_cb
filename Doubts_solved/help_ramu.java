package Doubts_solved;

import java.util.Scanner;

public class help_ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int rn = sc.nextInt();
			int cn = sc.nextInt();
			int[] ride_rickshaw = new int[rn];
			int[] ride_cab = new int[cn];
			for(int i=0;i<ride_rickshaw.length;i++) {
				ride_rickshaw[i] = sc.nextInt();
			}
			for (int i = 0; i < ride_cab.length; i++) {
				ride_cab[i] = sc.nextInt();
			}
			t--;
		}
				
	}
	public static int MinCost(int[] ride_rickshaw,int[] ride_cab,int c1,int c2,int c3,int c4 ) {
		int cost_r = 0;
		int cost_c = 0;
		//for(int i=0;)
		return 0;
	}

}
