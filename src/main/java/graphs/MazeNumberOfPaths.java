package graphs;


/**
 * This class contains a method to calculate the number of paths in a maze.
 * A maze consists of n rooms numbered from 1 to n, and some rooms are connected by corridors. You are given a 2D integer array corridors where corridors[i] = [room1i, room2i] indicates that there is a corridor connecting room1i and room2i, allowing a person in the maze to go from room1i to room2i and vice versa.
 *
 * The designer of the maze wants to know how confusing the maze is. The confusion score of the maze is the number of different cycles of length 3.
 *
 *     For example, 1 → 2 → 3 → 1 is a cycle of length 3, but 1 → 2 → 3 → 4 and 1 → 2 → 3 → 2 → 1 are not.
 *
 * Two cycles are considered to be different if one or more of the rooms visited in the first cycle is not in the second cycle.
 *
 * Return the confusion score of the maze.
 */
public class MazeNumberOfPaths {

    public int numberOfPaths(int n, int[][] corridors) {
        // Create an adjacency matrix to represent the graph
        int[][] graph = new int[n + 1][n + 1];

        // Fill the adjacency matrix based on the corridors
        for (int[] corridor : corridors) {
            graph[corridor[0]][corridor[1]] = 1;
            graph[corridor[1]][corridor[0]] = 1;
        }

        // Count the number of cycles of length 3
        int count = 0;
        // Iterate through all combinations of three rooms
        for (int i = 1; i <= n; i++) {
            // For each pair of rooms (i, j), check if there is a corridor between them
            for (int j = i + 1; j <= n; j++) {
                // If there is a corridor between room i and room j, check for a third room k that connects back to room i
                if (graph[i][j] == 1) {
                    // Check for a third room k that connects back to room i
                    for (int k = j + 1; k <= n; k++) {
                        if (graph[j][k] == 1 && graph[k][i] == 1) {
                            // If there is a cycle of length 3, increment the count
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
