package graphs;

/*
Breadth First Search (BFS) is a graph traversal algorithm that starts from a source node and explores the graph level by level. First, it visits all nodes directly adjacent to the source. Then, it moves on to visit the adjacent nodes of those nodes, and this process continues until all reachable nodes are visited.

    BFS is different from DFS in a way that closest vertices are visited before others. We mainly traverse vertices level by level.
    Popular graph algorithms like Dijkstra's shortest path, Kahn's Algorithm, and Prim's algorithm are based on BFS.
    BFS itself can be used to detect cycle in a directed and undirected graph, find shortest path in an unweighted graph and many more problems.
 */

import java.util.ArrayList;

public class BreadFirstSearch {

    public ArrayList<ArrayList<Integer>> findMinimumMoves(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> moves = new ArrayList<>();
            boolean[] visited = new boolean[n];
            bfs(graph, i, visited, moves);
            result.add(moves);
        }

        return result;
    }

    private void bfs(int[][] graph, int start, boolean[] visited, ArrayList<Integer> moves) {
        int n = graph.length;
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            moves.add(node);

            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
