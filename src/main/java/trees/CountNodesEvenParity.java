package trees;

/*
https://www.geeksforgeeks.org/count-the-nodes-in-the-given-tree-whose-weight-is-even-parity/
Given a tree and the weights of all the nodes, the task is to count the number of nodes whose weights are even parity i.e. whether the count of set bits in them is even.
Approach: Perform dfs on the tree and for every node, check if its weight is even parity or not. If yes then increment count.

Steps to solve the problem:

     Initialize ans to 0.
     Define a function isEvenParity(x) that takes an integer x and returns true if the count of set bits in x is even and false otherwise.
     Define a function dfs(node, parent) that performs depth-first search on the graph.
     Within the dfs function:
        a. Check if the weight of the current node has even parity using the isEvenParity function. If it does, increment ans by 1.
        b. For each neighbor to of node in the graph, if it is not equal to the parent, recursively call dfs with to as the node and node as the parent.
    Return ans as the final result.


 */

import objects.Node;

public class CountNodesEvenParity {

    public int countEvenParity(Node root) {
        return dfs(root, null);
    }

    private int dfs(Node node, Node parent) {
        int ans = 0;
        if (isEvenParity(node.data)) {
            ans++;
        }
        for (Node child : node.children) {
            if (child != parent) {
                ans += dfs(child, node);
            }
        }
        return ans;
    }

    private boolean isEvenParity(int x) {
        int count = 0;
        while (x > 0) {
            count += x & 1;
            x >>= 1;
        }
        return count % 2 == 0;
    }
}
