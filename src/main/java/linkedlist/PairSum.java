package linkedlist;

/*
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

    For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.

The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.
 */

public class PairSum {

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Calculate the maximum twin sum
        int maxSum = 0;
        ListNode firstHalf = head;
        ListNode secondHalf = prev;

        while (secondHalf != null) {
            assert firstHalf != null;
            int currentSum = firstHalf.val + secondHalf.val;
            maxSum = Math.max(maxSum, currentSum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxSum;
    }
}
