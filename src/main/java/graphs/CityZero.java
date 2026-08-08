package graphs;

import java.util.ArrayList;
import java.util.List;

public class CityZero {

    // Helper class to store destination node and whether the edge is original or reversed
    private static class Edge {
        int neighbor;
        boolean isOriginal; // true if direction is original (from -> to), false if artificial

        Edge(int neighbor, boolean isOriginal) {
            this.neighbor = neighbor;
            this.isOriginal = isOriginal;
        }
    }

    public int minReorder(int n, int[][] connections) {
        // 1. Build Adjacency List
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            int u = connection[0];
            int v = connection[1];
            // Original direction u -> v (cost 1 if traversed from u to v outward from 0)
            adj.get(u).add(new Edge(v, true));
            // Artificial reverse direction v -> u (cost 0)
            adj.get(v).add(new Edge(u, false));
        }

        // 2. Run DFS starting from City 0
        boolean[] visited = new boolean[n];
        return dfs(0, adj, visited);
    }

    private int dfs(int node, List<List<Edge>> adj, boolean[] visited) {
        visited[node] = true;
        int reorderCount = 0;

        for (Edge edge : adj.get(node)) {
            if (!visited[edge.neighbor]) {
                // If the edge was originally pointing AWAY from 0, we must reverse it (+1)
                if (edge.isOriginal) {
                    reorderCount++;
                }
                reorderCount += dfs(edge.neighbor, adj, visited);
            }
        }

        return reorderCount;
    }
}