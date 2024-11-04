package trees;

/*
https://www.geeksforgeeks.org/height-n-ary-tree-parent-array-given/
Height of n-ary tree if parent array is given
Given a parent array P, where P[i] indicates the parent of the ith node in the tree(assume parent of root node id indicated with -1). Find the height of the tree. */

public class HeightOfNArrayTree {

    public int height(int[] parent) {
        int n = parent.length;
        int[] depth = new int[n];
        int height = 0;
        for (int i = 0; i < n; i++) {
            if (depth[i] != 0) {
                continue;
            }
            int d = 0;
            for (int j = i; j != -1; j = parent[j]) {
                if (depth[j] != 0) {
                    d += depth[j];
                    break;
                }
                d++;
            }
            height = Math.max(height, d);
            for (int j = i; j != -1; j = parent[j]) {
                if (depth[j] != 0) {
                    break;
                }
                depth[j] = d--;
            }
        }
        return height;
    }
}
