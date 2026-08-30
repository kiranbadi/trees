package linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @AfterEach
    void tearDown() {
        removeDuplicates = null;
    }

    @Test
    void deleteDuplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode result = removeDuplicates.deleteDuplicates(head);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertEquals(5, result.next.next.val);
        Assertions.assertNull(result.next.next.next);
    }
}