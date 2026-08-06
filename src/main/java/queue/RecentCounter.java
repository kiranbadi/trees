package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {

    private final Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        // 1. Add current timestamp to the queue
        queue.offer(t);

        // 2. Remove timestamps that fall outside the [t - 3000, t] window
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // 3. The queue size represents the total requests in the valid window
        return queue.size();
    }
}