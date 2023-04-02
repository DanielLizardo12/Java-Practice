package test;

import challenges.FindTwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Daniel
 * @Date 01/04/2023
 */

class FindTwoSumTest {

    @Test
    public void testFindTwoSum() {
        int[] ints = new int[]{12, 8, 3, 1, -1};
        int[] result = FindTwoSum.findTwoSum(ints, 2);


        Assertions.assertEquals(2, result[0]);
        Assertions.assertEquals(4, result[1]);
    }

}