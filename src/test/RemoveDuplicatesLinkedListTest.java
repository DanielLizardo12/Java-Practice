package test;

import challenges.RemoveDuplicatesLinkedList;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 25/03/2023
 */

class RemoveDuplicatesLinkedListTest {

    @Test
    public void testRemoveDuplicates() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);

        LinkedList<Integer> result = RemoveDuplicatesLinkedList.removeDuplicates(linkedList);

        assertEquals(4, result.size());

        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
    }


    @Test
    public void testRemoveDuplicatesSecondTest() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(7);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(9);
        linkedList.add(10);

        LinkedList<Integer> result = RemoveDuplicatesLinkedList.removeDuplicates(linkedList);
        System.out.println(result);

        assertEquals(8, result.size());

        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
        assertEquals(5, result.get(2));
        assertEquals(6, result.get(3));
        assertEquals(7, result.get(4));
        assertEquals(8, result.get(5));
        assertEquals(9, result.get(6));
        assertEquals(10, result.get(7));
    }

}