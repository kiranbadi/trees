package graphs;

import java.util.List;

public class RoomsAndKeys {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        int visitedCount = dfs(0, rooms, visited);

        // If the number of visited rooms equals total rooms, return true
        return visitedCount == rooms.size();
    }

    private int dfs(int room, List<List<Integer>> rooms, boolean[] visited) {
        if (visited[room]) {
            return 0;
        }

        visited[room] = true;
        int count = 1; // Count current room

        for (int key : rooms.get(room)) {
            count += dfs(key, rooms, visited);
        }

        return count;
    }
}