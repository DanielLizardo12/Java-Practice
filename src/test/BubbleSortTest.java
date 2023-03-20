package test;

import challenges.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 20/03/2023
 */

class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] result = BubbleSort.bubbleSort(new int[]{3, 2, 1});
        
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

}