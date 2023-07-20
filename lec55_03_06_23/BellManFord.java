package lec55_03_06_23;

import java.util.*;

public class BellManFord {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord(int v) {
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost); // v1->v2 edge hai ya
	}

	public class EdgeList {// v1->v2 cost ek edgelist object ma ma
		int v1;
		int v2;
		int cost;

		public EdgeList(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
	}

	public List<EdgeList> GetAllEdges() {
		List<EdgeList> ll = new ArrayList<>();// sara edges ki ek list bana raha hu
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				int cost = map.get(v1).get(v2);
				ll.add(new EdgeList(v1, v2, cost));
			}
		}
		return ll;
	}
	/* v1 --> sa v2 jana hai  main v2 hai then
	 * relax kasa kar rahi eg 2--> 5 cost 4
	 * 1-->5 ki old cost from arr sa eg:cost = 7
	 * 1-->2-->5 ki cost eg: 1-->2 ki cost 1
	 * new cost = 1-->2 ki cost  + 2-->5 ki cost == 1 + 4 = 5
	 * oldcost(7) > newcost(5);
	 * relax edge arr[5] ma 5 set hoga next
	 * 
	 */

	public void BellmanfordAlgo() {
		int v = map.size();
		List<EdgeList> ll = GetAllEdges();
		int[] arr = new int[v + 1];
		for (int i = 2; i <= v; i++) {
			arr[i] = 10000000;// overflow controlkarna ka liya
		}
		for (int i = 1; i <= v; i++) {
			// v-1 time to change propagate hoga in arr but if i==v ma change aaya mean -ve
			// wt cycle present hai then
			for (EdgeList eg : ll) {
				int v1 = eg.v1; // v1 = 1;
				int v2 = eg.v2; // v2 = 2;
				int oldcost = arr[v2];// 1 sa v2 tak ki arr ma cost hai
				int newcost = arr[v1] + eg.cost;
				if (i == v && oldcost > newcost) {
					System.out.println("-ve wt cycle hai ");
					return;
				}
				if (oldcost > newcost) {
					arr[v2] = newcost;
				}
//				if (i == v && arr[e.v2] > arr[e.v1] + e.cost) {
//					System.out.println("-ve wt ka cycle hai");
//					return;
//				}
//				if (arr[e.v2] > arr[e.v1] + e.cost) {
//					arr[e.v2] = arr[e.v1] + e.cost;
//				}
			}
		}

		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			System.out.println("v1 sa v" + i +" ki minimum-cost through single source shortest path  " + arr[i]);
		}
	}

	public static void main(String[] args) {
		BellManFord bfd = new BellManFord(5);
		bfd.addEdge(1, 2, 8);
		//bfd.addEdge(2, 5, -2);// ive wt cycle ka liya edge hai
		 bfd.addEdge(2, 5, 2);
		bfd.addEdge(5, 2, 1);
		bfd.addEdge(4, 5, 4);
		bfd.addEdge(3, 4, -3);
		bfd.addEdge(1, 3, 4);
		bfd.addEdge(1, 4, 5);
		bfd.BellmanfordAlgo();
	}

}
