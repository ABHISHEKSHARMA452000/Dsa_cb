package Doubts_solved;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Paranthas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int L = sc.nextInt();
		int[] ranks = new int[L];
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = sc.nextInt();
		}
		Arrays.sort(ranks);
		int ans = MurthalParantha(ranks,P);
		System.out.println(ans);
	}
	public static int MurthalParantha(int[] ranks,int p) {
		int ans = 0;
		int lo = 0;
		int hi = (ranks[ranks.length-1]*(p*(p+1)))/2;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(ranks,mid,p) == true) {
				ans = mid;
				hi = mid -1;
			}else {
				lo = mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] ranks,int pans,int p) {
		int time = 0;
		int tp = 0; //total parnathas banaa hai
		int cp = 1; //current parnatha jo bana na start karaga har cook 1 sa 
		for(int i=0;i<ranks.length;) {
			if(time + ranks[i]*cp <= pans) {
				time = time + ranks[i]*cp;
				cp++;
				tp++;
			}else {
				cp = 1;
				time = 0;
				i++;
			}
			if(tp >= p) {
				return true;
			}
		}
		return false;
	}

}
