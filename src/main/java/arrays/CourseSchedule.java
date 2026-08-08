package arrays;

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

    For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return true if you can finish all courses. Otherwise, return false.



Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0. So it is possible.

Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.



Constraints:

    1 <= numCourses <= 2000
    0 <= prerequisites.length <= 5000
    prerequisites[i].length == 2
    0 <= ai, bi < numCourses
    All the pairs prerequisites[i] are unique.

 */

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph from prerequisites
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        // Create an array to track visited nodes
        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses];

        // Perform DFS for each course
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (hasCycle(graph, visited, onPath, i)) {
                    return false; // Cycle detected
                }
            }
        }

        return true; // No cycles detected, all courses can be finished
    }

    private boolean hasCycle(List<List<Integer>> graph, boolean[] visited, boolean[] onPath, int course) {
        visited[course] = true;
        onPath[course] = true;

        for (int neighbor : graph.get(course)) {
            if (!visited[neighbor]) {
                if (hasCycle(graph, visited, onPath, neighbor)) {
                    return true;
                }
            } else if (onPath[neighbor]) {
                return true; // Cycle detected
            }
        }

        onPath[course] = false;
        return false;
    }
}
