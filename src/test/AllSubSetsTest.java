package test;

import challenges.AllSubSets;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 13/03/2023
 */
class AllSubSetsTest {

    @Test
    public void testSubSetsFistTestCase() {
        List<List<Integer>> result = AllSubSets.subsets(new int[]{1, 2, 3});
        assertEquals(0, result.size());
    }
}