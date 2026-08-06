package linkedlist;


/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save head of even list to attach later

        while (even != null && even.next != null) {
            // Re-link odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Re-link even nodes
            even.next = odd.next;
            even = even.next;
        }
        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;
        return head;
    }
}
