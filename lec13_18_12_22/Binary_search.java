package lec13_18_12_22;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,7,8,9,10,11,13,14,18};
		int item = 13;
		System.out.println(search(arr,item));
	}
	public static int search(int[] arr,int item) {
		int lo=0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid] == item) {
				return mid;
			}else if( arr[mid] < item) {
				lo = mid+1;
			}else {
				hi = mid-1;
			}
		}
		return -1;
	}
}
