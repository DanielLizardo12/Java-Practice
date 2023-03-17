package test;

import challenges.SortedBinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 16/03/2023
 */
class SortedBinarySearchTest {

    @Test
    public void testBinarySearchFistTest() {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        int result = SortedBinarySearch.search(ints, 3);
        assertEquals(2, result);
    }

    @Test
    public void testBinarySearchSecondTest() {
        int[] ints = new int[]{6, 1, 2, 3, 4, 5};
        int result = SortedBinarySearch.search(ints, 3);
        assertEquals(3, result);
    }

    @Test
    public void testBinarySearchThirdTest() {
        int[] ints = new int[]{5, 6, 1, 2, 3, 4};
        int result = SortedBinarySearch.search(ints, 3);
        assertEquals(4, result);
    }

    @Test
    public void testBinarySearchFourthTest() {
        int[] ints = new int[]{4, 5, 6, 1, 2, 3};
        int result = SortedBinarySearch.search(ints, 3);
        assertEquals(5, result);
    }

    @Test
    public void testPalindromeFifthTest() {
        int[] ints = new int[]{3, 4, 5, 6, 1, 2};
        int result = SortedBinarySearch.search(ints, 3);
        assertEquals(0, result);
    }

    @Test
    public void testPalindromeSixthTest() {
        int[] ints = new int[]{2, 3, 4, 5, 6, 2};
        int result = SortedBinarySearch.search(ints, 3);
        assertEquals(1, result);
    }

    @Test
    public void testPalindromeSeventhTest() {
        int[] ints = new int[]{2, 3, 4, 5, 6, 2};
        int result = SortedBinarySearch.search(ints, 777);
        assertEquals(-1, result);
    }

}