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
    public void testRemoveDuplicates () {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);

        LinkedList<Integer> result = RemoveDuplicatesLinkedList.removeDuplicates(linkedList);

        assertEquals(6, result.size());
    }

}