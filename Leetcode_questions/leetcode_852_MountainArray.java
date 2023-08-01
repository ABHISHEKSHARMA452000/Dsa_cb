package Leetcode_questions;

public class leetcode_852_MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,20,30,80,90,100,70,50,30,10};
		System.out.println(peakIndexInMountainArray(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid] < arr[mid+1]) {//arr[mid-1] < arr[mid] there is no need for this condition bcoze if mid sa mid+1 pa badi value hai tohmid tak ka element ki need hi nhi hai
				lo = mid+1;
			}else if(arr[mid-1] > arr[mid]) {//arr[mid] > arr[mid+1] there is no need bcoze if mid sa badi value mid-1 par hai means right side of mid vo sab mid-1 sa chooti value hai jiki need nhi hai
				hi = mid-1;
			}else if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
				ans = mid;
				break;
			}
		}
		return ans;
	}

}
