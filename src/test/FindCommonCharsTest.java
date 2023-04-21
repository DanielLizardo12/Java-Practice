package test;

import challenges.FindCommonChars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Daniel
 * @Date 21/04/2023
 */

class FindCommonCharsTest {

    @Test
    public void testFindCommonCharsSmallInput() {
        List<String> result = FindCommonChars.commonChars(new String[]{"bella", "label", "roller"});
        Assertions.assertEquals("e", result.get(0));
        Assertions.assertEquals("l", result.get(1));
        Assertions.assertEquals("l", result.get(2));
    }

}