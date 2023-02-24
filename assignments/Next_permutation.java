package assignments;

import java.util.Scanner;

public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Nextpermutation(arr);
		}
		
	}
	public static void Nextpermutation(int[] arr) {
		//step1
		int p=0;
		int q=0;
		int n=arr.length;
		for(int i=n-2;i>=0;i--) {
			if(arr[i] < arr[i+1]) {
				p=i;
				break;
			}
		}
		//step2
		for(int i=n-1;i > p;i--) { // is p sa bada number ehkna hai toh only p+1 tak dehk lo na 0 tak jana ka need nhi hai
			if(arr[i] >arr[p]) {
				q=i;
				break;
			}
		}
		if(p==0 && q == 0) {
			int[] ans = Reverse(arr,0,n-1);
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
		int[] ans =  Reverse(arr,p+1,n-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}
	public static int[] Reverse(int[] arr,int i,int j) {
		int left = i;
		int right = j;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

}
