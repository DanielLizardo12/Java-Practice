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
    public void testDigitSumWithMultipleSubstrings() {
        String input = "11111222223";
        Assertions.assertEquals("135", DigitSum.digitSum(input, 3));
    }

    @Test
    public void testDigitSumWithEmptyString() {
        String input = "";
        Assertions.assertEquals("", DigitSum.digitSum(input, 3));
    }

    @Test
    public void testDigitSumWithKGreaterThanStringLength() {
        String input = "1234";
        Assertions.assertEquals("1234", DigitSum.digitSum(input, 5));
    }

    @Test
    public void testDigitSumWithKEqualsStringLength() {
        String input = "1234";
        Assertions.assertEquals("1234", DigitSum.digitSum(input, 4));
    }

    @Test
    public void testDigitSumWithSingleCharInput() {
        String input = "5";
        Assertions.assertEquals("5", DigitSum.digitSum(input, 3));
    }
}