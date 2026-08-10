package heaps;

/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

    -1: Your guess is higher than the number I picked (i.e. num > pick).
    1: Your guess is lower than the number I picked (i.e. num < pick).
    0: your guess is equal to the number I picked (i.e. num == pick).

Return the number that I picked.



Example 1:

Input: n = 10, pick = 6
Output: 6

Example 2:

Input: n = 1, pick = 1
Output: 1

Example 3:

Input: n = 2, pick = 1
Output: 1



Constraints:

    1 <= n <= 231 - 1
    1 <= pick <= n

 */

public class GuessGame {

    private final int pickedNumber;

    // Set the secret number when initializing the game
    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            int res = guess(mid);
            if (res == 0) {
                return mid; // Found the picked number
            } else if (res < 0) {
                right = mid - 1; // Guess is higher than the picked number
            } else {
                left = mid + 1; // Guess is lower than the picked number
            }
        }

        return -1; // This line should never be reached if the input is valid

    }

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */

    public int guess(int num) {
        return Integer.compare(pickedNumber, num); // Your guess is too high
    }

}
