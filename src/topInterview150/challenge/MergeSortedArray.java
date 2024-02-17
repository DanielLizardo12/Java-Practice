package topInterview150.challenge;


/**
 * MergeSortedArray description.
 *
 * @author Daniel
 * @version 16/02/2024
 */
public class MergeSortedArray {

  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }

    // If there are remaining elements in nums2, copy them to nums1
    while (j >= 0) {
      nums1[k--] = nums2[j--];
    }

    return nums1;
  }
}
