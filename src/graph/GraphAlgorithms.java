package graph;

import java.util.*;

public class GraphAlgorithms {
	private int V;
	private LinkedList<Integer> adjList[];

	@SuppressWarnings("unchecked")
	public GraphAlgorithms(int v) {
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

	public void bfsSearch(int v) {
		boolean[] visited = new boolean[this.V];
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(v);
		while (!que.isEmpty()) {
			int vtx = que.poll();
			if (visited[vtx])
				continue;
			visited[vtx] = true;
			System.out.print(vtx + " ");
			Iterator<Integer> itr = this.adjList[vtx].iterator();
			while (itr.hasNext())
				que.add(itr.next());
		}
	}

	public static void main(String[] args) {
		GraphAlgorithms graph = new GraphAlgorithms(5);
//		int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 0 }, { 3, 2 }, { 2, 3 } };
		int[][] edges = { { 0, 2 }, { 0, 1 }, { 0, 3 }, { 1, 0 }, { 1, 3 }, { 2, 0 }, { 3, 0 }, { 3, 1 }, { 3, 4 },
				{ 4, 3 } };

		for (int[] edge : edges) {
			boolean res = graph.addEdge(edge[0], edge[1]);
			System.out.println("Edge: " + edge[0] + " --> " + edge[1] + " added " + (res ? "success" : "unsuccess"));
		}

		int vtxCount = graph.getVertexCount();

		// DFS SEARCHING
		System.out.println("--------- DFS ----------");
		for (int i = 0; i < vtxCount; i++) {
			System.out.println("DFS Search at vertex " + i + ": ");
			graph.dfsSearch(i, new boolean[vtxCount]);
			System.out.println();
		}

		// BFS Searching
		System.out.println();
		System.out.println("--------- BFS -----------");
		for (int i = 0; i < vtxCount; i++) {
			System.out.println("BFS Search at vertex " + i + ": ");
			graph.bfsSearch(i);
			System.out.println();
		}

	}

}
