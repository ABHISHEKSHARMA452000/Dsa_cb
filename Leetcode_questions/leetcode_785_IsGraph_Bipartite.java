package Leetcode_questions;

import java.util.*;
//is question sa aap odd even length cyle par kasa kaam karna hai vo pata lagta hai
public class leetcode_785_IsGraph_Bipartite {
	
	class BipartitePair{
		int vtx;
		int lv;
		public BipartitePair(int vtx,int lv) {
			this.vtx = vtx;
			this.lv = lv;
		}
	}
	
	class Solution {
	    public boolean isBipartite(int[][] graph) {
	    	//input sa graph banaya hai
	        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
	        for(int i=0;i<graph.length;i++) {
	        	map.put(i, new HashMap<>());
	        }
	        for(int i=0;i<graph.length;i++) {
	        	for(int j=0;j<graph[i].length;j++) {
	        		map.get(i).put(graph[i][j], 0);	        		
	        	}
	        }
	        return IsBipartite(map);
	        
	    }
	    //bft sa use kar odd even length ka pata kara hai
	    public boolean IsBipartite(HashMap<Integer,HashMap<Integer,Integer>> map) {
	    	Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer,Integer> visited = new HashMap<>();//<vtx,lvl>
			for (int src : map.keySet()) {
				if (visited.containsKey(src)) {//ya vala componenet ka liya hai
					continue;
				}
				BipartitePair bp = new BipartitePair(src,0);
				q.add(bp);
				while (!q.isEmpty()) {
					// 1.remove
					BipartitePair rv = q.remove();
					// 2.ignore //ignore wala cyle ka liya hai
					if (visited.containsKey(rv.vtx)) {
						if(rv.lv != visited.get(rv.vtx)) {
							return false;//ya bata raha hai ki odd length ki cycle hai  toh direct vahi sa return kar do//even length a case ma toh aaga bhi graph ko check karna hoga ki kahi or toh odd length cycle nnhi
						}
						continue;
					}
					// 3.visited
					visited.put(rv.vtx,rv.lv);
					// 4.self work
					//System.out.print(rv + " ");
					// 5.nbrs add
					for (int nbrs : map.get(rv.vtx).keySet()) {
						if (!visited.containsKey(nbrs)) {
							BipartitePair nbp = new BipartitePair(nbrs,rv.lv + 1);
							q.add(nbp);
						}
					}
				}
			}
			return true;
	    }    
	}
	
}
