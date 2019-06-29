package BFS;

import java.util.Iterator;
import java.util.LinkedList;

public class BreathFirstSearch {
	private int V; // # of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists

	// Constructor
	public BreathFirstSearch(int v) {
		// TODO Auto-generated constructor stub
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<Integer>();
	}

	// Function to add an edge into the graph
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	// Pirnts BFS traversal from a given source s
	public void BFSTraversal(int s) {
		// Mark all the vertices as not visited (by default set as false)
		boolean visited[] = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If an adjacent has not been visited, then make it visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}
