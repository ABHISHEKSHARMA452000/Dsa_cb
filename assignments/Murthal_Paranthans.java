package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Paranthans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int Parantha = 10;
//		int noc = 4;
//		int[] arr = {1,2,3,4};
//		Arrays.sort(arr);
//		System.out.println(minimumtime(arr,Parantha));
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
	public static int MurthalParantha(int[] arr,int Parantha) {
		int lo = 0;
		int hi = (arr[arr.length-1]*(Parantha*(Parantha+1)))/2;
		int ans = 0; 
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(isitpossible(arr,mid,Parantha)) {
				ans = mid;
				hi = mid-1; //minimize 
			}else {
				lo = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] arr,int mid,int parantha) {
		int p=1; //banaya ga paratha
		int time = 0;
		int tp = 0; // total paratha bana diya 
		int i=0;
		while(i<arr.length) {
			if(time + p*arr[i] <= mid) {
				time += p*arr[i];
				p++;
				tp++;
			}else {
				p=1;
				i++;
				time = 0;
			}
			if(tp >= parantha) {
				return true;
			}
		}
		return false;
	}

}
