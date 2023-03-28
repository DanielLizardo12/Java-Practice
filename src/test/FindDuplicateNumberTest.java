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
        assertEquals(0, FindDuplicateNumber.findDuplicate(new int[]{}));
    }

}