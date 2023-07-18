package Leetcode_questions;

import java.util.*;

public class leetcode_169_MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(majorityElement(arr));
	}
	public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }
        //Set<Integer> key = map.keySet();
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int max = list.get(0);
        for(int i=1;i<list.size();i++){
            if(map.get(max) < map.get(list.get(i))){
                max = list.get(i);
            }
        }
        return max;
    }

}
