package test;

import challenges.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 22/03/2023
 */

class MergeSortTest {

    @Test
    public void testMergeSortFirstTest() {

        int[] result = MergeSort.mergeSort(new int[]{7, 3, 8, 5, 1, 9, 5});

        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(5, result[3]);
        assertEquals(7, result[4]);
        assertEquals(8, result[5]);
        assertEquals(9, result[6]);
    }

}