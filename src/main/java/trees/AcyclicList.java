package trees;

/*

https://www.geeksforgeeks.org/dfs-n-ary-tree-acyclic-graph-represented-adjacency-list/
A tree consisting of n nodes is given, we need to print its DFS. The tree is represented by an adjacency list. The tree is acyclic and connected.
 */

public class AcyclicList {


    public  void dfs(int root, int[] visited, int[][] edges) {
        visited[root] = 1;
        System.out.print(root + " ");
        for (int[] edge : edges) {
            if (edge[0] == root && visited[edge[1]] == 0) {
                dfs(edge[1], visited, edges);
            }
            if (edge[1] == root && visited[edge[0]] == 0) {
                dfs(edge[0], visited, edges);
            }
        }
    }
}
