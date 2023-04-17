package test;

import challenges.DigitSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 17/04/2023
 */

class DigitSumTest {

    @Test
    public void testDigitSum135() {
        String input = "11111222223";
        Assertions.assertEquals("135", DigitSum.digitSum(input, 3));
    }

}