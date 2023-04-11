package LeetcodeContests;

public class TheNumberOfBeautifulSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6};
		int k = 2;
		int ans = Subset(arr,k,0,0,"");
		int ans2 = Subset(arr,k,0,arr[0]," ");
		System.out.println(ans +  ans2 -1);
	}
	public static int Subset(int[] nums,int k,int idx,int lastelement,String ans) {
		if(idx == nums.length) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		int a1 = Subset(nums,k,idx+1,lastelement,ans);
		int val = (int)Math.abs(lastelement - nums[idx]);
		if(val != k) {
			int a2 = Subset(nums,k,idx+1,nums[idx],ans+nums[idx]);
			count += a2;
		}
		return count +  a1;
	}

}
