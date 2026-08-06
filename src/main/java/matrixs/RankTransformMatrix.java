package matrixs;


/*
 * Given an m x n matrix, return a new matrix answer where answer[i][j] is the rank of matrix[i][j].
 * The rank is an integer that represents how large an element is compared to other elements.
 * The rank has the following rules:
 * The rank is an integer starting from 1.
 * If two elements p and q are in the same row or column, then:
 * If p < q then rank(p) < rank(q)
 * If p == q then rank(p) == rank(q)
 * If p > q then rank(p) > rank(q)
 * The rank should be as small as possible.
 */

import java.util.*;

public class RankTransformMatrix {

    public int[][] matrixRankTransform(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[m][n];

        TreeMap<Integer, List<int[]>> valueMap = new TreeMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                valueMap
                        .computeIfAbsent(matrix[i][j], k -> new ArrayList<>())
                        .add(new int[]{i, j});
            }
        }

        int[] rowRank = new int[m];
        int[] colRank = new int[n];

        for (int value : valueMap.keySet()) {
            List<int[]> cells = valueMap.get(value);

            UnionFind uf = new UnionFind(m + n);

            for (int[] cell : cells) {
                int row = cell[0];
                int col = cell[1];

                uf.union(row, col + m);
            }

            Map<Integer, List<int[]>> groups = new HashMap<>();

            for (int[] cell : cells) {
                int row = cell[0];
                int root = uf.find(row);

                groups
                        .computeIfAbsent(root, k -> new ArrayList<>())
                        .add(cell);
            }

            Map<Integer, Integer> groupRank = new HashMap<>();

            for (int root : groups.keySet()) {
                int rank = 1;

                for (int[] cell : groups.get(root)) {
                    int row = cell[0];
                    int col = cell[1];

                    rank = Math.max(rank, rowRank[row] + 1);
                    rank = Math.max(rank, colRank[col] + 1);
                }

                groupRank.put(root, rank);
            }

            for (int root : groups.keySet()) {
                int rank = groupRank.get(root);

                for (int[] cell : groups.get(root)) {
                    int row = cell[0];
                    int col = cell[1];

                    result[row][col] = rank;
                }
            }

            for (int root : groups.keySet()) {
                int rank = groupRank.get(root);

                for (int[] cell : groups.get(root)) {
                    int row = cell[0];
                    int col = cell[1];

                    rowRank[row] = Math.max(rowRank[row], rank);
                    colRank[col] = Math.max(colRank[col], rank);
                }
            }
        }
       System.out.println("Result: " + Arrays.deepToString(result));
        return result;
    }

    static class UnionFind {
        private final int[] parent;

        UnionFind(int size) {
            parent = new int[size];

            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);

            if (rootA != rootB) {
                parent[rootB] = rootA;
            }
        }
    }
}
