package LeetcodeContests;

public class BeautifulSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,6};
		int k = 2;
		int ans = Subset(nums,k,0,"",0);
		System.out.println(ans - 1);
	}
	public static int Subset(int[] nums,int k ,int idx,String ans,int lastelement) {
		if(idx == nums.length) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		
		int a1 = Subset(nums,k,idx+1,ans,lastelement);
		if(idx == 0 || Math.abs(lastelement-nums[idx]) != k && idx >= 1) {
			int a2 = Subset(nums,k,idx+1,ans+nums[idx],nums[idx]);
			count += a2;
		}
		return count + a1;
	}
}
