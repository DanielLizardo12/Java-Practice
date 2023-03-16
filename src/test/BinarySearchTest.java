package test;

import challenges.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 16/03/2023
 */

class BinarySearchTest {

    @Test
    public void testBinarySearchFistTest() {
        int[] ints = new int[]{2, 3, 7, 9, 11, 23, 37, 81, 87, 89};
        int result = BinarySearch.search(ints, 9);
        assertEquals(3, result);
    }

    @Test
    public void testBinarySearchSecondTest() {
        int[] ints = new int[]{2, 3, 15, 18, 99, 140, 222};
        int result = BinarySearch.search(ints, 80);
        assertEquals(-1, result);
    }

}