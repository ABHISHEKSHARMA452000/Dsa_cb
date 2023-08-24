package Leetcode_questions;

import java.util.*;

public class leetcode_1615_MaximumNetworkRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] roads = {{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};
		 //{{0,1},{0,3},{1,2},{1,3}};
		int n = 8;
		System.out.println(maximalNetworkRank(n,roads));
		
	}
	public static int maximalNetworkRank(int n, int[][] roads) {
		int ans = 0;
        HashMap<Integer,HashMap<Integer,Integer>> g = BuildGraph(roads,n);
        HashMap<Integer,HashSet<Integer>> visited = Visit(n);
        for(int v1=0;v1<n;v1++) {
        	for(int v2=0;v2<n;v2++) {
        		if(v1 == v2) {
        			continue;
        		}
        		if(!visited.get(v2).contains(v1) || !visited.get(v1).contains(v2)) {
        			int val = 0;
        			visited.get(v1).add(v2);
        			int v1edges = g.get(v1).size();
        			int v2edges = g.get(v2).size();
        			val = v1edges + v2edges;
        			if(g.get(v1).containsKey(v2)) {
        				val = val-1;
        			}
        			ans = Math.max(val, ans);
        		}
        	}
        }
        
        return ans;
    }
    public static HashMap<Integer,HashMap<Integer,Integer>> BuildGraph(int[][] roads,int n){
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int[] a:roads){
            int v1 = a[0];
            int v2 = a[1];
            map.get(v1).put(v2,0);
            map.get(v2).put(v1,0);
        }
        return map;
    }
    public static HashMap<Integer,HashSet<Integer>> Visit(int n){
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashSet<>());
        }
        return map;
    }

}

//class Solution {
//    public int maximalNetworkRank(int n, int[][] roads) {
//        int ans = 0;
//        HashMap<Integer,HashMap<Integer,Integer>> g = BuildGraph(roads,n);
//        //HashMap<Integer,HashSet<Integer>> visited = Visit(n);
//        for(int v1=0;v1<n;v1++) {
//        	for(int v2=v1+1;v2<n;v2++) {
//        		if(v1 == v2) {
//        			continue;
//        		}
//                int val = 0;
//        			//visited.get(v1).add(v2);
//        			int v1edges = g.get(v1).size();
//        			int v2edges = g.get(v2).size();
//        			val = v1edges + v2edges;
//        			if(g.get(v1).containsKey(v2)) {
//        				val = val-1;
//        			}
//        			ans = Math.max(val, ans);
//        		// if(!visited.get(v2).contains(v1) || !visited.get(v1).contains(v2)) {
//        		// 	
//        		// }
//        	}
//        }
//        
//        return ans;
//    }
//    public static HashMap<Integer,HashMap<Integer,Integer>> BuildGraph(int[][] roads,int n){
//        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(i,new HashMap<>());
//        }
//        for(int[] a:roads){
//            int v1 = a[0];
//            int v2 = a[1];
//            map.get(v1).put(v2,0);
//            map.get(v2).put(v1,0);
//        }
//        return map;
//    }
//    // public static HashMap<Integer,HashSet<Integer>> Visit(int n){
//    //     HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
//    //     for(int i=0;i<n;i++){
//    //         map.put(i,new HashSet<>());
//    //     }
//    //     return map;
//    // }
//}
