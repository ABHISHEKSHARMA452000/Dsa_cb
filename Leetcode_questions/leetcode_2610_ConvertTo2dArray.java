package Leetcode_questions;

import java.util.*;

public class leetcode_2610_ConvertTo2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,1,2,3,1};
		List<List<Integer>> list =  findMatrix(nums);
//		List<List<Integer>> list = new ArrayList<>();
//		list.add(new ArrayList<>());
//        list.get(0).add(nums[0]);
		System.out.println(list);
		
	}
	public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(nums[0]);
        for(int i=1;i<nums.length;i++){
        	boolean flag = false;
        	for(int j=0;j<list.size();j++){ 
        		if(list.get(j).contains(nums[i]) == false) {      		
        			list.get(j).add(nums[i]);
        			flag = true;
        			break;
        		}
            }
        	if(flag == false) {
        		list.add(new ArrayList<>());
                list.get(list.size()-1).add(nums[i]);
        	}
        }
        return list;
    }

}
