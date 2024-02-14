package graph;

import java.util.*;

public class GraphDFS {
	private int V;
	private LinkedList<Integer> adjList[];

	@SuppressWarnings("unchecked")
	public GraphDFS(int v) {
		this.V = v;
		this.adjList = new LinkedList[this.V];
		for (int i = 0; i < this.V; ++i) {
			this.adjList[i] = new LinkedList<Integer>();
		}
	}

	public int getVertexCount() {
		return this.V;
	}

	public boolean addEdge(int u, int v) {
		if (u > this.V || v > this.V)
			return false;
		adjList[u].add(v);
		return true;
	}

	public void dfsSearch(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		Iterator<Integer> iter = this.adjList[v].iterator();
		while (iter.hasNext()) {
			int vertex = iter.next();
			if (!visited[vertex])
				this.dfsSearch(vertex, visited);

		}
	}

	public static void main(String[] args) {
		GraphDFS graph = new GraphDFS(5);
//		int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 0 }, { 3, 2 }, { 2, 3 } };
		int[][] edges = { { 0, 2 }, { 0, 1 }, { 0, 3 }, { 1, 0 }, { 1, 3 }, { 2, 0 }, { 3, 0 }, { 3, 1 }, { 3, 4 },
				{ 4, 3 } };

		for (int[] edge : edges) {
			boolean res = graph.addEdge(edge[0], edge[1]);
			System.out.println("Edge: " + edge[0] + " --> " + edge[1] + " added " + (res ? "success" : "unsuccess"));
		}

		// DFS SEARCHING
		int vtxCount = graph.getVertexCount();
		for (int i = 0; i < vtxCount; i++) {
			System.out.println("DFS Search at vertex " + i + ": ");
			graph.dfsSearch(i, new boolean[vtxCount]);
			System.out.println();
		}
		
		

	}

}
