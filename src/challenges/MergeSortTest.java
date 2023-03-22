package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 22/03/2023
 */

class MergeSortTest {

    @Test
    public void testMergeSortFirstTest() {
        int[] firstArray = new int[]{2, 5, 7};
        int[] secondArray = new int[]{1, 4, 6};

        int[] result = MergeSort.mergeSort(firstArray, secondArray);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(4, result[2]);
        assertEquals(5, result[3]);
        assertEquals(6, result[4]);
        assertEquals(7, result[5]);
    }

}