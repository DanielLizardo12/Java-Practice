package test;

import challenges.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * @author Daniel
 * @Date 27/03/2023
 */

class ReverseLinkedListTest {

    @Test
    public void testReverseLinkedListNull() {
        LinkedList<Integer> result = ReverseLinkedList.reverse(null);
        assertNull(result);
    }

    @Test
    public void testReverseLinkedListSingleNode() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        LinkedList<Integer> result = ReverseLinkedList.reverse(linkedList);

        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    @Test
    public void testReverseLinkedListFourElements() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        LinkedList<Integer> result = ReverseLinkedList.reverse(linkedList);

        assertEquals(4, result.size());
        assertEquals(4, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(1, result.get(3));
    }

}