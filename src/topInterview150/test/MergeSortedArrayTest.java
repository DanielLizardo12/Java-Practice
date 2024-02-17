package topInterview150.test;


import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import topInterview150.challenge.MergeSortedArray;

/**
 * MergeSortedArrayTest description.
 *
 * @author Daniel
 * @version 16/02/2024
 */
class MergeSortedArrayTest {

  @Test
  public void ex1() {
    var nums1 = new int[]{1,2,3,0,0,0};
    var m = 3;
    var nums2 = new int[]{2,5,6};
    var n = 3;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{1,2,2,3,5,6};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex2() {
    var nums1 = new int[]{1};
    var m = 1;
    var nums2 = new int[]{};
    var n = 0;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{1};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex3() {
    var nums1 = new int[]{0};
    var m = 0;
    var nums2 = new int[]{1};
    var n = 1;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{1};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex4() {
    var nums1 = new int[]{2,0};
    var m = 1;
    var nums2 = new int[]{1};
    var n = 1;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{1, 2};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex5() {
    var nums1 = new int[]{4,5,6,0,0,0};
    var m = 3;
    var nums2 = new int[]{1,2,3};
    var n = 3;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{1,2,3,4,5,6};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex6() {
    var nums1 = new int[]{-1,0,0,3,3,3,0,0,0};
    var m = 6;
    var nums2 = new int[]{1,2,2};
    var n = 3;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{-1,0,0,1,2,2,3,3,3};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex7() {
    var nums1 = new int[]{-1,3,0,0,0,0,0};
    var m = 2;
    var nums2 = new int[]{0,0,1,2,3};
    var n = 5;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{-1,0,0,1,2,3,3};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

  @Test
  public void ex8() {
    var nums1 = new int[]{-12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    var m = 1;
    var nums2 = new int[]{-49,-45,-42,-41,-40,-39,-39,-39,-38,-36,-34,-34,-33,-33,
        -32,-31,-29,-28,-26,-26,-24,-21,-20,-20,-18,-16,-16,-14,-11,-7,-6,-5,-4,-4,
        -3,-3,-2,-2,-1,0,0,0,2,2,6,7,7,8,10,10,13,13,15,15,16,17,17,19,19,20,20,20,
        21,21,22,22,24,24,25,26,27,29,30,30,30,35,36,36,36,37,39,40,41,42,45,46,46,
        46,47,48};
    var n = 90;

    var result = MergeSortedArray.merge(nums1, m, nums2, n);

    var expectedResult = new int[]{-49,-45,-42,-41,-40,-39,-39,-39,-38,-36,-34,-34,
        -33,-33,-32,-31,-29,-28,-26,-26,-24,-21,-20,-20,-18,-16,-16,-14,-12,-11,-7,
        -6,-5,-4,-4,-3,-3,-2,-2,-1,0,0,0,2,2,6,7,7,8,10,10,13,13,15,15,16,17,17,19,
        19,20,20,20,21,21,22,22,24,24,25,26,27,29,30,30,30,35,36,36,36,37,39,40,41,
        42,45,46,46,46,47,48};

    Assertions.assertArrayEquals(expectedResult, result, "Array is not equal");
  }

}