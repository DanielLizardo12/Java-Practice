package test;

import challenges.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 15/03/2023
 */
class GroupAnagramsTest {

    @Test
    public void testGroupAnagramsFistTest() {
        String[] input = {"arc", "abc", "car", "cat", "act", "acb", "atc"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        assertEquals(null, result);
    }

}