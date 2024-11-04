package trees;

/*
https://www.geeksforgeeks.org/print-all-leaf-nodes-of-an-n-ary-tree-using-dfs/
Given an array edge[][2] where (edge[i][0], edge[i][1]) defines an edge in the n-ary tree, the task is to print all the leaf nodes of the given tree using.
 Approach: DFS can be used to traverse the complete tree. We will keep track of parent while traversing to avoid the visited node array. Initially for every node we can set a flag and if the node have at least one child (i.e. non-leaf node) then we will reset the flag. The nodes with no children are the leaf nodes.

 */

import objects.Node;

import java.util.HashMap;
import java.util.Map;

public class PrintLeadNodes {

    public void printLeafNodes(int[][] edges) {
        if (edges == null || edges.length == 0) {
            return;
        }

        // Create a map to store all nodes
        Map<Integer, Node> nodeMap = new HashMap<>();
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            nodeMap.putIfAbsent(parent, new Node(parent));
            nodeMap.putIfAbsent(child, new Node(child));
            nodeMap.get(parent).children.add(nodeMap.get(child));
        }

        // Assuming the root is the first node in the edges array
        Node root = nodeMap.get(edges[0][0]);
        printLeafNodesDFS(root);

    }

    private void printLeafNodesDFS(Node node) {
        if (node == null) {
            return;
        }

        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
            return;
        }

        for (Node child : node.children) {
            printLeafNodesDFS(child);
        }
    }
}
