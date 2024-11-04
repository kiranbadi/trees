package trees;

/*
https://www.geeksforgeeks.org/number-nodes-greater-given-value-n-ary-tree/#
Given a n-ary tree and a number x, find and return the number of nodes which are greater than x.
 */

import objects.Node;

public class NodesGreaterThanX {

    public int countNodesGreaterThanX(Node root, int x) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count++;
        }
        for (Node child : root.children) {
            count += countNodesGreaterThanX(child, x);
        }
        return count;
    }
}
