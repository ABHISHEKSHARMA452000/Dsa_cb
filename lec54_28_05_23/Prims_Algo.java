package lec54_28_05_23;

import java.util.*;

import javax.swing.text.html.ParagraphView;

public class Prims_Algo {
	//datamember
	HashMap<Integer, HashMap<Integer, Integer>> map;
	//contructor of Prims_algo class ka jissa graph bananya
	public Prims_Algo(int v) {
		map = new HashMap<>();//map ma vertex and emtpy hashmap add kar diya hai
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
		@Override
		public String toString() {
			return this.vtx + " acquired " + this.acqvtx + " ka through @ cost of " + this.cost; 
		}
	}
	
	//prims algo
	public void PrimsAlgo() {
		int Totalcost = 0;
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				//pq hai min ma implemnted so is ma rank jasa ma opposite hota hai less number more priority phele out ho rahi hai
				return o1.cost - o2.cost;
			}
			
		});
		HashSet<Integer> visited = new HashSet<>();
		//there is no need of bft bcoze connected hoga grap so bfs sa kaam chal jayaga
		PrimsPair pp = new PrimsPair(1,1,0);
		//1 ko acquire kiya 1 ka through cost 1;
		pq.add(pp);
		while(!pq.isEmpty()) {
			//1.remove
			PrimsPair rp = pq.remove();
			//2.ignore
			if(visited.contains(rp.vtx)) {//if visited ma vtx hai toh continue kar do
				continue;
			}
			//3.visited
			visited.add(rp.vtx);
			//4.self work
			System.out.println(rp);
			Totalcost += rp.cost;
			//5.nbrs add karna
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {//if nbrs added nhi hai toh hi add karna hai visited ma
					int newcost = map.get(rp.vtx).get(nbrs);//map sa get kara particular vertex ka hashmap then get kiya aus H.M ma nbrs ka corresponding value
					PrimsPair np = new PrimsPair(nbrs,rp.vtx,newcost);
					pq.add(np);
				}
			}
		}
		System.out.println("Minimum cost of Spanning Tree " +  Totalcost);
	}
	public static void main(String[] args) {
		Prims_Algo g = new Prims_Algo(7);

		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.PrimsAlgo();
	}
//	public void prims() {
//		int Totalcost = 0;
//		HashSet<Integer> visited = new HashSet<>();
//		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
//
//			@Override
//			public int compare(PrimsPair o1,PrimsPair o2) {
//				// TODO Auto-generated method stub
//				return o1.cost-o2.cost;
//			}
//			
//		});
//		PrimsPair pp = new PrimsPair(1,1,0);
//		pq.add(pp);
//		while(!pq.isEmpty()) {
//			PrimsPair rp = pq.remove();
//			if(visited.contains(rp.vtx)) {
//				continue;
//			}
//			visited.add(rp.vtx);
//			System.out.println(rp);
//			Totalcost+=rp.cost;
//			for(int nbrs:map.get(rp.vtx).keySet()) {
//				if(!visited.contains(nbrs)) {
//					int newcost = map.get(rp.vtx).get(nbrs);
//					PrimsPair np = new PrimsPair(nbrs,rp.vtx,newcost);
//					pq.add(np);
//				}
//			}
//		}
//		System.out.println("min cost" + Totalcost);
//	}
}
