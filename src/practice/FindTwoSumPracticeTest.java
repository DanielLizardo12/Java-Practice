package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 12/03/2023
 */
class FindTwoSumPracticeTest {

    @Test
    public void testFindTwoSum() {
        int[] ints = FindTwoSumPractice.findTwoSum(new int[]{1, 2, 3}, 1);
        assertEquals(1, ints[0]);
    }

}