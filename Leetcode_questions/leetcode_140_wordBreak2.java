package Leetcode_questions;

import java.util.*;

public class leetcode_140_wordBreak2 {
	class Solution {
	    public List<String> wordBreak(String s, List<String> dict) {
	        List<List<String>> l1 = new ArrayList<>();
	        List<String> l2 = new ArrayList<>();
	        HashMap<String,Boolean> map = new HashMap<>();
	        WB(dict,s,l1,l2,map);
	        //System.out.println(l1);
	        
	        for(int i=0;i<l1.size();i++){
	            String str = "";
	            List<String> list = l1.get(i);
	            //System.out.println(list);
	            for(int j=0;j<list.size();j++){
	                if(j==list.size()-1){
	                    str+=list.get(j);
	                }else{
	                    str += list.get(j) + " ";
	                }
	                //System.out.println(str);
	            }
	            // str.trim();
	            l2.add(str);
	        }
	        return l2;
	    }
	    public void WB(List<String> dict,String s,List<List<String>> l1,List<String> l2,HashMap<String,Boolean> map){
	        if(s.length() == 0){
	            l1.add(new ArrayList<>(l2));
	            //System.out.println(l2);
	            return;
	        }
	        for(int i=1;i<=s.length();i++){
	            String str = s.substring(0,i);
	            if(dict.contains(str)){
	                l2.add(str);
	                WB(dict,s.substring(i),l1,l2,map);
	                l2.remove(l2.size()-1);
	            }
	        }
	        
	    }
	}
}
