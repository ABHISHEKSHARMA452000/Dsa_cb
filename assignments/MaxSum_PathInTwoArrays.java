package assignments;

import java.util.Scanner;

public class MaxSum_PathInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] one = new int[n];
			int[] two = new int[m];
			
			for(int k=0;k<n;k++) {
				one[k]=sc.nextInt();
			}
			for(int j=0;j<m;j++) {
				two[j]=sc.nextInt();
			}
			MaxSum_PathTwoArray(one,two,n,m);
		}
	}
	public static void MaxSum_PathTwoArray(int[] one,int[] two,int n,int m) {
		
	}

}
