package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;
import static trees.NumberOfSpecialNodes.ans;

class NumberOfSpecialNodesTest {

    private NumberOfSpecialNodes numberOfSpecialNodes;

    @BeforeEach
    void setUp() {
        numberOfSpecialNodes = new NumberOfSpecialNodes();
    }

    @AfterEach
    void tearDown() {
        numberOfSpecialNodes = null;
    }

    @Test
    void dfs() {
        int[] val = { 0, 2, 1, 4, 3, 4, 8, 10, 2, 5, 1 };
        int n = val.length;

        Vector<Integer> []adj = new Vector[n];
        for(int i = 0; i < n ; i++)
        {
            adj[i] = new Vector<>();
        }
        adj[1].add(2);
        adj[1].add(3);
        adj[2].add(4);
        adj[2].add(5);
        adj[2].add(6);
        adj[3].add(7);
        adj[5].add(8);
        adj[5].add(9);
        adj[5].add(10);
        ans = 0;
        numberOfSpecialNodes.dfs(val, adj, 1, new HashSet<Integer>());
        System.out.print(ans);
    }
}