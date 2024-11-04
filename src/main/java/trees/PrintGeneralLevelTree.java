package trees;

/*
    * Print a general tree level by level
    * https://www.geeksforgeeks.org/generic-tree-level-order-traversal/
    * Given a generic tree, perform a Level order traversal and print all of its nodes
 */

import objects.Node;

import java.util.LinkedList;
import java.util.Queue;


public class PrintGeneralLevelTree {

    public void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n > 0) {
                Node p = q.peek();
                if(p != null){
                    q.remove();
                    System.out.print(p.data + " ");
                    q.addAll(p.children);
                    n--;
                }
            }
            System.out.println();
        }
    }
}
