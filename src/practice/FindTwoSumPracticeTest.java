package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 12/03/2023
 */
class FindTwoSumPracticeTest {

    @Test
    public void testFindTwoSumFistTestCase() {
        int[] testCase = FindTwoSumPractice.findTwoSum(new int[]{2, 7}, 9);
        assertEquals(0, testCase[0]);
        assertEquals(1, testCase[1]);
    }

    @Test
    public void testFindTwoSumSecondTestCase() {
        int[] testCase = FindTwoSumPractice.findTwoSum(new int[]{2, 7, 3, -1, 4}, 2);
        assertEquals(2, testCase[0]);
        assertEquals(3, testCase[1]);
    }

    @Test
    public void testFindTwoSumThirdTestCase() {
        int[] testCase = FindTwoSumPractice.findTwoSum(new int[]{2, 7, 3, -1, 4}, 100);
        assertEquals(0, testCase.length);
    }

    @Test
    public void testFindTwoSumFourthTestCase() {
        int[] testCase = FindTwoSumPractice.findTwoSum(new int[]{25}, 25);
        assertEquals(0, testCase.length);
    }

    @Test
    public void testFindTwoSumFifthTestCase() {
        int[] testCase = FindTwoSumPractice.findTwoSum(new int[]{}, 10);
        assertEquals(0, testCase.length);
    }

}