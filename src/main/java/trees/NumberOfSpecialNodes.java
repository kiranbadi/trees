package trees;

/*
https://www.geeksforgeeks.org/number-of-special-nodes-in-an-n-ary-tree/
Given an n-ary tree rooted at vertex 1. The tree has n vertices and n-1 edges. Each node has a value associated with it and tree is input in the form of adjacency list. The task is to find the number of special nodes in the tree. A node is special if the path from the root to the node consists of distinct value nodes.
 */

import java.util.HashSet;
import java.util.Vector;

public class NumberOfSpecialNodes {

    static int ans;
    void dfs(int[] val, Vector<Integer>[] adj, int v,
                    HashSet<Integer> values)
    {

        if (values.contains(val[v]))
            return;
        ans++;
        values.add(val[v]);
        for (int ele : adj[v])
        {
            dfs(val, adj, ele, values);
        }
        values.remove(val[v]);
    }
}
