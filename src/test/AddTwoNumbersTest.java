package test;

import challenges.AddTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 28/03/2023
 */

class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers.ListNode firstListNodeNext = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode firstListNode = new AddTwoNumbers.ListNode(8, firstListNodeNext);

        AddTwoNumbers.ListNode secondListNodeNext = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode secondListNode = new AddTwoNumbers.ListNode(8, secondListNodeNext);

        AddTwoNumbers.ListNode result = AddTwoNumbers.addTwoNumbers(firstListNode, secondListNode);

        assertEquals(6, result.val);
        assertEquals(9, result.next.val);
        assertEquals(1, result.next.next.val);

    }

}