package assignments;

import java.util.Scanner;

public class Arrays_BinearySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int item = sc.nextInt();
		System.out.println(Bineary_Search(arr,item));
 	}
	public static int Bineary_Search(int[] arr,int item) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid] == item) {
				return mid;
			}else if(arr[mid] < item) {
				//mid smaller hai item bada hai toh left side discard
				lo = mid+1;
			}else { //arr[mid] > item
				//mid bada hai and item choota hai mid sa toh right side discard ho jaya gi
				hi = mid-1;
			}
		}
		return -1;
	}

}
