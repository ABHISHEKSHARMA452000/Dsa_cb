package LeetcodeContests;

public class FindScoreofanArrayAfterMarkingAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,1,3,2};
		long ans = findScore(nums);
		System.out.println(ans);
	}
	public  static long findScore(int[] nums) {
		long score = 0;
        boolean[] marked = new boolean[nums.length];
        int count = 0;
        while(count < nums.length) {
        	int midx = Smallest(nums,marked);
            score = score + nums[midx];
            if(midx == 0) {
            	marked[midx] = true;
            	marked[midx +1] = true;
            	count = count+2;
            	break;
            }
            if(midx == nums.length-1) {
            	marked[midx] = true;
            	marked[midx-1] = true;
            	count = count+2;
            }
            marked[midx -1] = true;
            marked[midx] = true;
            marked[midx + 1] = true;
            count += 3;
        }
        return score;
    }
	public static int Smallest(int[] nums, boolean[] marked) {
		int minval = nums[0];
		int idx = 0;
		for(int i=1;i<nums.length;i++) {
			if(marked[i] == false) {
				if(nums[i] < minval) {
					minval = nums[i];
					idx = i;
				}
			}
		}
		return idx;
	}

}
