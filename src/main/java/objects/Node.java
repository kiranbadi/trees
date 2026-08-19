package objects;

import java.util.ArrayList;

public class Node {
    public int data;
    public ArrayList<Node> children;
    Node firstChild;
    Node nextSibling;
    Node parent;
    public int val;
    public Node left;
    public Node right;
    public Node(int data)
    {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


}
