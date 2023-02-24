package assignments;

import java.util.Scanner;

public class Max_SumPathInArray {

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
			System.out.println(MaximumSumPath(one,two));
		}
		
		
	}
	public static int MaximumSumPath(int[] arr1,int[] arr2) {
		int i=0;
		int j=0;
		int sum1=0;
		int sum2=0;
		int ans = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] > arr2[j]) {
				sum2 = sum2 + arr2[j];
				j++;
			}else if(arr1[i] < arr2[j]) {
				sum1 = sum1 + arr1[i];
				i++;
			}else {
				ans += Math.max(sum1, sum2) + arr1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		while(j<arr2.length) {
			sum2 = sum2 + arr2[j];
			j++;
		}
		while(i<arr1.length) {
			sum1 = sum1 + arr1[i];
			i++;
		}
		ans += Math.max(sum1,sum2);
		return ans;
		
	}

}
