package test;

import challenges.FindDuplicateNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 28/03/2023
 */

class FindDuplicateNumberTest {

    @Test
    public void testFindDuplicateEmptyArray() {
        assertEquals(-1, FindDuplicateNumber.findDuplicate(new int[]{}));
    }

    @Test
    public void testFindDuplicateOneElementArray() {
        assertEquals(-1, FindDuplicateNumber.findDuplicate(new int[]{1}));
    }

    @Test
    public void testFindDuplicateFistTest() {
        int[] ints = new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8};
        assertEquals(3, FindDuplicateNumber.findDuplicate(ints));
    }

    @Test
    public void testFindDuplicateSecondTest() {
        int[] ints = new int[]{7, 123, 343, 33, 21234, 456, 1, 0, -12, 7, 23, 11};
        assertEquals(7, FindDuplicateNumber.findDuplicate(ints));
    }

}