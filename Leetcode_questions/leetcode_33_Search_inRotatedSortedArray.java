package Leetcode_questions;

public class leetcode_33_Search_inRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,7,8,9,0,1,2,3,4};
		int tar = 3;
		int ans = search(arr,tar);
		System.out.println(ans);
	}
	public static int search(int[] nums, int target) {
	    int lo = 0;
	    int hi = nums.length - 1;
	    while(lo <= hi) {
	    	int mid = lo + (hi-lo)/2;
	    	if(nums[mid] == target) {
	    		return mid;
	    	}else if (nums[mid] >= nums[lo]) {//mid and lo are in same segment eg : 4,5,6,7,8,0,1,2 tar = 5
	    		if(target >= nums[lo] && target <= nums[mid]) { // mid 3 index arr[mid] = 7 now mere ko full check ki lo sa mid ma target hai ya nhi or kisi ma check nhi kar sakta sahi sa
	    			hi = mid-1;// lo to mid ma check ki possible target hai ya nhi if nhi toh ya postion discard kar sakta hu using lo = mid+1;
	    		}else {
	    			lo = mid+1;//isma front part discard hua
	    		}
	    	}else if(nums[mid] <= nums[lo]) {//different segment ma hai mid and lo eg: 6,7,8,9,0,1,2,3,4 tar = 3
	    		if(target >= nums[mid] && target <= nums[hi]) {//target bo greater hai then nums[mid] sa
	    			lo = mid+1;
	    		}else {
	    			hi = mid-1;//isma last part mid sa hi ka betch ka discard hua hai 
	    		}
	    	}
	    }
	    return -1;
    }
}
