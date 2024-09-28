package objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int x, TreeNode left, TreeNode right, TreeNode next) {
        val = x;
        this.left = left;
        this.right = right;
        this.next = next;
    }

}
