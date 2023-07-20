package lec55_03_06_23;

import java.util.*;

public class Dijkstra_Algo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}
	public class DijkstraPair{
		int vtx;
		String acqpath;
		int cost;
		
		DijkstraPair(int vtx,String acqpath,int cost){
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return this.vtx + " acquired " + this.acqpath + " ka through @ cost of " + this.cost; 
		}
	}
	public void DijkstraAlgo(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while(!pq.isEmpty()) {
			//1.remove
			DijkstraPair dp = pq.remove();
			//2.ignore
			if(visited.contains(dp.vtx)) {
				continue;
			}
			//3.visited
			visited.add(dp.vtx);
			//4.self work
			System.out.println(dp);
			//5.nbrs add
			for(int nbrs : map.get(dp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = dp.cost + map.get(dp.vtx).get(nbrs); // purani value dp.cost + map sa get kara H.M of the dp.vtx ka then ausma value get ki for nbrs ka liya
					DijkstraPair ndp = new DijkstraPair(nbrs,dp.acqpath + nbrs , cost);
					pq.add(ndp);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);

		pa.AddEdge(1, 2, 10);
		pa.AddEdge(2, 3, 4);
		pa.AddEdge(1, 4, 1);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 2);
		pa.AddEdge(5, 6, 7);
		pa.AddEdge(5, 7, 9);
		pa.AddEdge(6, 7, 1);
		pa.DijkstraAlgo(1);
	}
	

}
