package Graph_Implementation;

import java.util.*;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
//		g.AddEdge(1, 4, 6);
//		g.AddEdge(1, 2, 10);
//		g.AddEdge(2, 3, 7);
//		g.AddEdge(3, 4, 5);
//		//g.AddEdge(4, 5, 1);
//		g.AddEdge(5, 6, 3);
//		g.AddEdge(7, 5, 2);
//		g.AddEdge(6, 7, 3);
		g.AddEdge(0, 1, 0);
		g.AddEdge(1, 2, 0);
		g.AddEdge(2, 0, 0);
		g.IsCyclic();
//		g.display();
		//System.out.println(g.haspath(1, 6, new HashSet<>()));
		//g.Allpath(1, 6, new HashSet<>(),"");
		//System.out.println(g.BFS(1, 6) + "->" + "BFS");
		//System.out.println(g.DFS(1, 6)+ "->" + "DFS");
		//g.BFT();
		//System.out.println(g.c);
		//System.out.println();
		//g.DFT();
		//System.out.println(g.IsConnected());
		//System.out.println(g.IsCyclic());
		
	}

}
