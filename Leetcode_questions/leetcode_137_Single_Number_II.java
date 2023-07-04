package Leetcode_questions;

import java.util.*;

public class leetcode_137_Single_Number_II {
	
	//by HashMap
	class Solution {
	    public int singleNumber(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i],map.get(nums[i]) + 1);
	            }else{
	                map.put(nums[i],1);
	            }
	        }
	        Integer ans = null;
	        for(int key : map.keySet()){
	            if(map.get(key) == 1){
	                ans = key;
	            }
	        }
	        return ans;
	    }
	}
	
	
	//by bitmasking
	
}
