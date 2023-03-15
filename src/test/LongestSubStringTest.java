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

}