package objects;

import java.util.ArrayList;

public class Node {
    public int data;
    public ArrayList<Node> children;
    Node firstChild;
    Node nextSibling;
    public Node(int data)
    {
        this.data = data;
        this.children = new ArrayList<>();
    }
}
