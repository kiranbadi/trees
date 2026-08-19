package arrays;

/*
Design a data structure that keeps track of the values in it and answers some queries regarding their mean, median, and mode.

Implement the StatisticsTracker class.

    StatisticsTracker(): Initialize the StatisticsTracker object with an empty array.
    void addNumber(int number): Add number to the data structure.
    void removeFirstAddedNumber(): Remove the earliest added number from the data structure.
    int getMean(): Return the floored mean of the numbers in the data structure.
    int getMedian(): Return the median of the numbers in the data structure.
    int getMode(): Return the mode of the numbers in the data structure. If there are multiple modes, return the smallest one.

Note:

    The mean of an array is the sum of all the values divided by the number of values in the array.
    The median of an array is the middle element of the array when it is sorted in non-decreasing order. If there are two choices for a median, the larger of the two values is taken.
    The mode of an array is the element that appears most often in the array.



Example 1:

Input:
["StatisticsTracker", "addNumber", "addNumber", "addNumber", "addNumber", "getMean", "getMedian", "getMode", "removeFirstAddedNumber", "getMode"]
[[], [4], [4], [2], [3], [], [], [], [], []]

Output:
[null, null, null, null, null, 3, 4, 4, null, 2]

Explanation
StatisticsTracker statisticsTracker = new StatisticsTracker();
statisticsTracker.addNumber(4); // The data structure now contains [4]
statisticsTracker.addNumber(4); // The data structure now contains [4, 4]
statisticsTracker.addNumber(2); // The data structure now contains [4, 4, 2]
statisticsTracker.addNumber(3); // The data structure now contains [4, 4, 2, 3]
statisticsTracker.getMean(); // return 3
statisticsTracker.getMedian(); // return 4
statisticsTracker.getMode(); // return 4
statisticsTracker.removeFirstAddedNumber(); // The data structure now contains [4, 2, 3]
statisticsTracker.getMode(); // return 2

Example 2:

Input:
["StatisticsTracker", "addNumber", "addNumber", "getMean", "removeFirstAddedNumber", "addNumber", "addNumber", "removeFirstAddedNumber", "getMedian", "addNumber", "getMode"]
[[], [9], [5], [], [], [5], [6], [], [], [8], []]

Output:
[null, null, null, 7, null, null, null, null, 6, null, 5]

Explanation
StatisticsTracker statisticsTracker = new StatisticsTracker();
statisticsTracker.addNumber(9); // The data structure now contains [9]
statisticsTracker.addNumber(5); // The data structure now contains [9, 5]
statisticsTracker.getMean(); // return 7
statisticsTracker.removeFirstAddedNumber(); // The data structure now contains [5]
statisticsTracker.addNumber(5); // The data structure now contains [5, 5]
statisticsTracker.addNumber(6); // The data structure now contains [5, 5, 6]
statisticsTracker.removeFirstAddedNumber(); // The data structure now contains [5, 6]
statisticsTracker.getMedian(); // return 6
statisticsTracker.addNumber(8); // The data structure now contains [5, 6, 8]
statisticsTracker.getMode(); // return 5



Constraints:

    1 <= number <= 109
    At most, 105 calls will be made to addNumber, removeFirstAddedNumber, getMean, getMedian, and getMode in total.
    removeFirstAddedNumber, getMean, getMedian, and getMode will be called only if there is at least one element in the data structure.

 */

import java.util.*;

public class ArrayStatisticsTracker {

    // Maintains insertion order for removeFirstAddedNumber()
    private final Queue<Integer> queue = new ArrayDeque<>();

    // Running sum for mean
    private long sum = 0;

    // Frequency of each number
    private final Map<Integer, Integer> frequency = new HashMap<>();

    /*
     * frequency -> sorted set of numbers having that frequency
     *
     * Example:
     * 1 -> [2, 3]
     * 2 -> [4]
     *
     * This lets us quickly find:
     * highest frequency + smallest number with that frequency.
     */
    private final TreeMap<Integer, TreeSet<Integer>> modeMap = new TreeMap<>();

