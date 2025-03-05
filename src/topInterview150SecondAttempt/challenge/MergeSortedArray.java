package topInterview150SecondAttempt.challenge;

import java.util.Arrays;

/**
 * MergeSortedArray description.
 *
 * @author Daniel
 * @version 04/03/2025
 */
public class MergeSortedArray {
  private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int firstArrayCounter = m - 1;
    int secondArrayCounter = n - 1;
    int newOrderArrayCounter = n + m - 1;

    if (m == 0) nums1[0] = nums2[0];

    while (newOrderArrayCounter >= 0) {
      if (firstArrayCounter >= 0 && secondArrayCounter >= 0) {

        if (nums1[firstArrayCounter] > nums2[secondArrayCounter]) {
          nums1[newOrderArrayCounter] = nums1[firstArrayCounter];
          firstArrayCounter--;
        } else {
          nums1[newOrderArrayCounter] = nums2[secondArrayCounter];
          secondArrayCounter--;
        }
      } else if (firstArrayCounter < 0) {
        nums1[newOrderArrayCounter] = nums2[secondArrayCounter];
        secondArrayCounter--;
      } else {
        nums1[newOrderArrayCounter] = nums1[firstArrayCounter];
        firstArrayCounter--;
      }
      newOrderArrayCounter--;
    }

    return nums1;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
    System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0)));
    System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1)));
    System.out.println(Arrays.toString(merge(new int[]{2,0}, 1, new int[]{1}, 1)));
  }

}
