package test;

import challenges.SearchForRange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 18/03/2023
 */

class SearchForRangeTest {

    @Test
    public void testSearchRangeFistTest() {
        int[] ints = new int[]{1, 2, 3, 4, 5};
        int[] result = SearchForRange.searchRange(ints, 3);
        assertEquals(2, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testSearchRangeSecondTest() {
        int[] ints = new int[]{};
        int[] result = SearchForRange.searchRange(ints, 1);
        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }

    @Test
    public void testSearchRangeThirdTest() {
        int[] ints = new int[]{5, 7, 7, 8, 9};
        int[] result = SearchForRange.searchRange(ints, 7);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

}