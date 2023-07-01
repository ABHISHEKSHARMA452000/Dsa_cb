package lec54_28_05_23;

import java.util.*;

public class leetcode_785_IsGraphBipartite {
	
	class Solution {
	    public boolean isBipartite(int[][] graph) {
	    	Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer,Integer> visited = new HashMap<>();
			for (int src =0;src<graph.length;src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				q.add(new BipartitePair(src,0));
				while (!q.isEmpty()) {
					// 1remove;
					BipartitePair rv = q.poll();
					// 2. ignore if already visited
					if (visited.containsKey(rv.vtx)) {
						if(visited.get(rv.vtx) != rv.lv) {
							return false;
						}
						continue;
					}
					// 3. visited mark karna
					visited.put(rv.vtx,rv.lv);
					
					// nbrs add karna jo hashset ma nhi
					for (int nbrs : graph[rv.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs,rv.lv +1));
						}
					}
				}
			}
			return true;
	    }
	}
	class BipartitePair{
		int vtx;
		int lv;
		public BipartitePair(int vtx,int lv) {
			this.vtx = vtx;
			this.lv = lv;
		}
	}
	
}
