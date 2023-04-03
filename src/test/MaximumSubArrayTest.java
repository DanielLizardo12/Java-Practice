package test;

import challenges.MaximumSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 03/04/2023
 */

class MaximumSubArrayTest {

    @Test
    public void testMaximumSubArray() {
        int[] ints = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, MaximumSubArray.maxSubArray(ints));
    }

    @Test
    public void testMaximumSubArrayOneElementArray() {
        int[] ints = new int[]{1};
        Assertions.assertEquals(1, MaximumSubArray.maxSubArray(ints));
    }

    @Test
    public void testMaximumSubArrayFullArrayIsSubArray() {
        int[] ints = new int[]{5, 4, -1, 7, 8};
        Assertions.assertEquals(23, MaximumSubArray.maxSubArray(ints));
    }
}