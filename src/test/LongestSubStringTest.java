package test;

import challenges.LongestSubString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 15/03/2023
 */

class LongestSubStringTest {

    @Test
    public void testLengthOfLongestSubStringFistTest() {
        int result = LongestSubString.lengthOfLongestSubString("pqbrstbuvwpvy");
        assertEquals(8, result);
    }

    @Test
    public void testLengthOfLongestSubStringSecondTest() {
        int result = LongestSubString.lengthOfLongestSubString("ppppp");
        assertEquals(1, result);
    }

    @Test
    public void testLengthOfLongestSubStringThirdTest() {
        int result = LongestSubString.lengthOfLongestSubString("abcbccd");
        assertEquals(3, result);
    }

    @Test
    public void testLengthOfLongestSubStringFourthTest() {
        int result = LongestSubString.lengthOfLongestSubString("pqbrstbuvwvxy");
        assertEquals(7, result);
    }

}