package test;

import challenges.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 20/03/2023
 */
class InsertionSortTest {

    @Test
    public void testInsertionSortFirstTest() {
        int[] result = InsertionSort.insertionSort(new int[]{3, 2, 1});

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

    @Test
    public void testInsertionSortSecondTest() {
        int[] result = InsertionSort.insertionSort(new int[]{3, 2, 2, 3, 4, 5, 7, 7, 7, 1});

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
        assertEquals(3, result[4]);
        assertEquals(4, result[5]);
        assertEquals(5, result[6]);
        assertEquals(7, result[7]);
        assertEquals(7, result[8]);
        assertEquals(7, result[9]);
    }

    @Test
    public void testInsertionSortThirdTest() {
        int[] result = InsertionSort.insertionSort(new int[]{});

        assertEquals(0, result.length);
    }

    @Test
    public void testInsertionSortFourthTest() {
        int[] result = InsertionSort.insertionSort(new int[]{-100, 300, 342, 222, -123123, 1, -1, 8, 8, 0});

        assertEquals(-123123, result[0]);
        assertEquals(-100, result[1]);
        assertEquals(-1, result[2]);
        assertEquals(0, result[3]);
        assertEquals(1, result[4]);
        assertEquals(8, result[5]);
        assertEquals(8, result[6]);
        assertEquals(222, result[7]);
        assertEquals(300, result[8]);
        assertEquals(342, result[9]);
    }

}