    /*
     * Two multiset used for median.
     *
     * lower = smaller half
     * upper = larger half
     *
     * We maintain:
     * lowerSize = n / 2
     * upperSize = n - lowerSize
     *
     * Therefore upper.firstKey() is always the required median.
     */
    private final TreeMap<Integer, Integer> lower = new TreeMap<>();
    private final TreeMap<Integer, Integer> upper = new TreeMap<>();

    private int lowerSize = 0;
    private int upperSize = 0;

    public ArrayStatisticsTracker() {
    }

    // ------------------------------------------------
    // ADD
    // ------------------------------------------------

    public void addNumber(int number) {

        queue.offer(number);

        sum += number;

        // Update mode structures
        updateFrequency(number, 1);

        // Add to median structures
        if (upper.isEmpty() || number >= upper.firstKey()) {
            addToMap(upper, number);
            upperSize++;
        } else {
            addToMap(lower, number);
            lowerSize++;
        }

        rebalance();
    }

    // ------------------------------------------------
    // REMOVE EARLIEST
    // ------------------------------------------------

    public void removeFirstAddedNumber() {

        int number = queue.poll();

        sum -= number;

        // Update mode
        updateFrequency(number, -1);

        // Remove from median structures
        if (lower.containsKey(number)) {
            removeFromMap(lower, number);
            lowerSize--;
        } else {
            removeFromMap(upper, number);
            upperSize--;
        }

        rebalance();
    }

    // ------------------------------------------------
    // MEAN
    // ------------------------------------------------

    public int getMean() {
        return (int) (sum / queue.size());
    }

    // ------------------------------------------------
    // MEDIAN
    // ------------------------------------------------

    public int getMedian() {
        /*
         * upper always contains the larger half.
         *
         * Odd:
         * [2,3,4]
         *
         * lower = [2]
         * upper = [3,4]
         *
         * median = 3
         *
         * Even:
         * [2,3,4,5]
         *
         * lower = [2,3]
         * upper = [4,5]
         *
         * Problem says choose larger middle value = 4
         */
        return upper.firstKey();
    }

    // ------------------------------------------------
    // MODE
    // ------------------------------------------------

    public int getMode() {

        // Highest frequency
        Map.Entry<Integer, TreeSet<Integer>> entry =
                modeMap.lastEntry();

        // Smallest number having highest frequency
        return entry.getValue().first();
    }

    // =========================================================
    // FREQUENCY / MODE HELPERS
    // =========================================================

    private void updateFrequency(int number, int change) {

        int oldFrequency =
                frequency.getOrDefault(number, 0);

        // Remove from old frequency bucket
        if (oldFrequency > 0) {

            TreeSet<Integer> numbers =
                    modeMap.get(oldFrequency);

            numbers.remove(number);

            if (numbers.isEmpty()) {
                modeMap.remove(oldFrequency);
            }
        }

        int newFrequency =
                oldFrequency + change;

        if (newFrequency == 0) {

            frequency.remove(number);

        } else {

            frequency.put(number, newFrequency);

            modeMap
                    .computeIfAbsent(
                            newFrequency,
                            k -> new TreeSet<>())
                    .add(number);
        }
    }

    // =========================================================
    // MEDIAN HELPERS
    // =========================================================

    private void rebalance() {

        int totalSize =
                lowerSize + upperSize;

        /*
         * lower should contain n / 2 values
         *
         * upper contains the remaining values.
         */
        int targetLowerSize =
                totalSize / 2;

        // lower has too many elements
        while (lowerSize > targetLowerSize) {

            int value = lower.lastKey();

            removeFromMap(lower, value);
            lowerSize--;

            addToMap(upper, value);
            upperSize++;
        }

        // lower doesn't have enough elements
        while (lowerSize < targetLowerSize) {

            int value = upper.firstKey();

            removeFromMap(upper, value);
            upperSize--;

            addToMap(lower, value);
            lowerSize++;
        }
    }

    private void addToMap(
            TreeMap<Integer, Integer> map,
            int value) {

        map.put(
                value,
                map.getOrDefault(value, 0) + 1
        );
    }

    private void removeFromMap(
            TreeMap<Integer, Integer> map,
            int value) {

        int count = map.get(value);

        if (count == 1) {
            map.remove(value);
        } else {
            map.put(value, count - 1);
        }
    }
}
