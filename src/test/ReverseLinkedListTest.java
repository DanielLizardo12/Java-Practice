package test;

import challenges.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author Daniel
 * @Date 27/03/2023
 */

class ReverseLinkedListTest {

    @Test
    public void testReverseLinkedList() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> result = ReverseLinkedList.reverse(linkedList);
        
        assertEquals(0, result.size());

    }

}