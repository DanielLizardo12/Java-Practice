package test;

import challenges.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 21/03/2023
 */
class SelectionSortTest {

    @Test
    public void testSelectionSortFirstTest() {
        int[] result = SelectionSort.selectionSort(new int[]{3, 2, 1});

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

}