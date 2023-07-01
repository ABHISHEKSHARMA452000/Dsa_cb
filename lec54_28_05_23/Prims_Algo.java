package lec54_28_05_23;

import java.util.*;

public class Prims_Algo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public class PrimsPair{
		int vtx;
		int acqvtx;
		int cost;
		PrimsPair(int vtx,int acqvtx,int cost){
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}
	}
//	public void PrimsAlgo{
//		PriorityQueue<PrimsPair> pq = new PriorityQueue<>();
//		HashSet<Integer> visited = new HashSet<>();
//		pq.add(new PrimsPair(1, 1, 0));
//		while(!pq.isEmpty()) {
//			PrimsPair rp = pq.poll();
//			if(visited.contains(rp.vtx)) {
//				continue;
//			}
//			visited.add(rp.vtx);
//			System.out.println(rp);
//			for(int nbrs : map.get(rp.vtx).keySet()) {
//				if(!visited.contains(nbrs)) {
//					
//				}
//			}
//		}
//	}
}
