package assignments;

import java.util.Scanner;

public class Recursion_SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ans=Subset(arr,0,"",0,target);
		System.out.println("\n" + ans);
		
	}
	public static int Subset(int[] arr,int idx,String ans,int sum,int tar) {
		if(idx == arr.length) {
			if(sum == tar) {
				System.out.print(ans + " ");
				return 1;
			}
			return 0;
		}
		int a2 = Subset(arr,idx+1,ans + arr[idx] + " ",sum + arr[idx],tar);
		int a1 = Subset(arr,idx+1,ans,sum,tar);
		
		return a1 + a2;
	}
}
