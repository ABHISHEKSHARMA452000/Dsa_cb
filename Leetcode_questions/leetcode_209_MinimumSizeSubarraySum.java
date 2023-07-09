package Leetcode_questions;

public class leetcode_209_MinimumSizeSubarraySum {
//sliding window ka problem hai
	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		int tar = 7;
		//int len = MinLength(tar,arr);
	}
	public static int MinLength(int target,int[] arr) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int sum = 0;
		while(ei<arr.length) {
			//growing
			sum += arr[ei];
			//shrinking
			while(sum >= target) { //this can done many time in one same ei so need while loop
			    int len = ei -si + 1;
			    ans = Math.min(ans, len);
			    sum-=arr[si];
				si++;
			}
			//ans
			ei++;
		}
		return (ans != arr.length+1)?ans:0;
	}
	public int solution(int[] arr,int target) {
		int si = 0;
		int ei = 0;
		int sum = 0;
		int minlen = arr.length+1;
		while(ei<arr.length) {
			//growing
			sum += arr[ei];
			//shrinking
			while(sum >= target) {
			  int currlen = ei -si + 1;
				minlen = Math.min(minlen,currlen);
				sum -=arr[si];
				si++;
			}
			//ans
			ei++;
		}
		
		return (minlen != arr.length+1)? minlen:0;
	}
}






