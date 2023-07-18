package Graph_Implementation;

import java.util.*;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ConstainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	public int NoofEdges() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;
	}

	public void Allpath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + src);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				Allpath(nbrs, des, visited, ans + src);
			}
		}
		visited.remove(src);
	}

	// Bfs use karta hai to check ki koi path src to destination exist karta hai ya
	// nhi
	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1.remove
			int rv = q.remove();
			// 2.ignore //if rv phele sa hi visited hai toh contine kar dena hai
			// ya graph ma cycle check ka liya bhi kaam aata hai if dubara mila toh yahi sa
			// true return kar diya hai
			if (visited.contains(rv)) {
				continue;
			}
			// 3.visited mark karna hoga
			visited.add(rv);
			// 4.word or selfwork
			if (rv == des) {
				return true;
			}
			// 5. Nbrs add karna hoga jo visited ma marked nhi hoga only of rv
			for (int nbrs : map.get(rv).keySet()) { // map.get(rv) sa hashmap mila of that vertex ka auspar keyset manva
													// liya
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;
	}

	// same kaam karta hai sa bfs ki path hai ya nhi search karka la raha hai
	public boolean DFS(int src, int des) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// 1. remove
			int rv = st.pop();
			// 2.ignore if rv already in visited ma hai toh continue karna hai
			if (visited.contains(rv)) {
				continue;
			}
			// 3. visited mark karna
			visited.add(rv);
			// 4.self-work
			if (rv == des) {
				return true;
			}
			// 5.nbrs add karna to visited bhi nhi hai only wahi
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
	}

	// BFT traversal karna hai in bfs manner
	// static int c = 0; componets ka liya try kara tha
	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1.remove
				int rv = q.remove();
				// 2.ignore
				if (visited.contains(rv)) {
					continue;
				}
				// 3.visited
				visited.add(rv);
				// 4.self work
				System.out.print(rv + " ");
				// 5.nbrs add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// 1. remove
				int rv = st.pop();
				// 2.ignore if rv already in visited ma hai toh continue karna hai
				if (visited.contains(rv)) {
					continue;
				}
				// 3. visited mark karna
				visited.add(rv);
				// 4.self-work
				System.err.print(rv + " ");
				// 5.nbrs add karna to visited bhi nhi hai only wahi
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
		}
	}

}
