package ContestSolutions;
//not completed
public class BW_18_03_23_FindScoreofanArrayAfterMarkingAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,4,5,2};
		long ans = Score(nums);
		System.out.println(ans);
		
	}
	public static long Score(int[] nums) {
		int score = 0;
		boolean[] marked = new boolean[nums.length];
		int count = 0;
		while(count < nums.length) {
			int midx = Smallest(nums,marked);
			
			if(midx == 0) {
				marked[midx] = true;
				if(marked[midx] == false) {
					marked[midx + 1] = true;
					count += 2;
				}
				count += 1;
			}
			if(midx == nums.length-1) {
				marked[midx] = true;
				if(marked[midx-1] == false) {
					marked[midx-1] = true;
					count += 2;
				}
				count += 1;
			}
			marked[midx] = true;
			count++;
			if(marked[midx + 1] == false) {
				marked[midx + 1] = true;
				count++;
			}
			if(marked[midx -1] == false) {
				marked[midx - 1] = true;
				count++;
			}
			score = score + nums[midx];
		}
		return score;
	}
	public static int Smallest(int[] nums,boolean[] marked) {
		int min = Integer.MAX_VALUE;
		int idx = -1;
		for(int i=0;i<nums.length;i++) {
			if(marked[i] == false) {
				if(nums[i] < min) {
					min = nums[i];
					idx = i;
				}
			}
		}
		return idx;
	}
}
