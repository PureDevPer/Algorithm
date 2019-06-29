package BFS;

public class Main {

	public static void main(String[] args) {
		BreathFirstSearch BFS = new BreathFirstSearch(4);

		BFS.addEdge(0, 1);
		BFS.addEdge(0, 2);
		BFS.addEdge(1, 2);
		BFS.addEdge(2, 0);
		BFS.addEdge(2, 3);
		BFS.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal (Starting from vertex 2) ");

		BFS.BFSTraversal(2);
	}
}
